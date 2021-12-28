package fr.ensim.tp5.controller;

import fr.ensim.tp5.model.AddressResponse;
import fr.ensim.tp5.model.WeatherResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class MeteoController {

    private RestTemplate restTemplate;

    @PostMapping("/meteo")
    public String getMeteoGPS(@ModelAttribute("addresse") String addresse, Model model) {
        AddressResponse response = restTemplate.getForObject("https://api-adresse.data.gouv.fr/search/?q="
                        + addresse, AddressResponse.class);

        if(response.getFeatures().size() > 0) {
            float latitude = response.getFeatures().get(0).getGeometry().getCoordinates().get(1);
            float longitude = response.getFeatures().get(0).getGeometry().getCoordinates().get(0);

            WeatherResponse weatherResponse = restTemplate.getForObject("https://api.meteo-concept.com/api/ephemeride/0?token=4cc22e1f3ac6b769fe85d48562f2d3f082c319d2dd003d69f8903655c516f431&latlng="+latitude+","+longitude
                    ,WeatherResponse.class);
            model.addAttribute("adresse", addresse);
            model.addAttribute("lat", latitude);
            model.addAttribute("lon", longitude);
            model.addAttribute("min", weatherResponse.getForecast().get(0).getTmin());
            model.addAttribute("max", weatherResponse.getForecast().get(0).getTmax());
        }
        return "meteo";
    }
}
