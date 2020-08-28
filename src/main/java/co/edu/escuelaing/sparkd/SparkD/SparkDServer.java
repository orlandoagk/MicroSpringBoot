/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.sparkd.SparkD;

import co.edu.escuelaing.httpserver.HttpServer;

/**
 *
 * @author dnielben
 */
public class SparkDServer {
    
    public static void main(String[] args){
        HttpServer server = new HttpServer();
        server.start();
    }
    
}
