package de.silvia.wetter.repository;

import de.silvia.wetter.model.WeatherData;
import org.springframework.stereotype.Repository;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class WeatherDataRepository {

    private Map<Integer, WeatherData> data = new HashMap<>();
    private int nextId = 0;

    public void create(WeatherData record){
        if(record.getId() == 0) {
            record.setId(nextId);
            nextId++;
        }
        data.put(record.getId(), record);
    }

    public WeatherData findById(int id){
        return data.get(id);
    }

    public Collection<WeatherData> findAll(){
        return data.values();
    }
}
