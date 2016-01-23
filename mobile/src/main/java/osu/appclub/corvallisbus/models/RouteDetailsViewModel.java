package osu.appclub.corvallisbus.models;

/**
 * Created by rikkigibson on 1/16/16.
 * Represents data to be displayed in a row of the stop details table.
 */
public class RouteDetailsViewModel {
    public String routeName;
    public int routeColor;
    public String arrivalsSummary;
    public String scheduleSummary;

    public RouteDetailsViewModel(RouteArrivalsSummary arrivalsSummary, BusRoute route) {
        this.routeName = route.routeNo;
        this.routeColor = route.color;
        this.arrivalsSummary = arrivalsSummary.arrivalsSummary;
        this.scheduleSummary = arrivalsSummary.scheduleSummary;
    }
}