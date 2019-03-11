package com.cy.demo1.jdbc;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wander on 2019/3/11.
 */
public class JdbcRoleTest {
    @Test
    public void getRoleCount() throws Exception {
        JdbcRole role = new JdbcRole();
        role.getRoleCount();

    }

}