$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("gear.feature");
formatter.feature({
  "line": 2,
  "name": "Gear Test",
  "description": "As A user i want to add products successfull to shopping cart",
  "id": "gear-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 3515626400,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should be able to add products to shopping cart",
  "description": "",
  "id": "gear-test;user-should-be-able-to-add-products-to-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I mouse hover on gear menu",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on bags",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on product name Overnight Duffle",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I verify the text overnight Duffle",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I change qty 3",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I verify text You added Overnight Duffle to your shopping cart",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I click and shopping cart message",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I verify product price $135.00",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I change Qty to 5",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on update shopping cart button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I verify the product price $225.00",
  "keyword": "Then "
});
formatter.match({
  "location": "WomenTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 61796100,
  "status": "passed"
});
formatter.match({
  "location": "GearTestSteps.iMouseHoverOnGearMenu()"
});
formatter.result({
  "duration": 1028384300,
  "status": "passed"
});
formatter.match({
  "location": "GearTestSteps.iClickOnBags()"
});
formatter.result({
  "duration": 1020026400,
  "status": "passed"
});
formatter.match({
  "location": "GearTestSteps.iClickOnProductNameOvernightDuffle()"
});
formatter.result({
  "duration": 1138899500,
  "status": "passed"
});
formatter.match({
  "location": "GearTestSteps.iVerifyTheTextOvernightDuffle()"
});
formatter.result({
  "duration": 115621400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 13
    }
  ],
  "location": "GearTestSteps.iChangeQty(int)"
});
formatter.result({
  "duration": 207256200,
  "status": "passed"
});
formatter.match({
  "location": "GearTestSteps.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 96830900,
  "status": "passed"
});
formatter.match({
  "location": "GearTestSteps.iVerifyTextYouAddedOvernightDuffleToYourShoppingCart()"
});
formatter.result({
  "duration": 1587978500,
  "status": "passed"
});
formatter.match({
  "location": "GearTestSteps.iClickAndShoppingCartMessage()"
});
formatter.result({
  "duration": 1452134200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "135",
      "offset": 24
    },
    {
      "val": "00",
      "offset": 28
    }
  ],
  "location": "GearTestSteps.iVerifyProductPrice$(int,int)"
});
formatter.result({
  "duration": 96365300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 16
    }
  ],
  "location": "GearTestSteps.iChangeQtyTo(int)"
});
formatter.result({
  "duration": 1398550400,
  "status": "passed"
});
formatter.match({
  "location": "GearTestSteps.iClickOnUpdateShoppingCartButton()"
});
formatter.result({
  "duration": 54186600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "225",
      "offset": 28
    },
    {
      "val": "00",
      "offset": 32
    }
  ],
  "location": "GearTestSteps.iVerifyTheProductPrice$(int,int)"
});
formatter.result({
  "duration": 3735664000,
  "status": "passed"
});
formatter.after({
  "duration": 655268100,
  "status": "passed"
});
formatter.uri("men.feature");
formatter.feature({
  "line": 2,
  "name": "Men test",
  "description": "As a user I want to add the product in shopping cart",
  "id": "men-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 2661542100,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should able to add products in shopping cart",
  "description": "",
  "id": "men-test;user-should-able-to-add-products-in-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I mouse hover on men menu",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I mouse hover on bottoms",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on pants",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I mouse hover on cronus yoga pant",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on size 32",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on black colour",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I verify text You added Cronus Yoga Pant to your shopping cart",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I click on shopping cart link",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I verify text Shopping cart",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I verify product name cronus yoga pant",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I verify the product colour Black",
  "keyword": "Then "
});
formatter.match({
  "location": "WomenTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 34700,
  "status": "passed"
});
formatter.match({
  "location": "MenTestSteps.iMouseHoverOnMenMenu()"
});
formatter.result({
  "duration": 566702200,
  "status": "passed"
});
formatter.match({
  "location": "MenTestSteps.iMouseHoverOnBottoms()"
});
formatter.result({
  "duration": 154440900,
  "status": "passed"
});
formatter.match({
  "location": "MenTestSteps.iClickOnPants()"
});
formatter.result({
  "duration": 1072817100,
  "status": "passed"
});
formatter.match({
  "location": "MenTestSteps.iMouseHoverOnCronusYogaPant()"
});
formatter.result({
  "duration": 166570900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "32",
      "offset": 16
    }
  ],
  "location": "MenTestSteps.iClickOnSize(int)"
});
formatter.result({
  "duration": 158624300,
  "status": "passed"
});
formatter.match({
  "location": "MenTestSteps.iClickOnBlackColour()"
});
formatter.result({
  "duration": 161943300,
  "status": "passed"
});
formatter.match({
  "location": "MenTestSteps.iClickOnAddToCart()"
});
formatter.result({
  "duration": 174931400,
  "status": "passed"
});
formatter.match({
  "location": "MenTestSteps.iVerifyTextYouAddedCronusYogaPantToYourShoppingCart()"
});
formatter.result({
  "duration": 1619507300,
  "status": "passed"
});
formatter.match({
  "location": "MenTestSteps.iClickOnShoppingCartLink()"
});
formatter.result({
  "duration": 1655126900,
  "status": "passed"
});
formatter.match({
  "location": "MenTestSteps.iVerifyTextShoppingCart()"
});
formatter.result({
  "duration": 101807300,
  "status": "passed"
});
formatter.match({
  "location": "MenTestSteps.iVerifyProductNameCronusYogaPant()"
});
formatter.result({
  "duration": 93458700,
  "status": "passed"
});
formatter.match({
  "location": "MenTestSteps.iVerifyTheProductColourBlack()"
});
formatter.result({
  "duration": 93176100,
  "status": "passed"
});
formatter.after({
  "duration": 652119600,
  "status": "passed"
});
formatter.uri("women.feature");
formatter.feature({
  "line": 2,
  "name": "Women Test",
  "description": "As a user I want to verify the products name filter and price filter",
  "id": "women-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 2307031100,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should able to sort by product name filter",
  "description": "",
  "id": "women-test;user-should-able-to-sort-by-product-name-filter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I mouse hover on women menu",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I mouse hover on tops",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on jacket",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select Sort By filter \"Product Name\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should verify the products name display in alphabetical order",
  "keyword": "Then "
});
formatter.match({
  "location": "WomenTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 44800,
  "status": "passed"
});
formatter.match({
  "location": "WomenTestSteps.iMouseHoverOnWomenMenu()"
});
formatter.result({
  "duration": 892628400,
  "status": "passed"
});
formatter.match({
  "location": "WomenTestSteps.iMouseHoverOnTops()"
});
formatter.result({
  "duration": 138283600,
  "status": "passed"
});
formatter.match({
  "location": "WomenTestSteps.iClickOnJacket()"
});
formatter.result({
  "duration": 1312184500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Product Name",
      "offset": 25
    }
  ],
  "location": "WomenTestSteps.iSelectSortByFilter(String)"
});
formatter.result({
  "duration": 819093000,
  "status": "passed"
});
formatter.match({
  "location": "WomenTestSteps.iShouldVerifyTheProductsNameDisplayInAlphabeticalOrder()"
});
formatter.result({
  "duration": 390403000,
  "status": "passed"
});
formatter.after({
  "duration": 640563800,
  "status": "passed"
});
formatter.before({
  "duration": 2776192000,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User should able to sort by price filter",
  "description": "",
  "id": "women-test;user-should-able-to-sort-by-price-filter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I mouse hover on women menu",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I mouse hover on tops",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on jacket",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select Sort By filter \"Price\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I should verify the products price display in low to high",
  "keyword": "Then "
});
formatter.match({
  "location": "WomenTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 12200,
  "status": "passed"
});
formatter.match({
  "location": "WomenTestSteps.iMouseHoverOnWomenMenu()"
});
formatter.result({
  "duration": 614251500,
  "status": "passed"
});
formatter.match({
  "location": "WomenTestSteps.iMouseHoverOnTops()"
});
formatter.result({
  "duration": 141229900,
  "status": "passed"
});
formatter.match({
  "location": "WomenTestSteps.iClickOnJacket()"
});
formatter.result({
  "duration": 1309797100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price",
      "offset": 25
    }
  ],
  "location": "WomenTestSteps.iSelectSortByFilter(String)"
});
formatter.result({
  "duration": 991029400,
  "status": "passed"
});
formatter.match({
  "location": "WomenTestSteps.iShouldVerifyTheProductsPriceDisplayInLowToHigh()"
});
formatter.result({
  "duration": 1508398600,
  "status": "passed"
});
formatter.after({
  "duration": 641335000,
  "status": "passed"
});
});