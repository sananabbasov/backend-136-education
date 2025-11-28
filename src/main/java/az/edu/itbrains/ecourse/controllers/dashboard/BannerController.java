package az.edu.itbrains.ecourse.controllers.dashboard;

import az.edu.itbrains.ecourse.dtos.banner.BannerCreateDto;
import az.edu.itbrains.ecourse.dtos.banner.BannerHomeDto;
import az.edu.itbrains.ecourse.dtos.banner.BannerUpdateDto;
import az.edu.itbrains.ecourse.services.BannerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BannerController {

    private final BannerService bannerService;

    @GetMapping("/admin/banner")
    public String getBannerPage(Model model){
        BannerHomeDto bannerHomeDto = bannerService.getHomeBanner("az");
        model.addAttribute("banner",bannerHomeDto);
        return "dashboard/banner/index.html";
    }

    @GetMapping("/admin/banner/create")
    public String createBanner(){
        return "dashboard/banner/create.html";
    }

    @PostMapping("/admin/banner/create")
    public String createBanner(BannerCreateDto bannerCreateDto){

        boolean result = bannerService.createBanner(bannerCreateDto);

        return "redirect:/admin/banner";
    }

    @GetMapping("/admin/banner/update/{id}")
    public String editBanner(@PathVariable Long id, Model model){
        BannerUpdateDto bannerUpdateDto = bannerService.getUpdatedBanner(id);
        model.addAttribute("banner",bannerUpdateDto);
        return "dashboard/banner/update.html";
    }


    @PostMapping("/admin/banner/update/{id}")
    public String editBanner(@PathVariable Long id, BannerUpdateDto bannerUpdateDto){
        boolean result = bannerService.updateBanner(id, bannerUpdateDto);
        return "redirect:/admin/banner";
    }



}
