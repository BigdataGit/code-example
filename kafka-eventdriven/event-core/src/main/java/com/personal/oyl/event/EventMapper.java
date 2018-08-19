package com.personal.oyl.event;

import java.util.List;

public interface EventMapper {
    void insert(Event event);
    
    List<Event> queryTopN(int n);
    
    void batchClean(List<Long> eventIds);
}
