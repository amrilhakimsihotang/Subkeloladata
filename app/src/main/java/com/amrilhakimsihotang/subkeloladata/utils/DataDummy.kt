package com.amrilhakimsihotang.subkeloladata.utils


import com.amrilhakimsihotang.subkeloladata.data.source.local.entity.MovieEntity
import com.amrilhakimsihotang.subkeloladata.data.source.local.entity.TiviEntity
import com.amrilhakimsihotang.subkeloladata.data.source.remote.response.MovieResponse
import com.amrilhakimsihotang.subkeloladata.data.source.remote.response.TiviResponse
import java.util.*

object DataDummy {

    fun generateRemoteMovie(): ArrayList<MovieEntity> {
        val movie = ArrayList<MovieEntity>()
        movie.add(
                MovieEntity(
                        "1",
                        "Jiu Jitsu (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/eLT8Cu357VOwBVTitkmlDEg32Fs.jpg",
                        "Every six years, an ancient order of jiu-jitsu fighters joins forces to battle a vicious race of alien invaders. But when a celebrated war hero goes down in defeat, the fate of the planet and mankind hangs in the balance.",
                        "Dimitri Logothetis",
                        "Dimitri Logothetis, Jim McGrath",
                        "Marie Avgeropoulos, Rick Yune",
                        "Nicolas Cage, Alain Moussi, Frank Grillo, Tony Jaa, JuJu Chan, Marie Avgeropoulos, Rick Yune, Eddie Steeples, James P. Bennett, Dan Rizzuto, Ryan Tarran, John D. Hickman, Tommy Walker"
                )
        )
        movie.add(
                MovieEntity(

                        "2",
                        "Upside-Down Magic (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/xfYMQNApIIh8KhpNVtG1XRz0ZAp.jpg",
                        "Nory and her best friend Reina enter the Sage Academy for Magical Studies, where Nory’s unconventional powers land her in a class for those with wonky, or “upside-down,” magic. Undaunted, Nory sets out to prove that that upside-down magic can be just as powerful as right-side-up.",
                        "Joe Nussbaum",
                        "Nick Pustay",
                        "Nick Pustay",
                        "Izabela Rose, Siena Agudong, Kyle Howard, Max Torina, Elie Samouhi, Alison Fernandez, Vicki Lewis, Cynthia Kaye McWilliams, Jaime M. Callica, Callum Seagram Airlie, Amitai Marmorstein, Elaine Kao, Emily Delahunty, Ricardo Ortiz, Jason Asuncion, Yasmeen Fletcher, Melody Nosipho Niemann,Lou Ticzon, Valencia Budijanto, Josh Zaharia, Esther Li, Yoko Misawa, Rosalba Perez, Leslie Dos Remedios "

                )
        )
        movie.add(
                MovieEntity(

                        "3",
                        "Fatman (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/4n8QNNdk4BOX9Dslfbz5Dy6j1HK.jpg",
                        "A rowdy, unorthodox Santa Claus is fighting to save his declining business. Meanwhile, Billy, a neglected and precocious 12 year old, hires a hit man to kill Santa after receiving a lump of coal in his stocking.",
                        "Eshom Nelms, Ian Nelms",
                        "Eshom Nelms, Ian Nelms",
                        "Eshom Nelms, Ian Nelms",
                        "Mel Gibson, Walton Goggins, Marianne Jean-Baptiste, Shaun Benson, Paulino Nunes, Chance Hurstfield, Michelle Lang, Deborah Grover, Michael Dickson"


                )
        )
        movie.add(
                MovieEntity(
                        "4",
                        "Tenet (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/k68nPLbIST6NP96JmTxmZijEvCA.jpg",
                        "Armed with only one word - Tenet - and fighting for the survival of the entire world, the Protagonist journeys through a twilight world of international espionage on a mission that will unfold in something beyond real time.",
                        "Christopher Nolan",
                        "Christopher Nolan",
                        "Kenneth Branagh, Dimple Kapadia",
                        "John David Washington, Robert Pattinson, Elizabeth Debicki, Kenneth Branagh, Dimple Kapadia, Himesh Patel, Aaron Taylor-Johnson, Michael Caine, Clémence Poésy, Martin Donovan"

                )
        )
        movie.add(
                MovieEntity(

                        "5",
                        "The Dalton Gang (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/6OeGqp18oZucUGziMIRNhLouZ75.jpg",
                        "When their brother Frank is killed by an outlaw, brothers Bob Dalton, Emmett Dalton and Gray Dalton join their local sheriff's department. When they are cheated by the law, they turn to crime, robbing trains and anything else they can steal from over the course of two years in the early 1890's. Trying to out do Jesse James, they attempt to rob two banks at once in October of 1892, and things get ugly.",
                        "Christopher Forbes",
                        "Micah Lyons",
                        "Christopher Forbes",
                        "William Adams, Jezibell Anat, Gunner Bridger, Meghan Bridgers, Jerry Chesser, Alan Cope II, Judy DeLoach, William DeLoach"

                )
        )
        movie.add(
                MovieEntity(

                        "6",
                        "Hard Kill (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/ugZW8ocsrfgI95pnQ7wrmKDxIe.jpg",
                        "The work of billionaire tech CEO Donovan Chalmers is so valuable that he hires mercenaries to protect it, and a terrorist group kidnaps his daughter just to get it.",
                        "Matt Eskandari",
                        "Joe Russo, Chris LaMont, Clayton Haugen, Nikolai From",
                        "Joe Russo, Chris LaMont, Clayton Haugen, Nikolai From",
                        "Bruce Willis, Jesse Metcalfe, Natalie Eva Marie, Lala Kent, Texas Battle, Swen Temmel, Sergio Rizzuto, Tyler Jon Olson, Jon Galanis"

                )
        )
        movie.add(
                MovieEntity(

                        "7",
                        "Mulan (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/aKx1ARwG55zZ0GpRvU2WrGrCG9o.jpg",
                        "When the Emperor of China issues a decree that one man per family must serve in the Imperial Chinese Army to defend the country from Huns, Hua Mulan, the eldest daughter of an honored warrior, steps in to take the place of her ailing father. She is spirited, determined and quick on her feet. Disguised as a man by the name of Hua Jun, she is tested every step of the way and must harness her innermost strength and embrace her true potential.",
                        "Niki Caro",
                        "Rick Jaffa, Amanda Silver, Lauren Hynek, Elizabeth Martin, Amanda Silver",
                        "Rick Jaffa, Amanda Silver, Lauren Hynek, Elizabeth Martin, Amanda Silver",
                        "Liu Yifei, Jet Li, Tzi Ma, Donnie Yen, Gong Li, Jason Scott Lee, Yoson An, Rosalind Chao, Cheng Pei-Pei"

                )
        )
        movie.add(
                MovieEntity(

                        "8",
                        "Rogue City (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/9HT9982bzgN5on1sLRmc1GMn6ZC.jpg",
                        "Caught in the crosshairs of police corruption and Marseille’s warring gangs, a loyal cop must protect his squad by taking matters into his own hands.",
                        "Olivier Marchal",
                        "Olivier Marchal",
                        "Arnaud Putman, Jimena Esteve",
                        "Lannick Gautry,Stanislas Merhar, Kaaris, Jean Reno, David Belle,　Gérard Lanvin,　Moussa Maaskri,　Catherine Marchal,　Francis Renaud,　Erika Sainte,　Barbara Opsomer,　Ambre Pietri,　"

                )
        )
        movie.add(
                MovieEntity(

                        "9",
                        "Greenland (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/bNo2mcvSwIvnx8K6y1euAc1TLVq.jpg",
                        "John Garrity, his estranged wife and their young son embark on a perilous journey to find sanctuary as a planet-killing comet hurtles toward Earth. Amid terrifying accounts of cities getting levelled, the Garrity's experience the best and worst in humanity. As the countdown to the global apocalypse approaches zero, their incredible trek culminates in a desperate and last-minute flight to a possible safe haven.",
                        "Ric Roman Waugh",
                        "Chris Sparling",
                        "Dana Gonzales,　Clay A. Griffith",
                        "Gerard Butler,　Morena Baccarin,　David Denman,　Hope Davis,　Roger Dale Floyd,　Scott Glenn,　Andrew Bachelor,　Merrin Dungey,　Holt McCallany,　Gary Weeks,　Tracey Bonner,　Joshua Mikel,　Cate Jones,　Mike Gassaway,　Anissa Matlock"

                )
        )
        movie.add(
                MovieEntity(

                        "10",
                        "Chick Fight (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/4ZocdxnOO6q2UbdKye2wgofLFhB.jpg",
                        "When Anna Wyncomb is introduced to an an underground, all-female fight club in order to turn the mess of her life around, she discovers she is much more personally connected to the history of the club than she could ever imagine.",
                        "Paul Leyden",
                        "Joseph Downey, Hope Bryant",
                        "Joseph Downey",
                        "Bella Thorne, Malin Åkerman, Alec Baldwin, Dulcé Sloan, Mariana Paola Vicente, Vitoria Setta, Julie Michaels, Nicol Paone, Alexia Barlier, Fortune Feimster, Marissa Labog, Julia Sandstrom"

                )
        )

        return movie
    }

