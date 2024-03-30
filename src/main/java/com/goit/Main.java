package com.goit;

import com.goit.dao.ClientCrudService;
import com.goit.dao.PlanetCrudService;
import com.goit.entity.Client;
import com.goit.entity.Planet;
import com.goit.utils.FlywayRunner;

public class Main {
    public static void main(String[] args) {
        FlywayRunner.flywayMigration();
    }
}
