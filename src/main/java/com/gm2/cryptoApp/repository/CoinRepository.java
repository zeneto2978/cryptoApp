package com.gm2.cryptoApp.repository;

import com.gm2.cryptoApp.entity.Coin;
import org.springframework.jdbc.core.JdbcTemplate;

public class CoinRepository {

    private JdbcTemplate jdbcTemplate;

    public CoinRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public Coin insert (Coin coin) {
        jdbcTemplate.update(sql: "",)
    }


}