    fun generateRemoteTivishow(): ArrayList<TiviEntity> {
        val tivi = ArrayList<TiviEntity>()
        tivi.add(
                TiviEntity(

                        "1",
                        "The Mandalorian (2019)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/sWgBv7LV2PRoQgkxwlibdGXKz1S.jpg",
                        "After the fall of the Galactic Empire, lawlessness has spread throughout the galaxy. A lone gunfighter makes his way through the outer reaches, earning his keep as a bounty hunter.",
                        "Jon Favreau",
                        "Pedro Pascal, Carl Weathers, Giancarlo Esposito, Gina Carano, Temuera Morrison, Misty Rosas, Chris Bartlett, Rio Hackford, Emily Swallow, Paul Sun-Hyung Lee, Gabriel Ebert, Bill Burr, John Beasley, Dmitrious Bistrevsky, Brian Posehn",
                        "George Lucas, Christopher L. Yost, Dave Filoni, Jon Favreau, Rick Famuyiwa"

                )
        )
        tivi.add(
                TiviEntity(

                        "2",
                        "The Good Doctor (2017) ",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg",
                        "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives?",
                        "David Shore",
                        "Freddie Highmore, Antonia Thomas, Hill Harper, Richard Schiff, Nicholas Gonzalez, Christina Chang, Paige Spara, Fiona Gubelmann, Will Yun Lee, Tamlyn Tomita, Jasika Nicole, Elfina Luk, Teryl Rothery,Chuku Modu, Beau Garrett, Sheila Kelley, Karin Konoval ",
                        "Liz Friedman, Adam Scott Weissman, Brian Shin, David Hoselton, David Renaud, David Renaud, Debbie Ezer, Doris Egan, Freddie Highmore, Jessica Grasl, Johanna Lee"

                )
        )
        tivi.add(
                TiviEntity(

                        "3",
                        "Grey's Anatomy (2005) ",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg",
                        "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                        "Shonda Rhimes",
                        "Ellen Pompeo, Justin Chambers, James Pickens Jr., Chandra Wilson, Patrick Dempsey, Sara Ramirez, Sandra Oh, Kevin McKidd, Leven Rambin, Ryan Devlin, Jaina Lee Ortiz, Tina Holmes",
                        "Allan Heinberg, Ann Hamilton, Austin Guzman, Billy Harper, Bruce William Harper, Carolina Paiz, Chris Van Dusen"

                )
        )
        tivi.add(
                TiviEntity(

                        "4",
                        "Lucifer (2016)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg",
                        "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                        "Tom Kapinos",
                        "Tom Ellis, Lauren German, Kevin Alejandro, D.B. Woodside, Lesley-Ann Brandt, Rachael Harris, Scarlett Estevez, Aimee Garcia, Tricia Helfer, Tom Welling, Jon Sklaroff, Inbar Lavi, Kevin Rankin, Graham McTavish",
                        "Mike Dringenberg, Neil Gaiman, Sam Kieth, Jenn Kao, Recardo Lopez, Jr., Ildy Modrovich, Joe Henderson, Aiyana White, Alex Katsnelson"

                )
        )
        tivi.add(
                TiviEntity(

                        "5",
                        "Fear the Walking Dead (2015) ",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/wGFUewXPeMErCe2xnCmmLEiHOGh.jpg",
                        "What did the world look like as it was transforming into the horrifying apocalypse depicted in \"The Walking Dead\"? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question.",
                        "Dave Erickson, Robert Kirkman",
                        "Alycia Debnam-Carey, Danay García, Colman Domingo, Kim Dickens, Frank Dillane, Rubén Blades, Lennie James, Garret Dillahunt, Maggie Grace, Jenna Elfman, Cliff Curtis, Alexa Nisenson, Austin Amelio, Karen David, Mo Collins, Mercedes Mason",
                        "Alex Delyle, Andrew Chambliss, Ashley Cardiff, Dave Erickson, David Johnson, David Wiener, Ian Goldberg, Jack LoGiudice"

                )
        )
        tivi.add(
                TiviEntity(

                        "6",
                        "30 Coins (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/lw70w94nzCmIVSQvtMcuAjWHfWX.jpg",
                        "Father Vergara—an exorcist, boxer and ex-convict—lives in a remote village in Spain. Hoping to be lost and forgotten, Vergara’s demons catch up to him.",
                        "Jorge Guerricaechevarría, Álex de la Iglesia",
                        "Eduard Fernández, Macarena Gómez, Miguel Ángel Silvestre, Megan Montaner, Pepón Nieto, Manolo Solo",
                        "Jorge Guerricaechevarría, Álex de la Iglesia"

                )
        )
        tivi.add(
                TiviEntity(

                        "7",
                        "SEAL Team (2017)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/uTSLeQTeHevt4fplegmQ6bOnE0Z.jpg",
                        "The lives of the elite Navy Seals as they train, plan and execute the most dangerous, high-stakes missions our country can ask.",
                        "Benjamin Cavell",
                        "David Boreanaz, Max Thieriot, Neil Brown Jr., A.J. Buckley, Jessica Paré, Toni Trucks, Justin Melnick, Tyler Grey, Judd Lormand, Scott Foxx, Michaela McManus, Parisa Fakhri, Lucca De Oliveira",
                        "Tom Mularz, Jacob Roman, Kenny Ryan, Becky Mode, Benjamin Cavell, Beth Schacter"

                )
        )
        tivi.add(
                TiviEntity(

                        "8",
                        "The Queen's Gambit (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/zU0htwkhNvBQdVSIKB9s6hgVeFK.jpg",
                        "In a Kentucky orphanage in the 1950s, a young girl discovers an astonishing talent for chess while struggling with addiction.",
                        "Scott Frank, Allan Scott",
                        "Anya Taylor-Joy, Janina Elkin, Matthew Dennis Lewis, Russell Dennis Lewis, Dolores Carbonari, Bill Camp, Marielle Heller, Marcin Dorociński, Patrick Kennedy",
                        "Walter Tevis, Allan Scott, Scott Frank"

                )
        )
        tivi.add(
                TiviEntity(

                        "9",
                        "His Dark Materials (2019)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/g6tIKGc3f1H5QMz1dcgCwADKpZ7.jpg",
                        "Lyra is an orphan who lives in a parallel universe in which science, theology and magic are entwined. Lyra's search for a kidnapped friend uncovers a sinister plot involving stolen children, and turns into a quest to understand a mysterious phenomenon called Dust. She is later joined on her journey by Will, a boy who possesses a knife that can cut windows between worlds. As Lyra learns the truth about her parents and her prophesied destiny, the two young people are caught up in a war against celestial powers that ranges across many worlds.",
                        "Dawn Shadforth, Euros Lyn, Jamie Childs",
                        "Dafne Keen, Ruth Wilson, Ariyon Bakare, Will Keen, Lin-Manuel Miranda, Amir Wilson, Kit Connor, Ruta Gedmintas, Andrew Scott, Jamie Wilkes, Robert Emms, Daniel Frogson",
                        "Philip Pullman, Michael Clarkson, Paul Clarkson, Francesca Gardiner, Jack Thorne, Namsi Khan"

                )
        )
        tivi.add(
                TiviEntity(

                        "10",
                        "Supernatural (2005)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/KoYWXbnYuS3b0GyQPkbuexlVK9.jpg",
                        "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                        "Eric Kripke",
                        "Alexander Calvert, Samantha Ferris, Curtis Armstrong, Jensen Ackles, Alona Tal, Jared Padalecki, Ruth Connell, Jim Beaver Emily Swallow",
                        "Robert Singer, Robbie Thompson, Richard Hatem, Raelle Tucker, Rachel Nave, Nancy Won, Meghan Fitzmartin"

                )
        )

        return tivi
    }


