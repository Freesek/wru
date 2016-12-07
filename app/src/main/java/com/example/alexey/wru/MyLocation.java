package com.example.alexey.wru;

import android.content.Context;
import android.location.Location;

/**
 * Created by alexey on 06.12.16.
 */

public class MyLocation {
    Context cntx;

    public MyLocation(Context contx) {
        cntx = contx;
    }

    public Location getMyLocation() {
        boolean enabledOnly = true;     //Для получения списка всех ДОСТУПНЫХ провайдеров
        Location myLocation = null;
        return myLocation;
    }
}
