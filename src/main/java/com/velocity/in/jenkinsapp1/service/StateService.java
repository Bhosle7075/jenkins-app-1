package com.velocity.in.jenkinsapp1.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StateService {

    public Map<String,String> getIndianStatesWithCapital(){
        Map<String, String> stateCapitalMap = new HashMap<>();

        // Adding Indian states and capitals to the map
        stateCapitalMap.put("Andhra Pradesh", "Amaravati");
        stateCapitalMap.put("Arunachal Pradesh", "Itanagar");
        stateCapitalMap.put("Assam", "Dispur");
        stateCapitalMap.put("Bihar", "Patna");
        stateCapitalMap.put("Chhattisgarh", "Raipur");
        stateCapitalMap.put("Goa", "Panaji");
        stateCapitalMap.put("Gujarat", "Gandhinagar");
        stateCapitalMap.put("Haryana", "Chandigarh");
        stateCapitalMap.put("Himachal Pradesh", "Shimla");
        stateCapitalMap.put("Jharkhand", "Ranchi");
        stateCapitalMap.put("Karnataka", "Bengaluru");
        stateCapitalMap.put("Kerala", "Thiruvananthapuram");
        stateCapitalMap.put("Madhya Pradesh", "Bhopal");
        stateCapitalMap.put("Maharashtra", "Mumbai");
        stateCapitalMap.put("Manipur", "Imphal");
        stateCapitalMap.put("Meghalaya", "Shillong");
        stateCapitalMap.put("Mizoram", "Aizawl");
        stateCapitalMap.put("Nagaland", "Kohima");
        stateCapitalMap.put("Odisha", "Bhubaneswar");
        stateCapitalMap.put("Punjab", "Chandigarh");
        stateCapitalMap.put("Rajasthan", "Jaipur");
        stateCapitalMap.put("Sikkim", "Gangtok");
        stateCapitalMap.put("Tamil Nadu", "Chennai");
        stateCapitalMap.put("Telangana", "Hyderabad");
        stateCapitalMap.put("Tripura", "Agartala");
        stateCapitalMap.put("Uttar Pradesh", "Lucknow");
        stateCapitalMap.put("Uttarakhand", "Dehradun");
        stateCapitalMap.put("West Bengal", "Kolkata");
        stateCapitalMap.put("Andaman and Nicobar Islands", "Port Blair");
        stateCapitalMap.put("Chandigarh", "Chandigarh");
        stateCapitalMap.put("Dadra and Nagar Haveli and Daman and Diu", "Daman");
        stateCapitalMap.put("Lakshadweep", "Kavaratti");
        stateCapitalMap.put("Delhi", "New Delhi");
        stateCapitalMap.put("Puducherry", "Puducherry");

        return stateCapitalMap;
    }
}