    fun generateRemoteMovies(): ArrayList<MovieResponse> {
        val movies = ArrayList<MovieResponse>()
        movies.add(
                MovieResponse(
                        "1",
                        "Jiu Jitsu (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/eLT8Cu357VOwBVTitkmlDEg32Fs.jpg",
                        "Every six years, an ancient order of jiu-jitsu fighters joins forces to battle a vicious race of alien invaders. But when a celebrated war hero goes down in defeat, the fate of the planet and mankind hangs in the balance.",
                        "Dimitri Logothetis",
                        "Dimitri Logothetis, Jim McGrath",
                        "Marie Avgeropoulos, Rick Yune",
                        "Nicolas Cage, Alain Moussi, Frank Grillo, Tony Jaa, JuJu Chan, Marie Avgeropoulos, Rick Yune, Eddie Steeples, James P. Bennett, Dan Rizzuto, Ryan Tarran, John D. Hickman, Tommy Walker"
                )
        )
        movies.add(
                MovieResponse(

                        "2",
                        "Upside-Down Magic (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/xfYMQNApIIh8KhpNVtG1XRz0ZAp.jpg",
                        "Nory and her best friend Reina enter the Sage Academy for Magical Studies, where Nory’s unconventional powers land her in a class for those with wonky, or “upside-down,” magic. Undaunted, Nory sets out to prove that that upside-down magic can be just as powerful as right-side-up.",
                        "Joe Nussbaum",
                        "Nick Pustay",
                        "Nick Pustay",
                        "Izabela Rose, Siena Agudong, Kyle Howard, Max Torina, Elie Samouhi, Alison Fernandez, Vicki Lewis, Cynthia Kaye McWilliams, Jaime M. Callica, Callum Seagram Airlie, Amitai Marmorstein, Elaine Kao, Emily Delahunty, Ricardo Ortiz, Jason Asuncion, Yasmeen Fletcher, Melody Nosipho Niemann,Lou Ticzon, Valencia Budijanto, Josh Zaharia, Esther Li, Yoko Misawa, Rosalba Perez, Leslie Dos Remedios "

                )
        )
        movies.add(
                MovieResponse(

                        "3",
                        "Fatman (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/4n8QNNdk4BOX9Dslfbz5Dy6j1HK.jpg",
                        "A rowdy, unorthodox Santa Claus is fighting to save his declining business. Meanwhile, Billy, a neglected and precocious 12 year old, hires a hit man to kill Santa after receiving a lump of coal in his stocking.",
                        "Eshom Nelms, Ian Nelms",
                        "Eshom Nelms, Ian Nelms",
                        "Eshom Nelms, Ian Nelms",
                        "Mel Gibson, Walton Goggins, Marianne Jean-Baptiste, Shaun Benson, Paulino Nunes, Chance Hurstfield, Michelle Lang, Deborah Grover, Michael Dickson"


                )
        )
        movies.add(
                MovieResponse(
                        "4",
                        "Tenet (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/k68nPLbIST6NP96JmTxmZijEvCA.jpg",
                        "Armed with only one word - Tenet - and fighting for the survival of the entire world, the Protagonist journeys through a twilight world of international espionage on a mission that will unfold in something beyond real time.",
                        "Christopher Nolan",
                        "Christopher Nolan",
                        "Kenneth Branagh, Dimple Kapadia",
                        "John David Washington, Robert Pattinson, Elizabeth Debicki, Kenneth Branagh, Dimple Kapadia, Himesh Patel, Aaron Taylor-Johnson, Michael Caine, Clémence Poésy, Martin Donovan"

                )
        )
        movies.add(
                MovieResponse(

                        "5",
                        "The Dalton Gang (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/6OeGqp18oZucUGziMIRNhLouZ75.jpg",
                        "When their brother Frank is killed by an outlaw, brothers Bob Dalton, Emmett Dalton and Gray Dalton join their local sheriff's department. When they are cheated by the law, they turn to crime, robbing trains and anything else they can steal from over the course of two years in the early 1890's. Trying to out do Jesse James, they attempt to rob two banks at once in October of 1892, and things get ugly.",
                        "Christopher Forbes",
                        "Micah Lyons",
                        "Christopher Forbes",
                        "William Adams, Jezibell Anat, Gunner Bridger, Meghan Bridgers, Jerry Chesser, Alan Cope II, Judy DeLoach, William DeLoach"

                )
        )
        movies.add(
                MovieResponse(

                        "6",
                        "Hard Kill (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/ugZW8ocsrfgI95pnQ7wrmKDxIe.jpg",
                        "The work of billionaire tech CEO Donovan Chalmers is so valuable that he hires mercenaries to protect it, and a terrorist group kidnaps his daughter just to get it.",
                        "Matt Eskandari",
                        "Joe Russo, Chris LaMont, Clayton Haugen, Nikolai From",
                        "Joe Russo, Chris LaMont, Clayton Haugen, Nikolai From",
                        "Bruce Willis, Jesse Metcalfe, Natalie Eva Marie, Lala Kent, Texas Battle, Swen Temmel, Sergio Rizzuto, Tyler Jon Olson, Jon Galanis"

                )
        )
        movies.add(
                MovieResponse(

                        "7",
                        "Mulan (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/aKx1ARwG55zZ0GpRvU2WrGrCG9o.jpg",
                        "When the Emperor of China issues a decree that one man per family must serve in the Imperial Chinese Army to defend the country from Huns, Hua Mulan, the eldest daughter of an honored warrior, steps in to take the place of her ailing father. She is spirited, determined and quick on her feet. Disguised as a man by the name of Hua Jun, she is tested every step of the way and must harness her innermost strength and embrace her true potential.",
                        "Niki Caro",
                        "Rick Jaffa, Amanda Silver, Lauren Hynek, Elizabeth Martin, Amanda Silver",
                        "Rick Jaffa, Amanda Silver, Lauren Hynek, Elizabeth Martin, Amanda Silver",
                        "Liu Yifei, Jet Li, Tzi Ma, Donnie Yen, Gong Li, Jason Scott Lee, Yoson An, Rosalind Chao, Cheng Pei-Pei"

                )
        )
        movies.add(
                MovieResponse(

                        "8",
                        "Rogue City (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/9HT9982bzgN5on1sLRmc1GMn6ZC.jpg",
                        "Caught in the crosshairs of police corruption and Marseille’s warring gangs, a loyal cop must protect his squad by taking matters into his own hands.",
                        "Olivier Marchal",
                        "Olivier Marchal",
                        "Arnaud Putman, Jimena Esteve",
                        "Lannick Gautry,Stanislas Merhar, Kaaris, Jean Reno, David Belle,　Gérard Lanvin,　Moussa Maaskri,　Catherine Marchal,　Francis Renaud,　Erika Sainte,　Barbara Opsomer,　Ambre Pietri,　"

                )
        )
        movies.add(
                MovieResponse(

                        "9",
                        "Greenland (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/bNo2mcvSwIvnx8K6y1euAc1TLVq.jpg",
                        "John Garrity, his estranged wife and their young son embark on a perilous journey to find sanctuary as a planet-killing comet hurtles toward Earth. Amid terrifying accounts of cities getting levelled, the Garrity's experience the best and worst in humanity. As the countdown to the global apocalypse approaches zero, their incredible trek culminates in a desperate and last-minute flight to a possible safe haven.",
                        "Ric Roman Waugh",
                        "Chris Sparling",
                        "Dana Gonzales,　Clay A. Griffith",
                        "Gerard Butler,　Morena Baccarin,　David Denman,　Hope Davis,　Roger Dale Floyd,　Scott Glenn,　Andrew Bachelor,　Merrin Dungey,　Holt McCallany,　Gary Weeks,　Tracey Bonner,　Joshua Mikel,　Cate Jones,　Mike Gassaway,　Anissa Matlock"

                )
        )
        movies.add(
                MovieResponse(

                        "10",
                        "Chick Fight (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/4ZocdxnOO6q2UbdKye2wgofLFhB.jpg",
                        "When Anna Wyncomb is introduced to an an underground, all-female fight club in order to turn the mess of her life around, she discovers she is much more personally connected to the history of the club than she could ever imagine.",
                        "Paul Leyden",
                        "Joseph Downey, Hope Bryant",
                        "Joseph Downey",
                        "Bella Thorne, Malin Åkerman, Alec Baldwin, Dulcé Sloan, Mariana Paola Vicente, Vitoria Setta, Julie Michaels, Nicol Paone, Alexia Barlier, Fortune Feimster, Marissa Labog, Julia Sandstrom"

                )
        )

        return movies
    }

