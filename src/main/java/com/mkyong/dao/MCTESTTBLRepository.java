package com.mkyong.dao;

import com.mkyong.model.MCTESTTBL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MCTESTTBLRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<MCTESTTBL> findAll() {

        List<MCTESTTBL> result = jdbcTemplate.query(
                "SELECT * FROM MCDBUSER.MCTESTTBL where rownum <=10",
                (rs, rowNum) -> new MCTESTTBL(rs.getString("FIELD1"),
                        rs.getString("FIELD2"), rs.getInt("FIELD3"),
                        rs.getString("FIELD4"),
                        rs.getInt("FIELD5"),
                        rs.getString("FIELD6"),
                        rs.getInt("CREATE_TIMESTAMP"))
        );

        return result;

    }

}
