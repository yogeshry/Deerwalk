package example

class BootStrap {

    def init = { servletContext ->
        def adminRole = Role.findOrSaveWhere(authority: 'ROLE_ADMIN')
        def user1 = User.findOrSaveWhere(name:'Suman Sapkota', email: 'suman@gmail.com',password: '12345')
        def user2 = User.findOrSaveWhere(name:'Rupesh Tamang', email: 'rupesh@gmail.com',password: '12345')
        def article1 = new Article(imageCaption:'Exploring the Qualcomm 5G booth.', title: "CES 2019: It’s the Year of Virtual Assistants and 5G", sku:'yyhh', textBody: 'The most surprising news came when a host of tech companies announced they were working with Apple to bring some of the company’s content and virtual assistant capabilities to their devices.\n' +
                '\n' +
                'Vizio, the TV maker, said its newer TVs would work with AirPlay, an Apple software feature for streaming video and audio content from an iPhone or Mac to a television screen. People will be able to speak to Siri on their iPhones to play content they had purchased from iTunes on the Vizio TVs. Samsung, Sony and LG announced similar partnerships with Apple.\n' +
                '\n' +
                'In the past, AirPlay and iTunes videos were mostly tied to Apple-made hardware like the Apple TV set-top box. Their expansion to third parties underlines Apple’s ambition to expand the revenue it generates from its internet content and services. That’s especially important now that sales of Apple’s cash cow, the iPhone, are slowing. This month, the company reduced its revenue expectations for the first time in 16 years.\n' +
                '\n' +
                'The move is also notable because it illustrates an unusual willingness by Apple to open its technology to other companies, including competitors like Samsung.\n' +
                '\n' +
                'In a statement provided by Samsung, Eddy Cue, Apple’s head of internet software and services, said that with the expansion of iTunes and AirPlay, “iPhone, iPad and Mac users have yet another way to enjoy all their favorite content on the biggest screen in their home.”\n' +
                '', imagePath: "articleImages/merlin_148912326_ee218eb7-6a3c-48e4-8d39-e41158b32af0-superJumbo.jpg",timestamp: new Date(),  user: user1)
        def article2 = new Article(imageCaption: 'President Trump, right, with President Xi Jinping of China, left, during a bilateral meeting in December.', title: 'Curbs on A.I. Exports? Silicon Valley Fears Losing Its Edge', textBody: 'SAN FRANCISCO — A common belief among tech industry insiders is that Silicon Valley has dominated the internet because much of the worldwide network was designed and built by Americans.\n' +
                '\n' +
                'Now a growing number of those insiders are worried that proposed export restrictions could short-circuit the pre-eminence of American companies in the next big thing to hit their industry, artificial intelligence.\n' +
                '\n' +
                'In November, the Commerce Department released a list of technologies, including artificial intelligence, that are under consideration for new export rules because of their importance to national security.\n' +
                '\n' +
                'Technology experts worry that blocking the export of A.I. to other countries, or tying it up in red tape, will help A.I. industries flourish in those nations — China, in particular — and compete with American companies.\n' +
                '\n' +
                '“The number of cases where exports can be sufficiently controlled are very, very, very small, and the chance of making an error is quite large,” said Jack Clark, head of policy at OpenAI, an artificial intelligence lab in San Francisco. “If this goes wrong, it could do real damage to the A.I. community.”\n' +
                '\n' +
                'The export controls are being considered as the United States and China engage in a trade war. The Trump administration has been critical of the way China negotiates deals with American companies, often requiring the transfer of technology to Chinese partners as the cost of doing business in the country. And federal officials are making an aggressive argument that China has stolen American technology through hacking and industrial espionage. ' , imagePath: "articleImages/00aiexports01-jumbo.jpg",timestamp: new Date(), user: user1)
        def article3 = new Article(imageCaption: 'Facebook called Courtney Davis, left, a telecommunications operator at the Police Department in Rock Hill, S.C., about a man who was live-streaming a suicide attempt, helping Sgt. Bruce Haire find him.',title: 'In Screening for Suicide Risk, Facebook Takes On Tricky Public Health Role', textBody: 'A police officer on the late shift in an Ohio town recently received an unusual call from Facebook.\n' +
                '\n' +
                'Earlier that day, a local woman wrote a Facebook post saying she was walking home and intended to kill herself when she got there, according to a police report on the case. Facebook called to warn the Police Department about the suicide threat.\n' +
                '\n' +
                'The officer who took the call quickly located the woman, but she denied having suicidal thoughts, the police report said. Even so, the officer believed she might harm herself and told the woman that she must go to a hospital — either voluntarily or in police custody. He ultimately drove her to a hospital for a mental health work-up, an evaluation prompted by Facebook’s intervention. (The New York Times withheld some details of the case for privacy reasons.)\n' +
                '\n' +
                'Police stations from Massachusetts to Mumbai have received similar alerts from Facebook over the last 18 months as part of what is most likely the world’s largest suicide threat screening and alert program. The social network ramped up the effort after several people live-streamed their suicides on Facebook Live in early 2017. It now utilizes both algorithms and user reports to flag possible suicide threats.\n' +
                '\n' +
                'Facebook’s rise as a global arbiter of mental distress puts the social network in a tricky position at a time when it is under investigation for privacy lapses by regulators in the United States, Canada and the European Union — as well as facing heightened scrutiny for failing to respond quickly to election interference and ethnic hatred campaigns on its site. Even as Facebook’s chief executive, Mark Zuckerberg, has apologized for improper harvesting of user data, the company grappled last month with fresh revelations about special data-sharing deals with tech companies.\n' +
                '\n' +
                'The anti-suicide campaign gives Facebook an opportunity to frame its work as a good news story. Suicide is the second-leading cause of death among people ages 15 to 29 worldwide, according to the World Health Organization. Some mental health experts and police officials said Facebook had aided officers in locating and stopping people who were clearly about to harm themselves.\n' +
                '\n' +
                'Facebook has computer algorithms that scan the posts, comments and videos of users in the United States and other countries for indications of immediate suicide risk. When a post is flagged, by the technology or a concerned user, it moves to human reviewers at the company, who are empowered to call local law enforcement.\n' +
                '', imagePath: "articleImages/merlin_148269525_018dd0d0-1c4d-4872-a46b-0ef5ff884552-superJumbo.jpg",timestamp: new Date(), user: user2)

        def article4 = new Article(imageCaption:'A Waymo autonomous vehicle in Chandler, Ariz., where the driverless cars have been attacked by residents on several occasions.', title: "Wielding Rocks and Knives, Arizonans Attack Self-Driving Cars", sku:'yyhh', textBody: 'CHANDLER, Ariz. — The assailant slipped out of a park around noon one day in October, zeroing in on his target, which was idling at a nearby intersection — a self-driving van operated by Waymo, the driverless-car company spun out of Google.\n' +
                '\n' +
                'He carried out his attack with an unidentified sharp object, swiftly slashing one of the tires. The suspect, identified as a white man in his 20s, then melted into the neighborhood on foot.\n' +
                '\n' +
                'The slashing was one of nearly two dozen attacks on driverless vehicles over the past two years in Chandler, a city near Phoenix where Waymo started testing its vans in 2017. In ways large and small, the city has had an early look at public misgivings over the rise of artificial intelligence, with city officials hearing complaints about everything from safety to possible job losses.\n' +
                '\n' +
                'Some people have pelted Waymo vans with rocks, according to police reports. Others have repeatedly tried to run the vehicles off the road. One woman screamed at one of the vans, telling it to get out of her suburban neighborhood. A man pulled up alongside a Waymo vehicle and threatened the employee riding inside with a piece of PVC pipe.\n' +
                '\n' +
                'In one of the more harrowing episodes, a man waved a .22-caliber revolver at a Waymo vehicle and the emergency backup driver at the wheel. He told the police that he “despises” driverless cars, referring to the killing of a female pedestrian in March in nearby Tempe by a self-driving Uber car.\n' +
                '\n' +
                '“There are other places they can test,” said Erik O’Polka, 37, who was issued a warning by the police in November after multiple reports that his Jeep Wrangler had tried to run Waymo vans off the road — in one case, driving head-on toward one of the self-driving vehicles until it was forced to come to an abrupt stop.\n' +
                '\n' +
                'His wife, Elizabeth, 35, admitted in an interview that her husband “finds it entertaining to brake hard” in front of the self-driving vans, and that she herself “may have forced them to pull over” so she could yell at them to get out of their neighborhood. The trouble started, the couple said, when their 10-year-old son was nearly hit by one of the vehicles while he was playing in a nearby cul-de-sac.\n' +
                '\n' +
                '“They said they need real-world examples, but I don’t want to be their real-world mistake,” said Mr. O’Polka, who runs his own company providing information technology to small businesses.\n' +
                '', imagePath: "articleImages/merlin_148373553_77eec5cf-2b18-496c-9c9d-24235797c7df-jumbo.jpg",timestamp: new Date(),  user: user2)
        def article5 = new Article(imageCaption: 'Donald Knuth at his home in Stanford, Calif. He is a notorious perfectionist and has offered to pay a reward to anyone who finds a mistake in any of his books. ', title: 'The Yoda of Silicon Valley', textBody: '\n' +
                'For half a century, the Stanford computer scientist Donald Knuth, who bears a slight resemblance to Yoda — albeit standing 6-foot-4 and wearing glasses — has reigned as the spirit-guide of the algorithmic realm.\n' +
                '\n' +
                'He is the author of “The Art of Computer Programming,” a continuing four-volume opus that is his life’s work. The first volume debuted in 1968, and the collected volumes (sold as a boxed set for about $250) were included by American Scientist in 2013 on its list of books that shaped the last century of science — alongside a special edition of “The Autobiography of Charles Darwin,” Tom Wolfe’s “The Right Stuff,” Rachel Carson’s “Silent Spring” and monographs by Albert Einstein, John von Neumann and Richard Feynman.\n' +
                '\n' +
                'With more than one million copies in print, “The Art of Computer Programming” is the Bible of its field. “Like an actual bible, it is long and comprehensive; no other book is as comprehensive,” said Peter Norvig, a director of research at Google. After 652 pages, volume one closes with a blurb on the back cover from Bill Gates: “You should definitely send me a résumé if you can read the whole thing.”\n' +
                '\n' +
                'The volume opens with an excerpt from “McCall’s Cookbook”:\n' +
                '\n' +
                'Here is your book, the one your thousands of letters have asked us to publish. It has taken us years to do, checking and rechecking countless recipes to bring you only the best, only the interesting, only the perfect.\n' +
                '\n' +
                'Inside are algorithms, the recipes that feed the digital age — although, as Dr. Knuth likes to point out, algorithms can also be found on Babylonian tablets from 3,800 years ago. He is an esteemed algorithmist; his name is attached to some of the field’s most important specimens, such as the Knuth-Morris-Pratt string-searching algorithm. Devised in 1970, it finds all occurrences of a given word or pattern of letters in a text — for instance, when you hit Command+F to search for a keyword in a document.\n' +
                '\n' +
                '[Like the Science Times page on Facebook. | Sign up for the Science Times newsletter.]\n' +
                '\n' +
                'Now 80, Dr. Knuth usually dresses like the youthful geek he was when he embarked on this odyssey: long-sleeved T-shirt under a short-sleeved T-shirt, with jeans, at least at this time of year. In those early days, he worked close to the machine, writing “in the raw,” tinkering with the zeros and ones.\n' +
                '\n' +
                '“Knuth made it clear that the system could actually be understood all the way down to the machine code level,” said Dr. Norvig. Nowadays, of course, with algorithms masterminding (and undermining) our very existence, the average programmer no longer has time to manipulate the binary muck, and works instead with hierarchies of abstraction, layers upon layers of code — and often with chains of code borrowed from code libraries. But an elite class of engineers occasionally still does the deep dive. ' , imagePath: "articleImages/merlin_148126767_cd44bb13-bc4d-4eeb-b1b7-73cc4dc174e7-superJumbo.jpg",timestamp: new Date(), user: user1)

        def comment1 = new Comment(text: "yydsfkjdsljjjjjjjjjjjjjj", timestamp: new Date(), articles: article1, user: user2)
        if(!user2.authorities.contains(adminRole)){
            UserRole.create(user2,adminRole,true)
        }
        if(!user1.authorities.contains(adminRole)){
            UserRole.create(user1,adminRole,true)
        }
        article1.save()
        comment1.save()
        article2.save()
        article3.save()
        article4.save()
        article5.save()

    }
    def destroy = {
    }
}
