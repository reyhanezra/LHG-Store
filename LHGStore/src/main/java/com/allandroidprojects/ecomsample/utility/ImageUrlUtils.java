package com.allandroidprojects.ecomsample.utility;

import java.util.ArrayList;

/**
 * Created by 06peng on 2015/6/24.
 */
public class ImageUrlUtils {
    static ArrayList<String> wishlistImageUri = new ArrayList<>();
    static ArrayList<String> cartListImageUri = new ArrayList<>();

    public static String[] getImageUrls() {
        String[] urls = new String[]{
                "https://goo.gl/x9C9zJ",
                "https://goo.gl/x9C9zJ",
                "https://goo.gl/x9C9zJ",
                "https://goo.gl/x9C9zJ",
                "https://goo.gl/x9C9zJ",
                "https://goo.gl/x9C9zJ",
                "https://goo.gl/x9C9zJ",
                "https://goo.gl/x9C9zJ",
        };
        return urls;
    }

    public static String[] getOffersUrls() {
        String[] urls = new String[]{
                "https://goo.gl/WUD8Cj",
                "https://goo.gl/iWcLtq",
                "https://goo.gl/KjW6MP",
                "https://goo.gl/gg9XTE",
                "https://goo.gl/eueCLf",
                "https://goo.gl/tBfi3X",
                "https://goo.gl/gVpBZ2",
                "https://goo.gl/mR5Yiu"
        };
        return urls;
    }

    public static String[] getCSGOurls() {
        String[] urls = new String[]{
                "https://goo.gl/VtmoFB",
                "https://goo.gl/iWcLtq",
                "https://goo.gl/4w8cvv",
                "https://goo.gl/ESiFA4",
                "https://goo.gl/KNT9no",
                "https://goo.gl/HBNqSh",
                "https://goo.gl/KNhbhu",
                "https://goo.gl/YcQ64T"
        };
        return urls;
    }

    public static String[] getDotaUrls() {
        String[] urls = new String[]{
                "https://goo.gl/WUD8Cj",
                "https://goo.gl/TyBJ3e",
                "https://goo.gl/mR5Yiu",
                "https://goo.gl/CZb16S",
                "https://goo.gl/fxWqrb",
                "https://goo.gl/MTYfjZ",
                "https://goo.gl/rSfkqq",
                "https://goo.gl/Ds4ns9"
        };
        return urls;
    }

    public static String[] getLOLurls() {
        String[] urls = new String[]{
                "https://goo.gl/KjW6MP",
                "https://goo.gl/gg9XTE",
                "https://goo.gl/tFn9HK",
                "https://goo.gl/AB2q7g",
                "https://goo.gl/w9GsF2",
                "https://goo.gl/zBLLBt",
                "https://goo.gl/8SLff5",
                "https://goo.gl/D9CnVm"
        };
        return urls;
    }

    public static String[] getPBUrls() {
        String[] urls = new String[]{
                "https://goo.gl/eueCLf",
                "https://goo.gl/tBfi3X",
                "https://goo.gl/gVpBZ2",
                "https://goo.gl/9W11zD",
                "https://goo.gl/gCHUqx",
                "https://goo.gl/3r4yDE",
                "https://goo.gl/7kaZaS",
                "https://goo.gl/DVwm5r"
        };
        return urls;
    }

    // Methods for Wishlist
    public void addWishlistImageUri(String wishlistImageUri) {
        ImageUrlUtils.wishlistImageUri.add(0, wishlistImageUri);
    }

    public void removeWishlistImageUri(int position) {
        wishlistImageUri.remove(position);
    }

    public ArrayList<String> getWishlistImageUri() {
        return wishlistImageUri;
    }

    // Methods for Cart
    public void addCartListImageUri(String wishlistImageUri) {
        cartListImageUri.add(0, wishlistImageUri);
    }

    public void removeCartListImageUri(int position) {
        cartListImageUri.remove(position);
    }

    public ArrayList<String> getCartListImageUri() {
        return cartListImageUri;
    }
}
