package week9;

public class City {
    private String name;
    private String region;
    private String country;
    private int population;
    private Location location;

    public City(String name, String region, String country,
                int population, Location location) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.population = population;
        this.location = location;
    }
    @Override
    public String toString(){
        return this.country+","+this.name+","+this.region+
                ","+this.population+","+this.location.getLatitude()+
                ","+this.location.getLongitude();
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof City))
            return false;
        City other = (City) o;
        if(!this.name.equals(other.name)){
            return false;
        }
        if(!this.region.equals(other.region)){
            return false;
        }
        if(!this.country.equals(other.country)){
            return false;
        }
        if(this.population!=other.population){
            return false;
        }
        if(Math.abs(this.location.getLatitude()-other.location.getLatitude()) > .001){
            return false;
        }
        if(Math.abs(this.location.getLongitude()-other.location.getLongitude()) > .001){
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public int getPopulation() {
        return population;
    }

    public Location getLocation() {
        return location;
    }

    public static void main(String[] args) {
        City city1=new City("gotham","NY","us",1000000,
                new Location(8.67,5.309));
        City city2=new City("gotham","NY","us",1000000,
                new Location(8.67,5.309));
        City city3=new City("gotham2","NY","us",1000000,
                new Location(8.67,5.309));
        System.out.println(city1.equals(city2));
        System.out.println(city1.equals(city3));
    }
}
