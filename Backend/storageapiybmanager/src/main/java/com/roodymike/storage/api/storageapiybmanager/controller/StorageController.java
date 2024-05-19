package com.roodymike.storage.api.storageapiybmanager.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {
    @GetMapping("/test")
    public ResponseEntity<String> testResponse() throws InterruptedException {
        Thread.sleep(500);
        return ResponseEntity.ok("This is a test response");
    }
}
