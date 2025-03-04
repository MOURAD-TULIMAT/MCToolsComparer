package com.mctc.toolsviewer.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mctc.toolsviewer.models.Armor;

@Controller
@RequestMapping("/armor")
public class armorController {
    private static final List<Armor> armor = new ArrayList<>();
    static
    {
        armor.add(new Armor(UUID.randomUUID(),"Chestplate",.8,2.0));
        armor.add(new Armor(UUID.randomUUID(),"Helmet",.8,2.0));
    }
    @GetMapping
    public String getAllArmor(Model model)
    {
        try {
            
            model.addAttribute("armor", armor);
            return "armor";
        } catch (Exception e) {
            return "";
        }
    }
}
