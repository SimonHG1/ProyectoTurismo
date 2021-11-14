package trpServiceEspecificacion;

import java.sql.ResultSet;
import java.sql.SQLException;


public interface RowMapper<C> {

	C mapRow(ResultSet rs) throws SQLException;

}
