package com.padc.padcanimations.data

import com.padc.padcanimations.data.vos.GameVO

fun getGames(): List<GameVO> {
    return listOf(
        GameVO(
            id = 1,
            image = "https://cdn.akamai.steamstatic.com/steam/apps/1245620/header.jpg?t=1672223247",
            name = "Elden Ring",
            description = "THE NEW FANTASY ACTION RPG.\n" +
                "Rise, Tarnished, and be guided by grace to brandish the power of the Elden Ring and become an Elden Lord in the Lands Between.\n" +
                "• A Vast World Full of Excitement\n" +
                "A vast world where open fields with a variety of situations and huge dungeons with complex and three-dimensional designs are seamlessly connected. As you explore, the joy of discovering unknown and overwhelming threats await you, leading to a high sense of accomplishment.\n" +
                "• Create your Own Character\n" +
                "In addition to customizing the appearance of your character, you can freely combine the weapons, armor, and magic that you equip. You can develop your character according to your play style, such as increasing your muscle strength to become a strong warrior, or mastering magic.\n" +
                "• An Epic Drama Born from a Myth\n" +
                "A multilayered story told in fragments. An epic drama in which the various thoughts of the characters intersect in the Lands Between.\n" +
                "• Unique Online Play that Loosely Connects You to Others\n" +
                "In addition to multiplayer, where you can directly connect with other players and travel together, the game supports a unique asynchronous online element that allows you to feel the presence of others.",
            developer = "FromSoftware Inc",
            publisher = "Bandai Namco",
            price = 59.99
        ),
        GameVO(
            id = 2,
            image = "https://cdn.akamai.steamstatic.com/steam/apps/374320/header.jpg?t=1671097812",
            name = "Dark Souls 3",
            description = "Dark Souls continues to push the boundaries with the latest, ambitious chapter in the critically-acclaimed and genre-defining series. Prepare yourself and Embrace The Darkness!",
            developer = "FromSoftware Inc",
            publisher = "Bandai Namco",
                price = 59.99
        ),
        GameVO(
            id = 3,
            image = "https://cdn.akamai.steamstatic.com/steam/apps/814380/header.jpg?t=1669076148",
            name = "Sekiro Shadows Die Twice",
            description = "Game of the Year - The Game Awards 2019 Best Action Game of 2019 - IGN Carve your own clever path to vengeance in the award winning adventure from developer FromSoftware, creators of Bloodborne and the Dark Souls series. Take Revenge. Restore Your Honor. Kill Ingeniously.",
            developer = "FromSoftware Inc",
            publisher = "Activision",
            price = 59.99
        ),
        GameVO(
            id = 4,
            image = "https://cdn.akamai.steamstatic.com/steam/apps/1325200/header.jpg?t=1671498323",
            name = "Nioh 2 - The Complete Edition",
            description = "UNLEASH YOUR DARKNESS\n" +
                "\n" +
                "Experience the thrill of taking on hordes of fearsome yokai in a battle to the death in this brutal masocore Action RPG. Create your own original protagonist and embark on an adventure that will take you through devastated locales across Japan during the Sengoku period.\n" +
                "\n" +
                "Much like the previous title which garnered much praise from fans and critics alike, Nioh 2 contains an original profound story surrounding military commanders from the Sengoku period. However, Nioh 2 goes above and beyond its predecessor by including the new Yokai Shift ability which allows the protagonist to utilize new powerful forms to defeat even the most formidable yokai in battle. New to Nioh 2, your enemies can now create a Dark Realm which raises the stakes of battle and creates new challenges for your protagonist to overcome. We hope you enjoy conquering fearsome monsters as you unleash your darkness in the world of Nioh 2.",
            developer = "Team NINJA",
            publisher = "KOEI TECMO GAMES CO., LTD.",
            price = 59.99
        ),
        GameVO(
            id = 5,
            image = "https://cdn.akamai.steamstatic.com/steam/apps/1110910/header.jpg?t=1668014729",
            name = "Mortal Shell",
            description = "Mortal Shell is a deep action-RPG that tests your sanity and resilience in a shattered world. As the remains of humanity wither and rot, zealous foes fester in the ruins. They spare no mercy, with survival demanding superior awareness, precision and instincts. Track down hidden sanctums of devout followers and discover your true purpose.\nThe dead litter this tattered landscape, but not all are without hope. The lost remains of defeated warriors are yours to discover. Awaken these Mortal Shells, occupy their bodies and significantly open your understanding to diverse masteries of combat.",
            developer = "FromSoftware Inc",
            publisher = "Bandai Namco",
            price = 29.99
        ),
    )
}