package com.app.restaurant.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.restaurant.entity.MenuEntity;
import com.app.restaurant.repository.MenuRepository;
import com.app.restaurant.request.SaveMenuRequest;
import com.app.restaurant.response.GetMenuResponse;
import com.app.restaurant.response.MenuResponse;
import com.app.restaurant.response.SaveMenuResponse;

@Service
public class GetMenuService {

	@Autowired
	private MenuRepository menuRepository;

	public GetMenuResponse getMenus() {
		List<MenuEntity> all = menuRepository.findAll();
		List<MenuResponse> menuList = new ArrayList<>();

		for (MenuEntity entity : all) {
			MenuResponse resp = new MenuResponse();
			BeanUtils.copyProperties(entity, resp);
			menuList.add(resp);
		}

		GetMenuResponse getMenuResponse = new GetMenuResponse();
		getMenuResponse.setMenuList(menuList);
		return getMenuResponse;
	}
	
	public GetMenuResponse getActiveMenu() {
		List<MenuEntity> all = menuRepository.findAll();
		List<MenuResponse> menuList = new ArrayList<>();

		for (MenuEntity entity : all) {
			if ("A".equals(entity.getStatus())) {
				MenuResponse resp = new MenuResponse();
				BeanUtils.copyProperties(entity, resp);
				menuList.add(resp);
			}
		}

		GetMenuResponse getMenuResponse = new GetMenuResponse();
		getMenuResponse.setMenuList(menuList);
		return getMenuResponse;
	}

	public MenuResponse getMenu(int id) {
		Optional<MenuEntity> menu = menuRepository.findById(id);

		MenuResponse response = new MenuResponse();
		if (menu.isPresent()) {
			BeanUtils.copyProperties(menu.get(), response);
		}

		return response;
	}

	public SaveMenuResponse saveMenu(SaveMenuRequest request) {
		MenuEntity entity = new MenuEntity();
		BeanUtils.copyProperties(request, entity);
		MenuEntity menu = menuRepository.save(entity);

		SaveMenuResponse resp = new SaveMenuResponse();
		resp.setMenuId(menu.getMenuId());
		return resp;

	}
	
	public MenuResponse setActiveMenu(int id) {
		MenuResponse response = new MenuResponse();
		// get MenuEntity by ID
		Optional<MenuEntity> menu = 
				menuRepository.findById(id);
		
		if (menu.isPresent()) {
			MenuEntity menuEntity = menu.get();
			menuEntity.setStatus("A");
			MenuEntity newValue = 
					menuRepository.save(menuEntity);
//			BeanUtils.copyProperties(newValue, response);
			response.setDescription(newValue.getDescription());
			response.setImages(newValue.getImages());
			response.setMenuId(newValue.getMenuId());
			response.setName(newValue.getName());
			response.setPrice(newValue.getPrice());
			response.setTypes(newValue.getTypes());
			response.setStatus(newValue.getStatus());
		} else {
			return response;
		}
		return response;
	}
	
	public MenuResponse setInActiveMenu(int id) {
		MenuResponse response = new MenuResponse();
		// get MenuEntity by ID
		Optional<MenuEntity> menu = 
				menuRepository.findById(id);
		
		if (menu.isPresent()) {
			MenuEntity menuEntity = menu.get();
			menuEntity.setStatus("I");
			MenuEntity newValue = 
					menuRepository.save(menuEntity);
//			BeanUtils.copyProperties(newValue, response);
			response.setDescription(newValue.getDescription());
			response.setImages(newValue.getImages());
			response.setMenuId(newValue.getMenuId());
			response.setName(newValue.getName());
			response.setPrice(newValue.getPrice());
			response.setTypes(newValue.getTypes());
			response.setStatus(newValue.getStatus());
		} else {
			return response;
		}
		return response;
	}
}




