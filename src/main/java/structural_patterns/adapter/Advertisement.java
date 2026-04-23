package structural_patterns.adapter;

public class Advertisement {

    String description;
    Double price;
    String title;

    AdvertisementStatus status = AdvertisementStatus.DRAFT;

    public void publish() {
        System.out.println("adv publishing process...");
        status = AdvertisementStatus.PUBLISHED;
    }

    public void inactivate() {
        System.out.println("adv inactivating process...");
        status = AdvertisementStatus.INACTIVATED;
    }

    public void activate() {
        System.out.println("adv activating process...");
        status = AdvertisementStatus.ACTIVATED;
    }

    public void delete() {
        System.out.println("adv deleting process...");
        status = AdvertisementStatus.DELETED;
    }

    @Override
    public String toString() {
        return String.format("Advertisement=(%s, %s, %.2f, %s)",
                title,
                description,
                price,
                status);
    }
}