    fun generateRemotetivi(): ArrayList<TiviResponse> {
        val tivi = ArrayList<TiviResponse>()
        tivi.add(
                TiviResponse(

                        "1",
                        "The Mandalorian (2019)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/sWgBv7LV2PRoQgkxwlibdGXKz1S.jpg",
                        "After the fall of the Galactic Empire, lawlessness has spread throughout the galaxy. A lone gunfighter makes his way through the outer reaches, earning his keep as a bounty hunter.",
                        "Jon Favreau",
                        "Pedro Pascal, Carl Weathers, Giancarlo Esposito, Gina Carano, Temuera Morrison, Misty Rosas, Chris Bartlett, Rio Hackford, Emily Swallow, Paul Sun-Hyung Lee, Gabriel Ebert, Bill Burr, John Beasley, Dmitrious Bistrevsky, Brian Posehn",
                        "George Lucas, Christopher L. Yost, Dave Filoni, Jon Favreau, Rick Famuyiwa"

                )
        )
        tivi.add(
                TiviResponse(

                        "2",
                        "The Good Doctor (2017) ",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg",
                        "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives?",
                        "David Shore",
                        "Freddie Highmore, Antonia Thomas, Hill Harper, Richard Schiff, Nicholas Gonzalez, Christina Chang, Paige Spara, Fiona Gubelmann, Will Yun Lee, Tamlyn Tomita, Jasika Nicole, Elfina Luk, Teryl Rothery,Chuku Modu, Beau Garrett, Sheila Kelley, Karin Konoval ",
                        "Liz Friedman, Adam Scott Weissman, Brian Shin, David Hoselton, David Renaud, David Renaud, Debbie Ezer, Doris Egan, Freddie Highmore, Jessica Grasl, Johanna Lee"

                )
        )
        tivi.add(
                TiviResponse(

                        "3",
                        "Grey's Anatomy (2005) ",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg",
                        "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                        "Shonda Rhimes",
                        "Ellen Pompeo, Justin Chambers, James Pickens Jr., Chandra Wilson, Patrick Dempsey, Sara Ramirez, Sandra Oh, Kevin McKidd, Leven Rambin, Ryan Devlin, Jaina Lee Ortiz, Tina Holmes",
                        "Allan Heinberg, Ann Hamilton, Austin Guzman, Billy Harper, Bruce William Harper, Carolina Paiz, Chris Van Dusen"

                )
        )
        tivi.add(
                TiviResponse(

                        "4",
                        "Lucifer (2016)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg",
                        "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                        "Tom Kapinos",
                        "Tom Ellis, Lauren German, Kevin Alejandro, D.B. Woodside, Lesley-Ann Brandt, Rachael Harris, Scarlett Estevez, Aimee Garcia, Tricia Helfer, Tom Welling, Jon Sklaroff, Inbar Lavi, Kevin Rankin, Graham McTavish",
                        "Mike Dringenberg, Neil Gaiman, Sam Kieth, Jenn Kao, Recardo Lopez, Jr., Ildy Modrovich, Joe Henderson, Aiyana White, Alex Katsnelson"

                )
        )
        tivi.add(
                TiviResponse(

                        "5",
                        "Fear the Walking Dead (2015) ",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/wGFUewXPeMErCe2xnCmmLEiHOGh.jpg",
                        "What did the world look like as it was transforming into the horrifying apocalypse depicted in \"The Walking Dead\"? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question.",
                        "Dave Erickson, Robert Kirkman",
                        "Alycia Debnam-Carey, Danay García, Colman Domingo, Kim Dickens, Frank Dillane, Rubén Blades, Lennie James, Garret Dillahunt, Maggie Grace, Jenna Elfman, Cliff Curtis, Alexa Nisenson, Austin Amelio, Karen David, Mo Collins, Mercedes Mason",
                        "Alex Delyle, Andrew Chambliss, Ashley Cardiff, Dave Erickson, David Johnson, David Wiener, Ian Goldberg, Jack LoGiudice"

                )
        )
        tivi.add(
                TiviResponse(

                        "6",
                        "30 Coins (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/lw70w94nzCmIVSQvtMcuAjWHfWX.jpg",
                        "Father Vergara—an exorcist, boxer and ex-convict—lives in a remote village in Spain. Hoping to be lost and forgotten, Vergara’s demons catch up to him.",
                        "Jorge Guerricaechevarría, Álex de la Iglesia",
                        "Eduard Fernández, Macarena Gómez, Miguel Ángel Silvestre, Megan Montaner, Pepón Nieto, Manolo Solo",
                        "Jorge Guerricaechevarría, Álex de la Iglesia"

                )
        )
        tivi.add(
                TiviResponse(

                        "7",
                        "SEAL Team (2017)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/uTSLeQTeHevt4fplegmQ6bOnE0Z.jpg",
                        "The lives of the elite Navy Seals as they train, plan and execute the most dangerous, high-stakes missions our country can ask.",
                        "Benjamin Cavell",
                        "David Boreanaz, Max Thieriot, Neil Brown Jr., A.J. Buckley, Jessica Paré, Toni Trucks, Justin Melnick, Tyler Grey, Judd Lormand, Scott Foxx, Michaela McManus, Parisa Fakhri, Lucca De Oliveira",
                        "Tom Mularz, Jacob Roman, Kenny Ryan, Becky Mode, Benjamin Cavell, Beth Schacter"

                )
        )
        tivi.add(
                TiviResponse(

                        "8",
                        "The Queen's Gambit (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/zU0htwkhNvBQdVSIKB9s6hgVeFK.jpg",
                        "In a Kentucky orphanage in the 1950s, a young girl discovers an astonishing talent for chess while struggling with addiction.",
                        "Scott Frank, Allan Scott",
                        "Anya Taylor-Joy, Janina Elkin, Matthew Dennis Lewis, Russell Dennis Lewis, Dolores Carbonari, Bill Camp, Marielle Heller, Marcin Dorociński, Patrick Kennedy",
                        "Walter Tevis, Allan Scott, Scott Frank"

                )
        )
        tivi.add(
                TiviResponse(

                        "9",
                        "His Dark Materials (2019)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/g6tIKGc3f1H5QMz1dcgCwADKpZ7.jpg",
                        "Lyra is an orphan who lives in a parallel universe in which science, theology and magic are entwined. Lyra's search for a kidnapped friend uncovers a sinister plot involving stolen children, and turns into a quest to understand a mysterious phenomenon called Dust. She is later joined on her journey by Will, a boy who possesses a knife that can cut windows between worlds. As Lyra learns the truth about her parents and her prophesied destiny, the two young people are caught up in a war against celestial powers that ranges across many worlds.",
                        "Dawn Shadforth, Euros Lyn, Jamie Childs",
                        "Dafne Keen, Ruth Wilson, Ariyon Bakare, Will Keen, Lin-Manuel Miranda, Amir Wilson, Kit Connor, Ruta Gedmintas, Andrew Scott, Jamie Wilkes, Robert Emms, Daniel Frogson",
                        "Philip Pullman, Michael Clarkson, Paul Clarkson, Francesca Gardiner, Jack Thorne, Namsi Khan"

                )
        )
        tivi.add(
                TiviResponse(

                        "10",
                        "Supernatural (2005)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/KoYWXbnYuS3b0GyQPkbuexlVK9.jpg",
                        "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                        "Eric Kripke",
                        "Alexander Calvert, Samantha Ferris, Curtis Armstrong, Jensen Ackles, Alona Tal, Jared Padalecki, Ruth Connell, Jim Beaver Emily Swallow",
                        "Robert Singer, Robbie Thompson, Richard Hatem, Raelle Tucker, Rachel Nave, Nancy Won, Meghan Fitzmartin"

                )
        )

        return tivi
    }

