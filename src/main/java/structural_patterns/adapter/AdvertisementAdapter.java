package structural_patterns.adapter;

public class AdvertisementAdapter extends Advertisement{
    private Ad ad;

    public AdvertisementAdapter(Ad ad) {
        this.ad = ad;
        this.title = ad.description.substring(0, 9);
        this.description = ad.description;
        this.price = ad.price;
        this.status = convertStatus(ad.status);
    }

    private AdvertisementStatus convertStatus(String status) {
        switch (status){
            case "new": return AdvertisementStatus.ACTIVATED;
            case "reviewed": return AdvertisementStatus.PUBLISHED;
            case "deleted": return AdvertisementStatus.DELETED;
            default: return AdvertisementStatus.DRAFT;
        }
    }

    @Override
    public void publish(){
        ad.publish();
    }

    @Override
    public void delete(){
        ad.delete();
    }

    @Override
    public void inactivate(){
        ad.delete();
    }

    @Override
    public void activate(){
        ad.publish();
    }
}
