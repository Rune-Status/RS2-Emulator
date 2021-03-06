package org.hannes.locale;

import org.hannes.Main;

/**
 * Representin' dem locations
 * 
 * @author red
 *
 */
public class Location {

	/**
	 * The default location at which entities are created
	 */
	public static final Location DEFAULT_LOCATION = new Location(3094, 3107, 0);

	/**
	 * The default location at which entities are created
	 */
	public static final Location NULL_LOCATION = new Location(0, 0, 0);

	/**
	 * The x-value of this tile
	 */
	private int x;
	
	/**
	 * The y-value of this tile
	 */
	private int y;
	
	/**
	 * The z-value of this tile
	 */
	private int z;

	/**
	 * 
	 * @param location
	 */
	public Location(Location location) {
		this (location.x, location.y, location.z);
	}
	
	/**
	 * Create a new tile
	 * 
	 * @param x
	 * @param y
	 * @param z
	 */
	public Location(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	/**
	 * Create a new tile
	 * 
	 * @param x
	 * @param y
	 */
	public Location(int x, int y) {
		this (x, y, 0);
	}
	
	/**
	 * Transform this tile's location
	 * 
	 * @param x
	 * @param y
	 * @param z
	 */
	public void transform(int x, int y, int z) {
		this.x += x;
		this.y += y;
		this.z += z;
	}
	
	/**
	 * Sets the location to that of the given tile
	 * 
	 * @param location
	 */
	public void transform(Location location) {
		this.x = location.x;
		this.y = location.y;
		this.z = location.z;
	}
	
	/**
	 * Relocates this tile
	 * 
	 * @param x
	 * @param y
	 * @param z
	 */
	public void relocate(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getZ() {
		return z;
	}

	public Region region() {
		return Main.getRealm().get(this);
	}

	public String toString() {
		return "Location[" + x + "," + y + "," + z + "]";
	}

}