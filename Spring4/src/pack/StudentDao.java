package pack;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.dao.*;
public class StudentDao {
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	
	}	
	
	
	public int saveStudent(Student e){  
	    String query="insert into student values('"+e.getSid()+"','"+e.getSname()+"')";  
	    return jdbcTemplate.update(query);  
	}  
	public int updateStudent(Student e){  
	    String query="update Student set name='"+e.getSname()+"' where id='"+e.getSid()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	
	public int deleteStudent(Student e){  
	    String query="delete from Student where id='"+e.getSid()+"' ";  
	    return jdbcTemplate.update(query);  
	} 
	
	
	
	
}
