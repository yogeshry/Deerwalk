package example

class BootStrap {

    def init = { servletContext ->
        def user1 = new User(name:'Suman Sapkota', email: 'suman@gmail.com', userID: 1)
        def user2 = new User(name:'Rupesh Tamang', email: 'rupesh@gmail.com', userID: 2)
        def article1 = new Article(imageCaption:'Exploring the Qualcomm 5G booth.', title: "CES 2019: It’s the Year of Virtual Assistants and 5G", sku:'yyhh', textBody: 'The most surprising news came when a host of tech companies announced they were working with Apple to bring some of the company’s content and virtual assistant capabilities to their devices.\n' +
                '\n' +
                'Vizio, the TV maker, said its newer TVs would work with AirPlay, an Apple software feature for streaming video and audio content from an iPhone or Mac to a television screen. People will be able to speak to Siri on their iPhones to play content they had purchased from iTunes on the Vizio TVs. Samsung, Sony and LG announced similar partnerships with Apple.\n' +
                '\n' +
                'In the past, AirPlay and iTunes videos were mostly tied to Apple-made hardware like the Apple TV set-top box. Their expansion to third parties underlines Apple’s ambition to expand the revenue it generates from its internet content and services. That’s especially important now that sales of Apple’s cash cow, the iPhone, are slowing. This month, the company reduced its revenue expectations for the first time in 16 years.\n' +
                '\n' +
                'The move is also notable because it illustrates an unusual willingness by Apple to open its technology to other companies, including competitors like Samsung.\n' +
                '\n' +
                'In a statement provided by Samsung, Eddy Cue, Apple’s head of internet software and services, said that with the expansion of iTunes and AirPlay, “iPhone, iPad and Mac users have yet another way to enjoy all their favorite content on the biggest screen in their home.”\n' +
                '', imagePath: "articleImages/merlin_148912326_ee218eb7-6a3c-48e4-8d39-e41158b32af0-superJumbo.jpg",timestamp: new Date(), articleID:3, user: user1)
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
                'The export controls are being considered as the United States and China engage in a trade war. The Trump administration has been critical of the way China negotiates deals with American companies, often requiring the transfer of technology to Chinese partners as the cost of doing business in the country. And federal officials are making an aggressive argument that China has stolen American technology through hacking and industrial espionage. ' , imagePath: "articleImages/00aiexports01-jumbo.jpg",timestamp: new Date(), articleID:7, user: user1)
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
                '', imagePath: "articleImages/merlin_148269525_018dd0d0-1c4d-4872-a46b-0ef5ff884552-superJumbo.jpg",timestamp: new Date(), articleID:8, user: user2)

        def comment1 = new Comment(text: "yydsfkjdsljjjjjjjjjjjjjj", timestamp: new Date(), commentID: 4, articles: article1, user: user2)
        user1.save()
        user2.save()
        article1.save()
        comment1.save()
        article2.save()
        article3.save()
    }
    def destroy = {
    }
}
