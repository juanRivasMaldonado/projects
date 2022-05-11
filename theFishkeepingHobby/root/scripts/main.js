const menuButton = document.getElementById("menu-icon-button");
const menuIcon = document.getElementById("menu-icon");
const darkBackground = document.getElementById("dark-background");
const navigationMenu = document.getElementById("navigation-menu");
const logo = document.getElementById("logo");

menuButton.onclick = toggleSideMenu;
darkBackground.onclick = toggleSideMenu;

/***
 * toggles between showing or hiding the side menu
 */
function toggleSideMenu() {
    // display of the side menu elements 
    const sideMenuDisplay = getComputedStyle(navigationMenu, null).display;

    // if side menu is hidden, show
    if (sideMenuDisplay === "none") {
        showSideMenu();
    }

    // if side menu is visible, hide
    else if (sideMenuDisplay === "flex") {
        hideSideMenu();
    }
}

/**
 * shows the side menu
 */
function showSideMenu() {
    darkBackground.style.display = "block";  // show dark background
    navigationMenu.style.display = "flex";   // show side menu
    logo.style.display = "none";             // hide logo
    
    // show "X" icon
    menuIcon.classList.remove("fa-bars");     
    menuIcon.classList.add("fa-x");
}

/**
 * hides the side menu
 */
function hideSideMenu() {
    darkBackground.style.display = "none";  // hide dark background
    navigationMenu.style.display = "none";  // hide side menu
    logo.style.display = "block";           // show logo

    // hide "X" icon
    menuIcon.classList.remove("fa-x");     
    menuIcon.classList.add("fa-bars");
}