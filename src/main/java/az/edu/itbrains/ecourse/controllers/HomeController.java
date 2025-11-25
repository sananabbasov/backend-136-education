package az.edu.itbrains.ecourse.controllers;


import az.edu.itbrains.ecourse.dtos.feature.FeatureHomeDto;
import az.edu.itbrains.ecourse.services.BannerService;
import az.edu.itbrains.ecourse.services.FeatureLanguageService;
import az.edu.itbrains.ecourse.services.FeatureService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Locale;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final BannerService bannerService;
    private final FeatureLanguageService featureLanguageService;

    @GetMapping("/")
    public String index(@RequestParam(name = "lang", defaultValue = "en") String lang, Model model, Locale locale){
        List<FeatureHomeDto> featureHomeDtoList = featureLanguageService.getHomeFeature(lang);
        model.addAttribute("homeFeatures", featureHomeDtoList);
        model.addAttribute("homeBanner",bannerService.getHomeBanner(locale.getLanguage()));
        return "index.html";
    }

    @GetMapping("/about")
    public String about(){
        return "about.html";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact.html";
    }
}
