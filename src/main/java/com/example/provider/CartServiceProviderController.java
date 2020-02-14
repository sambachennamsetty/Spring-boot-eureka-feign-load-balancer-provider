package com.example.provider;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Cart;

@RestController
@RequestMapping("cart-provider")
public class CartServiceProviderController {

	@Value("${server.port}")
	private String port;

	@GetMapping("/info")
	public String getMsg() {
		return "Provider Port" + port;
	}

	@GetMapping("/data")
	public Cart getObj() {
		return new Cart(1234, "CRT001"+"PORT: "+port, 5432.45);
	}

	@GetMapping("/list")
	public List<Cart> getBulk() {
		return Arrays.asList(new Cart(1231, "CRT002"+"PORT: "+port, 234.45), new Cart(1231, "CRT003"+"PORT: "+port, 4532.56),
				new Cart(1231, "CRT004"+"PORT: "+port, 3656.63));
	}
}
