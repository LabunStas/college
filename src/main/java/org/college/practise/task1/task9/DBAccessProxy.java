package org.college.practise.task1.task9;

import java.util.List;

public interface DBAccessProxy {
    List<String> executeQueryWithMetrics(String query);
    boolean executeUpdateWithMetrics(String query);
}