    fun generateRemoteMovie_1(): List<MovieEntity> {

        val movie = ArrayList<MovieEntity>()
        movie.add(
                MovieEntity(
                        "1",
                        "Jiu Jitsu (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/eLT8Cu357VOwBVTitkmlDEg32Fs.jpg",
                        "Every six years, an ancient order of jiu-jitsu fighters joins forces to battle a vicious race of alien invaders. But when a celebrated war hero goes down in defeat, the fate of the planet and mankind hangs in the balance.",
                        "Dimitri Logothetis",
                        "Dimitri Logothetis, Jim McGrath",
                        "Marie Avgeropoulos, Rick Yune",
                        "Nicolas Cage, Alain Moussi, Frank Grillo, Tony Jaa, JuJu Chan, Marie Avgeropoulos, Rick Yune, Eddie Steeples, James P. Bennett, Dan Rizzuto, Ryan Tarran, John D. Hickman, Tommy Walker"
                )
        )
        movie.add(
                MovieEntity(

                        "2",
                        "Upside-Down Magic (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/xfYMQNApIIh8KhpNVtG1XRz0ZAp.jpg",
                        "Nory and her best friend Reina enter the Sage Academy for Magical Studies, where Nory’s unconventional powers land her in a class for those with wonky, or “upside-down,” magic. Undaunted, Nory sets out to prove that that upside-down magic can be just as powerful as right-side-up.",
                        "Joe Nussbaum",
                        "Nick Pustay",
                        "Nick Pustay",
                        "Izabela Rose, Siena Agudong, Kyle Howard, Max Torina, Elie Samouhi, Alison Fernandez, Vicki Lewis, Cynthia Kaye McWilliams, Jaime M. Callica, Callum Seagram Airlie, Amitai Marmorstein, Elaine Kao, Emily Delahunty, Ricardo Ortiz, Jason Asuncion, Yasmeen Fletcher, Melody Nosipho Niemann,Lou Ticzon, Valencia Budijanto, Josh Zaharia, Esther Li, Yoko Misawa, Rosalba Perez, Leslie Dos Remedios "

                )
        )
        movie.add(
                MovieEntity(

                        "3",
                        "Fatman (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/4n8QNNdk4BOX9Dslfbz5Dy6j1HK.jpg",
                        "A rowdy, unorthodox Santa Claus is fighting to save his declining business. Meanwhile, Billy, a neglected and precocious 12 year old, hires a hit man to kill Santa after receiving a lump of coal in his stocking.",
                        "Eshom Nelms, Ian Nelms",
                        "Eshom Nelms, Ian Nelms",
                        "Eshom Nelms, Ian Nelms",
                        "Mel Gibson, Walton Goggins, Marianne Jean-Baptiste, Shaun Benson, Paulino Nunes, Chance Hurstfield, Michelle Lang, Deborah Grover, Michael Dickson"


                )
        )
        movie.add(
                MovieEntity(
                        "4",
                        "Tenet (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/k68nPLbIST6NP96JmTxmZijEvCA.jpg",
                        "Armed with only one word - Tenet - and fighting for the survival of the entire world, the Protagonist journeys through a twilight world of international espionage on a mission that will unfold in something beyond real time.",
                        "Christopher Nolan",
                        "Christopher Nolan",
                        "Kenneth Branagh, Dimple Kapadia",
                        "John David Washington, Robert Pattinson, Elizabeth Debicki, Kenneth Branagh, Dimple Kapadia, Himesh Patel, Aaron Taylor-Johnson, Michael Caine, Clémence Poésy, Martin Donovan"

                )
        )
        movie.add(
                MovieEntity(

                        "5",
                        "The Dalton Gang (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/6OeGqp18oZucUGziMIRNhLouZ75.jpg",
                        "When their brother Frank is killed by an outlaw, brothers Bob Dalton, Emmett Dalton and Gray Dalton join their local sheriff's department. When they are cheated by the law, they turn to crime, robbing trains and anything else they can steal from over the course of two years in the early 1890's. Trying to out do Jesse James, they attempt to rob two banks at once in October of 1892, and things get ugly.",
                        "Christopher Forbes",
                        "Micah Lyons",
                        "Christopher Forbes",
                        "William Adams, Jezibell Anat, Gunner Bridger, Meghan Bridgers, Jerry Chesser, Alan Cope II, Judy DeLoach, William DeLoach"

                )
        )
        movie.add(
                MovieEntity(

                        "6",
                        "Hard Kill (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/ugZW8ocsrfgI95pnQ7wrmKDxIe.jpg",
                        "The work of billionaire tech CEO Donovan Chalmers is so valuable that he hires mercenaries to protect it, and a terrorist group kidnaps his daughter just to get it.",
                        "Matt Eskandari",
                        "Joe Russo, Chris LaMont, Clayton Haugen, Nikolai From",
                        "Joe Russo, Chris LaMont, Clayton Haugen, Nikolai From",
                        "Bruce Willis, Jesse Metcalfe, Natalie Eva Marie, Lala Kent, Texas Battle, Swen Temmel, Sergio Rizzuto, Tyler Jon Olson, Jon Galanis"

                )
        )
        movie.add(
                MovieEntity(

                        "7",
                        "Mulan (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/aKx1ARwG55zZ0GpRvU2WrGrCG9o.jpg",
                        "When the Emperor of China issues a decree that one man per family must serve in the Imperial Chinese Army to defend the country from Huns, Hua Mulan, the eldest daughter of an honored warrior, steps in to take the place of her ailing father. She is spirited, determined and quick on her feet. Disguised as a man by the name of Hua Jun, she is tested every step of the way and must harness her innermost strength and embrace her true potential.",
                        "Niki Caro",
                        "Rick Jaffa, Amanda Silver, Lauren Hynek, Elizabeth Martin, Amanda Silver",
                        "Rick Jaffa, Amanda Silver, Lauren Hynek, Elizabeth Martin, Amanda Silver",
                        "Liu Yifei, Jet Li, Tzi Ma, Donnie Yen, Gong Li, Jason Scott Lee, Yoson An, Rosalind Chao, Cheng Pei-Pei"

                )
        )
        movie.add(
                MovieEntity(

                        "8",
                        "Rogue City (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/9HT9982bzgN5on1sLRmc1GMn6ZC.jpg",
                        "Caught in the crosshairs of police corruption and Marseille’s warring gangs, a loyal cop must protect his squad by taking matters into his own hands.",
                        "Olivier Marchal",
                        "Olivier Marchal",
                        "Arnaud Putman, Jimena Esteve",
                        "Lannick Gautry,Stanislas Merhar, Kaaris, Jean Reno, David Belle,　Gérard Lanvin,　Moussa Maaskri,　Catherine Marchal,　Francis Renaud,　Erika Sainte,　Barbara Opsomer,　Ambre Pietri,　"

                )
        )
        movie.add(
                MovieEntity(

                        "9",
                        "Greenland (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/bNo2mcvSwIvnx8K6y1euAc1TLVq.jpg",
                        "John Garrity, his estranged wife and their young son embark on a perilous journey to find sanctuary as a planet-killing comet hurtles toward Earth. Amid terrifying accounts of cities getting levelled, the Garrity's experience the best and worst in humanity. As the countdown to the global apocalypse approaches zero, their incredible trek culminates in a desperate and last-minute flight to a possible safe haven.",
                        "Ric Roman Waugh",
                        "Chris Sparling",
                        "Dana Gonzales,　Clay A. Griffith",
                        "Gerard Butler,　Morena Baccarin,　David Denman,　Hope Davis,　Roger Dale Floyd,　Scott Glenn,　Andrew Bachelor,　Merrin Dungey,　Holt McCallany,　Gary Weeks,　Tracey Bonner,　Joshua Mikel,　Cate Jones,　Mike Gassaway,　Anissa Matlock"

                )
        )
        movie.add(
                MovieEntity(

                        "10",
                        "Chick Fight (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/4ZocdxnOO6q2UbdKye2wgofLFhB.jpg",
                        "When Anna Wyncomb is introduced to an an underground, all-female fight club in order to turn the mess of her life around, she discovers she is much more personally connected to the history of the club than she could ever imagine.",
                        "Paul Leyden",
                        "Joseph Downey, Hope Bryant",
                        "Joseph Downey",
                        "Bella Thorne, Malin Åkerman, Alec Baldwin, Dulcé Sloan, Mariana Paola Vicente, Vitoria Setta, Julie Michaels, Nicol Paone, Alexia Barlier, Fortune Feimster, Marissa Labog, Julia Sandstrom"

                )
        )

        return movie
    }
    fun generateRemoteTivishow_1(): List<TiviEntity> {
        val tivi = ArrayList<TiviEntity>()
        tivi.add(
                TiviEntity(

                        "1",
                        "The Mandalorian (2019)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/sWgBv7LV2PRoQgkxwlibdGXKz1S.jpg",
                        "After the fall of the Galactic Empire, lawlessness has spread throughout the galaxy. A lone gunfighter makes his way through the outer reaches, earning his keep as a bounty hunter.",
                        "Jon Favreau",
                        "Pedro Pascal, Carl Weathers, Giancarlo Esposito, Gina Carano, Temuera Morrison, Misty Rosas, Chris Bartlett, Rio Hackford, Emily Swallow, Paul Sun-Hyung Lee, Gabriel Ebert, Bill Burr, John Beasley, Dmitrious Bistrevsky, Brian Posehn",
                        "George Lucas, Christopher L. Yost, Dave Filoni, Jon Favreau, Rick Famuyiwa"

                )
        )
        tivi.add(
                TiviEntity(

                        "2",
                        "The Good Doctor (2017) ",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg",
                        "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives?",
                        "David Shore",
                        "Freddie Highmore, Antonia Thomas, Hill Harper, Richard Schiff, Nicholas Gonzalez, Christina Chang, Paige Spara, Fiona Gubelmann, Will Yun Lee, Tamlyn Tomita, Jasika Nicole, Elfina Luk, Teryl Rothery,Chuku Modu, Beau Garrett, Sheila Kelley, Karin Konoval ",
                        "Liz Friedman, Adam Scott Weissman, Brian Shin, David Hoselton, David Renaud, David Renaud, Debbie Ezer, Doris Egan, Freddie Highmore, Jessica Grasl, Johanna Lee"

                )
        )
        tivi.add(
                TiviEntity(

                        "3",
                        "Grey's Anatomy (2005) ",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg",
                        "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                        "Shonda Rhimes",
                        "Ellen Pompeo, Justin Chambers, James Pickens Jr., Chandra Wilson, Patrick Dempsey, Sara Ramirez, Sandra Oh, Kevin McKidd, Leven Rambin, Ryan Devlin, Jaina Lee Ortiz, Tina Holmes",
                        "Allan Heinberg, Ann Hamilton, Austin Guzman, Billy Harper, Bruce William Harper, Carolina Paiz, Chris Van Dusen"

                )
        )
        tivi.add(
                TiviEntity(

                        "4",
                        "Lucifer (2016)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg",
                        "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                        "Tom Kapinos",
                        "Tom Ellis, Lauren German, Kevin Alejandro, D.B. Woodside, Lesley-Ann Brandt, Rachael Harris, Scarlett Estevez, Aimee Garcia, Tricia Helfer, Tom Welling, Jon Sklaroff, Inbar Lavi, Kevin Rankin, Graham McTavish",
                        "Mike Dringenberg, Neil Gaiman, Sam Kieth, Jenn Kao, Recardo Lopez, Jr., Ildy Modrovich, Joe Henderson, Aiyana White, Alex Katsnelson"

                )
        )
        tivi.add(
                TiviEntity(

                        "5",
                        "Fear the Walking Dead (2015) ",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/wGFUewXPeMErCe2xnCmmLEiHOGh.jpg",
                        "What did the world look like as it was transforming into the horrifying apocalypse depicted in \"The Walking Dead\"? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question.",
                        "Dave Erickson, Robert Kirkman",
                        "Alycia Debnam-Carey, Danay García, Colman Domingo, Kim Dickens, Frank Dillane, Rubén Blades, Lennie James, Garret Dillahunt, Maggie Grace, Jenna Elfman, Cliff Curtis, Alexa Nisenson, Austin Amelio, Karen David, Mo Collins, Mercedes Mason",
                        "Alex Delyle, Andrew Chambliss, Ashley Cardiff, Dave Erickson, David Johnson, David Wiener, Ian Goldberg, Jack LoGiudice"

                )
        )
        tivi.add(
                TiviEntity(

                        "6",
                        "30 Coins (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/lw70w94nzCmIVSQvtMcuAjWHfWX.jpg",
                        "Father Vergara—an exorcist, boxer and ex-convict—lives in a remote village in Spain. Hoping to be lost and forgotten, Vergara’s demons catch up to him.",
                        "Jorge Guerricaechevarría, Álex de la Iglesia",
                        "Eduard Fernández, Macarena Gómez, Miguel Ángel Silvestre, Megan Montaner, Pepón Nieto, Manolo Solo",
                        "Jorge Guerricaechevarría, Álex de la Iglesia"

                )
        )
        tivi.add(
                TiviEntity(

                        "7",
                        "SEAL Team (2017)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/uTSLeQTeHevt4fplegmQ6bOnE0Z.jpg",
                        "The lives of the elite Navy Seals as they train, plan and execute the most dangerous, high-stakes missions our country can ask.",
                        "Benjamin Cavell",
                        "David Boreanaz, Max Thieriot, Neil Brown Jr., A.J. Buckley, Jessica Paré, Toni Trucks, Justin Melnick, Tyler Grey, Judd Lormand, Scott Foxx, Michaela McManus, Parisa Fakhri, Lucca De Oliveira",
                        "Tom Mularz, Jacob Roman, Kenny Ryan, Becky Mode, Benjamin Cavell, Beth Schacter"

                )
        )
        tivi.add(
                TiviEntity(

                        "8",
                        "The Queen's Gambit (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/zU0htwkhNvBQdVSIKB9s6hgVeFK.jpg",
                        "In a Kentucky orphanage in the 1950s, a young girl discovers an astonishing talent for chess while struggling with addiction.",
                        "Scott Frank, Allan Scott",
                        "Anya Taylor-Joy, Janina Elkin, Matthew Dennis Lewis, Russell Dennis Lewis, Dolores Carbonari, Bill Camp, Marielle Heller, Marcin Dorociński, Patrick Kennedy",
                        "Walter Tevis, Allan Scott, Scott Frank"

                )
        )
        tivi.add(
                TiviEntity(

                        "9",
                        "His Dark Materials (2019)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/g6tIKGc3f1H5QMz1dcgCwADKpZ7.jpg",
                        "Lyra is an orphan who lives in a parallel universe in which science, theology and magic are entwined. Lyra's search for a kidnapped friend uncovers a sinister plot involving stolen children, and turns into a quest to understand a mysterious phenomenon called Dust. She is later joined on her journey by Will, a boy who possesses a knife that can cut windows between worlds. As Lyra learns the truth about her parents and her prophesied destiny, the two young people are caught up in a war against celestial powers that ranges across many worlds.",
                        "Dawn Shadforth, Euros Lyn, Jamie Childs",
                        "Dafne Keen, Ruth Wilson, Ariyon Bakare, Will Keen, Lin-Manuel Miranda, Amir Wilson, Kit Connor, Ruta Gedmintas, Andrew Scott, Jamie Wilkes, Robert Emms, Daniel Frogson",
                        "Philip Pullman, Michael Clarkson, Paul Clarkson, Francesca Gardiner, Jack Thorne, Namsi Khan"

                )
        )
        tivi.add(
                TiviEntity(

                        "10",
                        "Supernatural (2005)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/KoYWXbnYuS3b0GyQPkbuexlVK9.jpg",
                        "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                        "Eric Kripke",
                        "Alexander Calvert, Samantha Ferris, Curtis Armstrong, Jensen Ackles, Alona Tal, Jared Padalecki, Ruth Connell, Jim Beaver Emily Swallow",
                        "Robert Singer, Robbie Thompson, Richard Hatem, Raelle Tucker, Rachel Nave, Nancy Won, Meghan Fitzmartin"

                )
        )

        return tivi
    }

