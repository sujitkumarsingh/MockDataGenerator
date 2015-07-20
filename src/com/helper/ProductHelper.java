package com.helper;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ProductHelper {
	public enum ProductCategory {
		DEVICE_ACCESSORIES("Device Accessories"), 
		KINDLE("Kindle"), 
		BABY_PRODUCTS("Baby Products"), 
		BOOKS("Books"), 
		CAMERA_PHOTO("Camera & Photo"), 
		CELL_PHONES("Cell Phones"), 
		ELECTRONICS_ACCESSORIES("Electronics Accessories"), 
		HOME_GARDEN("Home & Garden"), 
		MUSIC("Music"), 
		MUSICAL_INSTRUMENTS("Musical Instruments"), 
		OFFICE_PRODUCTS("Office Products"), 
		OUTDOORS("Outdoors"), 
		PERSONAL_COMPUTERS("Personal Computers"), 
		SOFTWARE_COMPUTER_GAMES("Software & Computer Games"), 
		SPORTS("Sports"), 
		TOOLS_HOME_IMPROVEMENT("Tools & Home Improvement"), 
		TOYS_GAMES("Toys & Games"), 
		VIDEO_GAMES("Video Games & Video Game Consoles");
		private String value;

		private ProductCategory(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}

	}

	private static final List<String> DEVICE_ACCESSORIES = Arrays
			.asList("Device Accessories");
	private  static final List<String> KINDLE = Arrays.asList("Kindle");
	private  static final List<String> BABY_PRODUCTS = Arrays.asList("Nursery", "Feeding",
			"Gear");
	private  static final List<String> BOOKS = Arrays.asList("Books", "Calendars",
			"Card Decks", "Sheet Music", "Magazines", "Journals",
			"Other Publications");
	private  static final List<String> CAMERA_PHOTO = Arrays.asList("Cameras", "Camcorders",
			"Telescopes");
	private  static final List<String> CELL_PHONES = Arrays.asList("Phones");
	private  static final List<String> ELECTRONICS_ACCESSORIES = Arrays.asList("Audio",
			"Video", "Camera", "Photo", "Cell Phone", "Car Electronics",
			"Computer and Office Accessories");
	private  static final List<String> HOME_GARDEN = Arrays.asList("Kitchen", "Dining",
			"Pet Supplies", "Furniture", "Décor", "Bedding", "Bath", "Craft",
			"Hobby", "Home Appliances", "Storage", "Patio", "Lawn", "Garden",
			"Pool Supplies", "Landscaping", "Snow Removal", "Generators");
	private  static final List<String> MUSIC = Arrays.asList("CDs", "Cassettes", "Vinyl",
			"other sound recordings");
	private  static final List<String> MUSICAL_INSTRUMENTS = Arrays.asList("Guitars",
			"Orchestra", "Recording Equipment");
	private  static final List<String> OFFICE_PRODUCTS = Arrays.asList("Supplies",
			"Furniture", "Printers", "Calculators");
	private  static final List<String> OUTDOORS = Arrays.asList("Outdoor Gear",
			"Outdoor Sports Apparel", "Cycling", "Action Sports");
	private  static final List<String> PERSONAL_COMPUTERS = Arrays.asList("Desktops",
			"Laptops", "Drives", "Storage");
	private  static final List<String> SOFTWARE_COMPUTER_GAMES = Arrays.asList("Business",
			"Media Education", "Utility", "Security",
			"Children's Software and PC Games");
	private  static final List<String> SPORTS = Arrays.asList("Exercise & Fitness",
			"Hunting Accessories", "Team Sports", "Licensed/Fan Shop",
			"Athletic Apparel", "Boating & Fishing", "Game Room");
	private  static final List<String> TOOLS_HOME_IMPROVEMENT = Arrays.asList(
			"Hand & Power Tools", "Plumbing", "Electrical",
			"Building Materials", "Appliance Parts");
	private  static final List<String> TOYS_GAMES = Arrays.asList("Infant and Preschool",
			"Learning and Exploration Toys", "Ride-ons", "Action Figures",
			"Dolls", "Board Games", "Arts", "Crafts", "Hobbies", "Furniture");
	private  static final List<String> VIDEO_GAMES = Arrays.asList("Game Consoles",
			"Console Games", "Accessories");
	
	@SuppressWarnings("serial")
	private static final Map<ProductCategory, List<String>> productMaps = new HashMap<ProductCategory, List<String>>(){{
		put(ProductCategory.BABY_PRODUCTS, BABY_PRODUCTS);
		put(ProductCategory.BOOKS, BOOKS);
		put(ProductCategory.CAMERA_PHOTO, CAMERA_PHOTO);
		put(ProductCategory.CELL_PHONES, CELL_PHONES);
		put(ProductCategory.DEVICE_ACCESSORIES, DEVICE_ACCESSORIES);
		put(ProductCategory.ELECTRONICS_ACCESSORIES, ELECTRONICS_ACCESSORIES);
		put(ProductCategory.HOME_GARDEN, HOME_GARDEN);
		put(ProductCategory.KINDLE, KINDLE);
		put(ProductCategory.MUSIC, MUSIC);
		put(ProductCategory.MUSICAL_INSTRUMENTS, MUSICAL_INSTRUMENTS);
		put(ProductCategory.OFFICE_PRODUCTS, OFFICE_PRODUCTS);
		put(ProductCategory.OUTDOORS, OUTDOORS);
		put(ProductCategory.PERSONAL_COMPUTERS, PERSONAL_COMPUTERS);
		put(ProductCategory.SOFTWARE_COMPUTER_GAMES, SOFTWARE_COMPUTER_GAMES);
		put(ProductCategory.SPORTS, SPORTS);
		put(ProductCategory.TOOLS_HOME_IMPROVEMENT, TOOLS_HOME_IMPROVEMENT);
		put(ProductCategory.TOYS_GAMES, TOYS_GAMES);
		put(ProductCategory.VIDEO_GAMES, VIDEO_GAMES);
	}};
	
	public static String getProduct(ProductCategory category) {
		List<String> products = productMaps.get(category);
		int productIndex = new Random().nextInt(products.size());
		return products.get(productIndex);
	}
	
	public static ProductCategory getProductCategory() {
		int productCategoryIndex = new Random().nextInt(ProductCategory.values().length);
		return ProductCategory.values()[productCategoryIndex];
	}
}
