package api.app.repository;

import api.app.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    private final JdbcTemplate jdbc;
    public UserRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void addUser(User u) {
        jdbc.update("INSERT INTO `user` (name) VALUES (?)",  u.getName());
    }

    public List<User> getAll() {
        String sql = "SELECT * FROM `user`";
        RowMapper<User> userRowMapper = (r, _) -> {
            User rowObject = new User();
            rowObject.setId(r.getInt("id"));
            rowObject.setName(r.getString("name"));
            return rowObject;
        };
        return jdbc.query(sql, userRowMapper);
    }
}
