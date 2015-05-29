import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class RequeteSQL {

	String username = "lo17xxx";
	String password = "dblo17";
	String url = "jdbc:postgresql://tuxa.sme.utc/dblo17";
	String nom;
	int nbre;

	String requete;
	Connection con;
	ResultSet rs;
	Statement stmt;
	String[] columns;
	
	public RequeteSQL(String sql) throws SQLException {
		requete = sql;
		con = DriverManager.getConnection(url, username, password);
		stmt = con.createStatement();
		// Send the query and bind to the result set
		rs = stmt.executeQuery(requete);
		ResultSetMetaData rsmd = rs.getMetaData();
		columns = new String[rsmd.getColumnCount()];

		// The column count starts from 1
		for (int i = 0; i < columns.length; i++ ) {
		  columns[i] = rsmd.getColumnName(i+1);
		}
	}
	
	public String getOutputString() {
		try {
			String s=columns[0];
			for (int i = 1; i < columns.length; i++) {
				s += "\t" + columns[i];//rs.getString("rubrique");
			}
			s+="\n";
			
			while (rs.next()) {
				
				s += rs.getObject(columns[0]);//rs.getString("fichier");
				for (int i = 1; i < columns.length; i++) {
					s += "\t" + rs.getObject(columns[i]);//rs.getString("rubrique");
				}
				s+="\n";
			}
			return s;
		} catch (SQLException e) {
			// TODO Bloc catch généré automatiquement
			e.printStackTrace();
		}
		return null;
	}
	
	public void close() {
		try {
			stmt.close();
			con.close();
		} catch (SQLException ex) {				
			System.err.println("==> SQLException: ");
			while (ex != null) {
				System.out.println("Message:   " + ex.getMessage());
				System.out.println("SQLState:  " + ex.getSQLState());
				System.out.println("ErrorCode: " + ex.getErrorCode());
				ex = ex.getNextException();
				System.out.println("");
			}
		}

	}
}