    fun generateRemoteMovie_mock(): List<MovieEntity> {

        val movie = ArrayList<MovieEntity>()
        movie.add(
                MovieEntity(
                        "1",
                        "Jiu Jitsu (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/eLT8Cu357VOwBVTitkmlDEg32Fs.jpg",
                        "Every six years, an ancient order of jiu-jitsu fighters joins forces to battle a vicious race of alien invaders. But when a celebrated war hero goes down in defeat, the fate of the planet and mankind hangs in the balance.",
                        "Dimitri Logothetis",
                        "Dimitri Logothetis, Jim McGrath",
                        "Marie Avgeropoulos, Rick Yune",
                        "Nicolas Cage, Alain Moussi, Frank Grillo, Tony Jaa, JuJu Chan, Marie Avgeropoulos, Rick Yune, Eddie Steeples, James P. Bennett, Dan Rizzuto, Ryan Tarran, John D. Hickman, Tommy Walker"
                )
        )
        movie.add(
                MovieEntity(

                        "2",
                        "Upside-Down Magic (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/xfYMQNApIIh8KhpNVtG1XRz0ZAp.jpg",
                        "Nory and her best friend Reina enter the Sage Academy for Magical Studies, where Nory’s unconventional powers land her in a class for those with wonky, or “upside-down,” magic. Undaunted, Nory sets out to prove that that upside-down magic can be just as powerful as right-side-up.",
                        "Joe Nussbaum",
                        "Nick Pustay",
                        "Nick Pustay",
                        "Izabela Rose, Siena Agudong, Kyle Howard, Max Torina, Elie Samouhi, Alison Fernandez, Vicki Lewis, Cynthia Kaye McWilliams, Jaime M. Callica, Callum Seagram Airlie, Amitai Marmorstein, Elaine Kao, Emily Delahunty, Ricardo Ortiz, Jason Asuncion, Yasmeen Fletcher, Melody Nosipho Niemann,Lou Ticzon, Valencia Budijanto, Josh Zaharia, Esther Li, Yoko Misawa, Rosalba Perez, Leslie Dos Remedios "

                )
        )
        movie.add(
                MovieEntity(

                        "3",
                        "Fatman (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/4n8QNNdk4BOX9Dslfbz5Dy6j1HK.jpg",
                        "A rowdy, unorthodox Santa Claus is fighting to save his declining business. Meanwhile, Billy, a neglected and precocious 12 year old, hires a hit man to kill Santa after receiving a lump of coal in his stocking.",
                        "Eshom Nelms, Ian Nelms",
                        "Eshom Nelms, Ian Nelms",
                        "Eshom Nelms, Ian Nelms",
                        "Mel Gibson, Walton Goggins, Marianne Jean-Baptiste, Shaun Benson, Paulino Nunes, Chance Hurstfield, Michelle Lang, Deborah Grover, Michael Dickson"


                )
        )
        movie.add(
                MovieEntity(
                        "4",
                        "Tenet (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/k68nPLbIST6NP96JmTxmZijEvCA.jpg",
                        "Armed with only one word - Tenet - and fighting for the survival of the entire world, the Protagonist journeys through a twilight world of international espionage on a mission that will unfold in something beyond real time.",
                        "Christopher Nolan",
                        "Christopher Nolan",
                        "Kenneth Branagh, Dimple Kapadia",
                        "John David Washington, Robert Pattinson, Elizabeth Debicki, Kenneth Branagh, Dimple Kapadia, Himesh Patel, Aaron Taylor-Johnson, Michael Caine, Clémence Poésy, Martin Donovan"

                )
        )
        movie.add(
                MovieEntity(

                        "5",
                        "The Dalton Gang (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/6OeGqp18oZucUGziMIRNhLouZ75.jpg",
                        "When their brother Frank is killed by an outlaw, brothers Bob Dalton, Emmett Dalton and Gray Dalton join their local sheriff's department. When they are cheated by the law, they turn to crime, robbing trains and anything else they can steal from over the course of two years in the early 1890's. Trying to out do Jesse James, they attempt to rob two banks at once in October of 1892, and things get ugly.",
                        "Christopher Forbes",
                        "Micah Lyons",
                        "Christopher Forbes",
                        "William Adams, Jezibell Anat, Gunner Bridger, Meghan Bridgers, Jerry Chesser, Alan Cope II, Judy DeLoach, William DeLoach"

                )
        )
        movie.add(
                MovieEntity(

                        "6",
                        "Hard Kill (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/ugZW8ocsrfgI95pnQ7wrmKDxIe.jpg",
                        "The work of billionaire tech CEO Donovan Chalmers is so valuable that he hires mercenaries to protect it, and a terrorist group kidnaps his daughter just to get it.",
                        "Matt Eskandari",
                        "Joe Russo, Chris LaMont, Clayton Haugen, Nikolai From",
                        "Joe Russo, Chris LaMont, Clayton Haugen, Nikolai From",
                        "Bruce Willis, Jesse Metcalfe, Natalie Eva Marie, Lala Kent, Texas Battle, Swen Temmel, Sergio Rizzuto, Tyler Jon Olson, Jon Galanis"

                )
        )
        movie.add(
                MovieEntity(

                        "7",
                        "Mulan (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/aKx1ARwG55zZ0GpRvU2WrGrCG9o.jpg",
                        "When the Emperor of China issues a decree that one man per family must serve in the Imperial Chinese Army to defend the country from Huns, Hua Mulan, the eldest daughter of an honored warrior, steps in to take the place of her ailing father. She is spirited, determined and quick on her feet. Disguised as a man by the name of Hua Jun, she is tested every step of the way and must harness her innermost strength and embrace her true potential.",
                        "Niki Caro",
                        "Rick Jaffa, Amanda Silver, Lauren Hynek, Elizabeth Martin, Amanda Silver",
                        "Rick Jaffa, Amanda Silver, Lauren Hynek, Elizabeth Martin, Amanda Silver",
                        "Liu Yifei, Jet Li, Tzi Ma, Donnie Yen, Gong Li, Jason Scott Lee, Yoson An, Rosalind Chao, Cheng Pei-Pei"

                )
        )
        movie.add(
                MovieEntity(

                        "8",
                        "Rogue City (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/9HT9982bzgN5on1sLRmc1GMn6ZC.jpg",
                        "Caught in the crosshairs of police corruption and Marseille’s warring gangs, a loyal cop must protect his squad by taking matters into his own hands.",
                        "Olivier Marchal",
                        "Olivier Marchal",
                        "Arnaud Putman, Jimena Esteve",
                        "Lannick Gautry,Stanislas Merhar, Kaaris, Jean Reno, David Belle,　Gérard Lanvin,　Moussa Maaskri,　Catherine Marchal,　Francis Renaud,　Erika Sainte,　Barbara Opsomer,　Ambre Pietri,　"

                )
        )
        movie.add(
                MovieEntity(

                        "9",
                        "Greenland (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/bNo2mcvSwIvnx8K6y1euAc1TLVq.jpg",
                        "John Garrity, his estranged wife and their young son embark on a perilous journey to find sanctuary as a planet-killing comet hurtles toward Earth. Amid terrifying accounts of cities getting levelled, the Garrity's experience the best and worst in humanity. As the countdown to the global apocalypse approaches zero, their incredible trek culminates in a desperate and last-minute flight to a possible safe haven.",
                        "Ric Roman Waugh",
                        "Chris Sparling",
                        "Dana Gonzales,　Clay A. Griffith",
                        "Gerard Butler,　Morena Baccarin,　David Denman,　Hope Davis,　Roger Dale Floyd,　Scott Glenn,　Andrew Bachelor,　Merrin Dungey,　Holt McCallany,　Gary Weeks,　Tracey Bonner,　Joshua Mikel,　Cate Jones,　Mike Gassaway,　Anissa Matlock"

                )
        )
        movie.add(
                MovieEntity(

                        "10",
                        "Chick Fight (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/4ZocdxnOO6q2UbdKye2wgofLFhB.jpg",
                        "When Anna Wyncomb is introduced to an an underground, all-female fight club in order to turn the mess of her life around, she discovers she is much more personally connected to the history of the club than she could ever imagine.",
                        "Paul Leyden",
                        "Joseph Downey, Hope Bryant",
                        "Joseph Downey",
                        "Bella Thorne, Malin Åkerman, Alec Baldwin, Dulcé Sloan, Mariana Paola Vicente, Vitoria Setta, Julie Michaels, Nicol Paone, Alexia Barlier, Fortune Feimster, Marissa Labog, Julia Sandstrom"

                )
        )

        return movie
    }
    fun generateRemoteTivishow_mock(): List<TiviEntity> {
        val tivi = ArrayList<TiviEntity>()
        tivi.add(
                TiviEntity(

                        "1",
                        "The Mandalorian (2019)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/sWgBv7LV2PRoQgkxwlibdGXKz1S.jpg",
                        "After the fall of the Galactic Empire, lawlessness has spread throughout the galaxy. A lone gunfighter makes his way through the outer reaches, earning his keep as a bounty hunter.",
                        "Jon Favreau",
                        "Pedro Pascal, Carl Weathers, Giancarlo Esposito, Gina Carano, Temuera Morrison, Misty Rosas, Chris Bartlett, Rio Hackford, Emily Swallow, Paul Sun-Hyung Lee, Gabriel Ebert, Bill Burr, John Beasley, Dmitrious Bistrevsky, Brian Posehn",
                        "George Lucas, Christopher L. Yost, Dave Filoni, Jon Favreau, Rick Famuyiwa"

                )
        )
        tivi.add(
                TiviEntity(

                        "2",
                        "The Good Doctor (2017) ",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg",
                        "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives?",
                        "David Shore",
                        "Freddie Highmore, Antonia Thomas, Hill Harper, Richard Schiff, Nicholas Gonzalez, Christina Chang, Paige Spara, Fiona Gubelmann, Will Yun Lee, Tamlyn Tomita, Jasika Nicole, Elfina Luk, Teryl Rothery,Chuku Modu, Beau Garrett, Sheila Kelley, Karin Konoval ",
                        "Liz Friedman, Adam Scott Weissman, Brian Shin, David Hoselton, David Renaud, David Renaud, Debbie Ezer, Doris Egan, Freddie Highmore, Jessica Grasl, Johanna Lee"

                )
        )
        tivi.add(
                TiviEntity(

                        "3",
                        "Grey's Anatomy (2005) ",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg",
                        "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                        "Shonda Rhimes",
                        "Ellen Pompeo, Justin Chambers, James Pickens Jr., Chandra Wilson, Patrick Dempsey, Sara Ramirez, Sandra Oh, Kevin McKidd, Leven Rambin, Ryan Devlin, Jaina Lee Ortiz, Tina Holmes",
                        "Allan Heinberg, Ann Hamilton, Austin Guzman, Billy Harper, Bruce William Harper, Carolina Paiz, Chris Van Dusen"

                )
        )
        tivi.add(
                TiviEntity(

                        "4",
                        "Lucifer (2016)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg",
                        "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                        "Tom Kapinos",
                        "Tom Ellis, Lauren German, Kevin Alejandro, D.B. Woodside, Lesley-Ann Brandt, Rachael Harris, Scarlett Estevez, Aimee Garcia, Tricia Helfer, Tom Welling, Jon Sklaroff, Inbar Lavi, Kevin Rankin, Graham McTavish",
                        "Mike Dringenberg, Neil Gaiman, Sam Kieth, Jenn Kao, Recardo Lopez, Jr., Ildy Modrovich, Joe Henderson, Aiyana White, Alex Katsnelson"

                )
        )
        tivi.add(
                TiviEntity(

                        "5",
                        "Fear the Walking Dead (2015) ",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/wGFUewXPeMErCe2xnCmmLEiHOGh.jpg",
                        "What did the world look like as it was transforming into the horrifying apocalypse depicted in \"The Walking Dead\"? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question.",
                        "Dave Erickson, Robert Kirkman",
                        "Alycia Debnam-Carey, Danay García, Colman Domingo, Kim Dickens, Frank Dillane, Rubén Blades, Lennie James, Garret Dillahunt, Maggie Grace, Jenna Elfman, Cliff Curtis, Alexa Nisenson, Austin Amelio, Karen David, Mo Collins, Mercedes Mason",
                        "Alex Delyle, Andrew Chambliss, Ashley Cardiff, Dave Erickson, David Johnson, David Wiener, Ian Goldberg, Jack LoGiudice"

                )
        )
        tivi.add(
                TiviEntity(

                        "6",
                        "30 Coins (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/lw70w94nzCmIVSQvtMcuAjWHfWX.jpg",
                        "Father Vergara—an exorcist, boxer and ex-convict—lives in a remote village in Spain. Hoping to be lost and forgotten, Vergara’s demons catch up to him.",
                        "Jorge Guerricaechevarría, Álex de la Iglesia",
                        "Eduard Fernández, Macarena Gómez, Miguel Ángel Silvestre, Megan Montaner, Pepón Nieto, Manolo Solo",
                        "Jorge Guerricaechevarría, Álex de la Iglesia"

                )
        )
        tivi.add(
                TiviEntity(

                        "7",
                        "SEAL Team (2017)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/uTSLeQTeHevt4fplegmQ6bOnE0Z.jpg",
                        "The lives of the elite Navy Seals as they train, plan and execute the most dangerous, high-stakes missions our country can ask.",
                        "Benjamin Cavell",
                        "David Boreanaz, Max Thieriot, Neil Brown Jr., A.J. Buckley, Jessica Paré, Toni Trucks, Justin Melnick, Tyler Grey, Judd Lormand, Scott Foxx, Michaela McManus, Parisa Fakhri, Lucca De Oliveira",
                        "Tom Mularz, Jacob Roman, Kenny Ryan, Becky Mode, Benjamin Cavell, Beth Schacter"

                )
        )
        tivi.add(
                TiviEntity(

                        "8",
                        "The Queen's Gambit (2020)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/zU0htwkhNvBQdVSIKB9s6hgVeFK.jpg",
                        "In a Kentucky orphanage in the 1950s, a young girl discovers an astonishing talent for chess while struggling with addiction.",
                        "Scott Frank, Allan Scott",
                        "Anya Taylor-Joy, Janina Elkin, Matthew Dennis Lewis, Russell Dennis Lewis, Dolores Carbonari, Bill Camp, Marielle Heller, Marcin Dorociński, Patrick Kennedy",
                        "Walter Tevis, Allan Scott, Scott Frank"

                )
        )
        tivi.add(
                TiviEntity(

                        "9",
                        "His Dark Materials (2019)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/g6tIKGc3f1H5QMz1dcgCwADKpZ7.jpg",
                        "Lyra is an orphan who lives in a parallel universe in which science, theology and magic are entwined. Lyra's search for a kidnapped friend uncovers a sinister plot involving stolen children, and turns into a quest to understand a mysterious phenomenon called Dust. She is later joined on her journey by Will, a boy who possesses a knife that can cut windows between worlds. As Lyra learns the truth about her parents and her prophesied destiny, the two young people are caught up in a war against celestial powers that ranges across many worlds.",
                        "Dawn Shadforth, Euros Lyn, Jamie Childs",
                        "Dafne Keen, Ruth Wilson, Ariyon Bakare, Will Keen, Lin-Manuel Miranda, Amir Wilson, Kit Connor, Ruta Gedmintas, Andrew Scott, Jamie Wilkes, Robert Emms, Daniel Frogson",
                        "Philip Pullman, Michael Clarkson, Paul Clarkson, Francesca Gardiner, Jack Thorne, Namsi Khan"

                )
        )
        tivi.add(
                TiviEntity(

                        "10",
                        "Supernatural (2005)",
                        "https://image.tmdb.org/t/p/w220_and_h330_face/KoYWXbnYuS3b0GyQPkbuexlVK9.jpg",
                        "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                        "Eric Kripke",
                        "Alexander Calvert, Samantha Ferris, Curtis Armstrong, Jensen Ackles, Alona Tal, Jared Padalecki, Ruth Connell, Jim Beaver Emily Swallow",
                        "Robert Singer, Robbie Thompson, Richard Hatem, Raelle Tucker, Rachel Nave, Nancy Won, Meghan Fitzmartin"

                )
        )

        return tivi
    }
}
