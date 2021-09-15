package com.company;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    Result rs = new Result();

    @Test
    void solve() {
        rs.solve(12.00, 20, 8);
        assertEquals(15, rs.getTotal());
    }
}