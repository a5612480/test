package cn.it.dao.DaoImpl;

import cn.it.dao.Dao;
import cn.it.domain.User;
import cn.it.util.Utils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class DaoImpl implements Dao {
    //先获取连接池对象
    private JdbcTemplate template = new JdbcTemplate(Utils.getDataSource());
    @Override
    public List<User> findAll() {
        //使用JDBC操作数据库
        //1.定义sql
        String sql = "select * from user";
        List<User> users = template.query(sql, new BeanPropertyRowMapper<User>(User.class));

        return users;
    }
}
