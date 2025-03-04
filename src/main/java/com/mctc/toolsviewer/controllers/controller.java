package com.mctc.toolsviewer.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mctc.toolsviewer.models.Tool;

@Controller
@RequestMapping("/tools")
public class controller {
    private static final List<Tool> tools = new ArrayList<>();
    static
    {
        tools.add(new Tool(1,"axe",.8,2.0));
        tools.add(new Tool(1,"pick axe",.8,2.0));
    }
    @GetMapping
    public String getAllTools(Model model)
    {
        try {
            
            model.addAttribute("tools", tools);
            return "tools";
        } catch (Exception e) {
            return "";
        }
    }
}
