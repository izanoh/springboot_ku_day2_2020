package com.app.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.restaurant.request.SaveMenuRequest;
import com.app.restaurant.response.GetMenuResponse;
import com.app.restaurant.response.MenuResponse;
import com.app.restaurant.response.SaveMenuResponse;
import com.app.restaurant.service.GetMenuService;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private GetMenuService getMenuService;

    @GetMapping(value = "/getMenu")
    public ResponseEntity<GetMenuResponse> getMenu() {
        GetMenuResponse menu = getMenuService.getMenus();
        return ResponseEntity.ok(menu);
    }
    
    @GetMapping(value = "/getActiveMenu")
    public ResponseEntity<GetMenuResponse> getActiveMenu() {
        GetMenuResponse menu = 
        		getMenuService.getActiveMenu();
        return ResponseEntity.ok(menu);
    }
    
    @GetMapping(value = "/getMenu/{id}")
    public ResponseEntity<MenuResponse> getMenuById(@PathVariable("id") int id) {
        MenuResponse menu = getMenuService.getMenu(id);
        return ResponseEntity.ok(menu);
    }
    
    @PostMapping(value = "/save")
    public ResponseEntity<SaveMenuResponse> saveMenu(@RequestBody SaveMenuRequest request) {
    	SaveMenuResponse resp = getMenuService.saveMenu(request);
        return ResponseEntity.ok(resp);
    }
    
    @GetMapping(value = "/setActiveMenu/{id}")
    public ResponseEntity<MenuResponse> setActiveMenu(
    		@PathVariable("id") int id) {
        MenuResponse menu = getMenuService.setActiveMenu(id);
        return ResponseEntity.ok(menu);
    }
    
    @GetMapping(value = "/setInActiveMenu/{id}")
    public ResponseEntity<MenuResponse> setInActiveMenu(
    		@PathVariable("id") int id) {
        MenuResponse menu = getMenuService.setInActiveMenu(id);
        return ResponseEntity.ok(menu);
    }
}
