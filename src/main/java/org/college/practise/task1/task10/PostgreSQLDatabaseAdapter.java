package org.college.practise.task1.task10;

public class PostgreSQLDatabaseAdapter implements DatabaseAdapter {
    @Override
    public void executeQuery(String query) {
        System.out.println("Executing PostgreSQL query: " + query);
    }

    @Override
    public String fetchResults() {
        return "PostgreSQL Results";
    }
}