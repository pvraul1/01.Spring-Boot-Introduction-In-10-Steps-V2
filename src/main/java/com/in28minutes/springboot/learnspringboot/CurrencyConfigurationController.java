package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The course controller.
 *
 * @author architecture - pvraul1
 * @since 1.17
 * @version Jul 21, 2022 - 10:53:35 AM
 *
 */
@RestController
public class CurrencyConfigurationController {

    @Autowired
    private CurrencyServiceConfiguration configuration;

    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration retrieveCurrencyConfiguration() {
        return configuration;
    }

}
