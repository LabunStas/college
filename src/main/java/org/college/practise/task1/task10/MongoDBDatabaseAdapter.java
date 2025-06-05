package org.college.practise.task1.task10;

public class MongoDBDatabaseAdapter implements DatabaseAdapter {
    @Override
    public void executeQuery(String query) {
        System.out.println("Executing MongoDB query: " + query);
    }

    @Override
    public String fetchResults() {
        return "MongoDB Results";
    }
}