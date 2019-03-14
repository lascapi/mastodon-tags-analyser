# mastodon-tags-analyser
An analyser of Mastodon's tag in Java

I use this API : [mastodon4j](https://github.com/sys1yagi/mastodon4j), an example on [mastodon.zaclys.com](https://mastodon.zaclys.com/api/v1/accounts/101)

I use Java, Maven and Jersey ( the doc : https://jersey.github.io/documentation/latest/getting-started.html ) 

## Execution
Simple way  
```mvn exec:java```  
With some arguments  
```mvn exec:java -Dexec.args="zaclys"```

## External usefull doc 
- Overview of the Client API : https://docs.oracle.com/javaee/7/tutorial/jaxrs-client001.htm#BABBIHEJ
- https://jersey.github.io/documentation/latest/user-guide.html#d0e4368

## Result

![](https://mastodon.zaclys.com/system/media_attachments/files/001/524/641/original/be8c3f9ebde2211c.png?1552559795)

This picture is realized with theses datas : 

```
zaclys
        associations
                [académique, actu, actulibre, aide, ancenis, animaux, asso, associations, autel, benevolat, biblotheque, causeanimale, changemakers, chien, citoyens, clients, climat, clôture, collectifs, comptabilité, comptable, conférence, conseil, constitution, debian, droits, décision, enmarche, ess, essonne, europe, fediverse, frenchimpact, gj, help, hubzilla, installparty, institutions, internet, isf, larem35, lelogiciellibre, libre, libreàvous, librisme, licences, linux, logiciellibre, loi1901, macron, mastodon, mediatheque, militant·es, morale, numeriques, ongs, onpeuttousaider, pacteécologiqueetsocial, paywall, petitcommerce, rennes, sa, santé, scop, sexe, solidarité, syndicats, techforrealgood, toulouse, trad, travail, travailleurs, travailleuses, ubuntu, universitaires, upsilon, urgence, venteforcée, vidéo, vieassociative, vieprivee, vieprivée]
        cloud
                [bodycam, bsod, cloud, cloudfirewall, compute, cozycloud, decentralization, digital, docker, edge, emotionalmachine, fediverse, firefoxsend, floss, foss, france, friendly, gcp, geek, google, googledrive, gpu, humanetech, hébergement, ia, iliad, ip, libre, mail, mardiconseil, nextcloud, nodejs, numérique, opensoure, pixelfed, polizeigesetz, privacy, retirementasaservice, scaleway, security, serverless, service, silicon, surveillancecapitalism, telco]
        collaboratif
                [actulibre, bureautique, carte, cartographie, collaboratif, dans_la, danslapratique, documentation, gestion, joplin, mis_en, misenavant, nextcloud, opensource, openstreetmap, pratique, slack]
        education
                [allier, apprentissage, apps, atelier, autableau, blog, boingboing, bouteillealamer, buzzword, castaner, children, college_admissions_scandal, conformism, cycling, debian, decentralization, design, dev, education, enfant, enspiral, eutopie, exeat, fablab, francophonie, freesoftware, funny, giletsjaunes, guillotine_watch, hegemony, high_schools, highschool, ineat, instit, key_worldwide_foundation, laboratoire, late_stage_capitalism, law, lightroastcomics, linux, loiblanquer, lori_loughlin, massimo_giannulli, mcmansion_hell, meditation, microsolidarity, mouvement, nature, newhere, norms, nz, occupy_law_school, oer, opensource, osor, parenting, pe, pedagogy, permutations, privacy, professeur, puydedome, re_identification_attacks, reoi, running, sambaédu, school, schools, se4, teachers, technology, third_party_doctrine, tierslieux, unicef, usc, ux, valdemarne, verbing, video, vocabulary, william_singer]
        enfant
                [adulte, album, alimentation, amitié, amour, audio, bébé, cantine, darktable, dme, décroissance, education, enfant, enfermement, environnement, famille, fiesta, fn, fonctionnaires, fête, giletsjaunes, homéopathie, impôts, islam, joie, lacimade, lecture, lepen, litterature, livre, macron, mariage, musulman, méditation, nature, noiretblanc, nourriture, noël, oer, paix, parentalité, paris, periodique, photo, photographie, portrait, question, redistributionrichesse, responsabilité, santé, shooting, storyweaver, stress, tech, toulouse, télévision, vegan, vidéo, véganisme, végétarien, végétarisme, zad, écologie, écran]
        framapiaf
                [actualités, aide, al, alternativelibertaire, censure, ceph, chatons, desintox, dégooglisation, dégooglison, foss, frama, framabaffe, framapaf, framapiaf, framasoft, gafam, gj, letmebefree, mastodon, nouveauici, paris, peertube, pouet, privatelife, question, toot, tusky]
        help
                [adobe, adobecc, advice, aftereffects, aide, amwriting, android, animation, art, askfedi, askfediverse, bitcoin, boost, cartemere, community, creativecommons, culture, degooglisation, docker, donation, feary, feroicfantasy, google, hardware, help, lazyweb, lecture, livres, mastoart, monero, motherboard, music, nextcloud, openstreetmap, osm, pc, pocophone, question, reparation, repouet, rgpd, scifi, scifiwriting, shuttle, smartphone, softwarehelp, softwarequestions, translation, web]
        hipchat
                [atlassian, bridge, chat, collaboratif, discord, gitter, groupchat, hipchat, irc, kollaborationssoftware, libre, matrix, mattermost, messaging, opensource, privacy, rocketchat, slack, telegram, vieprivee, xmpp, zaclys]
        initiative
                [alternative, bills, bio, cointelegraph, democracy, diamond, désinformation, e, eco, ecologie, ecology, economie, energiesprong, energy, energyefficiency, energysaving, entreaide, fakenews, gafa, giletsjaunes, gluten, great, homes, information, initiative, instagram, lecture, local, lot, miti, moratorium, mozilla, netherlands, nsfw, partager, photos, pix, populaire, post, pouet, randomselection, ric, référendum, réseau, santé, society, sortition, soutien, suisse, trust, uk, voteélectronique, végétarienne, zaclys]
        internet
                [aaronswartz, actu, actulibre, afnic, autonews, balkan, bestof, bigtech, captainmarvel, communs, contributopia, culturelibre, design, digital, disney, droitd, droitdauteur, dégooglisonsinternet, educnum, europe, firefox, france, freesoftware, freesw, geek, hatespeech, histoire, infolibre, internet, internetetsociété, kinderpornographie, libre, libreslogiciels, libreàvous, licornes, lmpc, logiciel, love, marvel, mastodon, mozilla, net, neutralité, numérique, opensource, pairàpair, partage, peace, planet, podcast, pointfr, politik, politique, revue_de_presse, rgpd, runet, révolution, sensibilisation, server, shaarli, siliconvalley, smalltech, sweetux, timbernerslee, trolle, usa, web, web30, www, zensur, économie]
        libre
                [actulibre, amandapalmer, ammar404, arch, archlinuxeries, atelier, bandcamp, bandcampetcompagnie, bestof, capitaliste, chromebook, cloud, condresos, culture, cybersécurité, dav, debian, decentralise, distribution, donnéesprivées, développementdurable, emmabuntusdebianedition, federe, fedora, floss, framatube, free, friendly, g1, gafam, geek, geekeries, horizonsparallèles, informations, informatique, internet, june, lakka, laptop, libre, libreries, linux, logiciel, logiciellibre, manjaro, mobile, monnaie, monoculture, musique, netbook, numérique, occitanie, opensource, os, pamac, partage, pixelfed, plickers, populaire, port, privacy, pureos, pétrole, rebornos, retroarch, retrogaming, révolution, serveur, service, synchronisation, technologie, triton, trucsdegeek, tunisie, ubuntu, usagers, vieprivée, villeurbanne, vrac]
        mail
                [amavis, atom, bahncard, blogmod, caldav, calendar, civil, cloud, courriel, dafuq, disclaimer, doraemon, droit, email, emotet, hacking, html, humor, korben, letterwriting, macg, mail, mozilla, newmanity, nogoogle, numerama, pdf, questiondujour, rechnung, security, selfhosting, snailmail, snailmailrevival, spam, suisse, thunderbird, ?????]
        mastodon
                [activitypub, actu, astuce, avion, bot, deletetwitter, desktop, facebook, fediverse, film, frontend, harassment, i2p, instagram, kevin, logiciellibre, mastalab, mastodon, opensource, pixelfed, tusky, twitter, ux]
        nextcloud
                [aide, amazon, backontracks, cloud, collabora, collaboraonline, compliance, fairphoneopen, fdroid, firefox, floss, foss, freshrss, funkwhale, gdpr, google, googledrive, help, nextcloud, opensondage, opensoure, pastebin, peertube, raspberrypi, repouet, send, sentry, solid, wallabag, wordpress]
        office
                [archive, auticon, autism, bigboobs, computer, dakimakura, database, desk, economia, education, embarrassing, excel, frustrated, garterbelt, gdpr, glasses, gnu, gnulinux, intern, internetexplorer, internship, libreoffice, libreooffice, linux, macbook, microsoft, microsoftexchangeserver, nextcloud, nyt, office, office365, opensource, outfit, outlook, patchdayfebruar2019, people, position, powerpoint, privacy, processor, productivity, quiz, religion, security, selfhosting, sexo, shortcuts, sicherheitsupdates, software, softwarelibre, stockings, sucks, tastenkombinationen, tease, teasing, telemetry, tgiqf, thedocumentfoundation, theverge, tool, unbelievable, ux, wars, windows, word, work, workplace]
        onlyoffice
                [actu, actulibre, appimage, bureautique, cloud, collabora, collaboratif, docker, efail, encoreunpetitpas, fedora, forkofftogether, freeoffice, hetzner, libre, libreoffice, linux, linuxmint, microsoftoffice, nextcloud, office, onlyoffice, open, opensource, owncloud, privacy, pydio, selfhosting, snap, traitement_texte, ubuntu, vieprivee]
        opensource
                [adobe, adobexd, android, aws, blog, cloudcomputing, clt2019, conferences, cybersécurité, decentralize, design, devops, drivers, emails, entreprise, event, fdroid, floss, foss, fossasia, freesoftware, gafam, gameengine, godotengine, ia, icon, indico, inria, internet, kodi, lectures, lfosls, libre, linux, logo, machinelearning, mastalab, mastodon, meetings, mesa, multimedia, opengl, opensource, organization, oss, ossbymaif, presentator, privacy, scikitlearn, server, shaarli, softwarelibre, tusky, update, vulkan, web]
        partager
                [association, bienscommuns, boxe, ccmusic, changementclimatique, climat, commun, copyleft, creativecommons, créations, cuisine, culture, decouvrir, dogmazic, domainepublic, droitsd, développement, en, environnement, gestesquisauvent, gf2018, greenpeace, guyane, important, initiative, introduction, introductions, librazik, libre, licenceartlibre, linux, linuxmao, livre, lyon, mao, merci, musculation, musique, musiquelibre, natation, netlabels, partager, passion, politiciens, pouet, projets, présentation, psychologie, québec, radio, retwitter, solidarité, son, soutien, sport, urgenceclimatique, voter, voyager, zaclys, écologie]
        pesticides
                [abeilles, actionscitoyennes, afps, agricole, agriculture, agrilecture, arrêtéabeilles, aude, bio, biodynamie, bretagne, canada, charente, charentepalestinesolidarité, cinédébat, cinéma, climat, conférence, coquelicots, dialogue, documentaire, débat, dép16, film, finistère, gaza, giletsjaunes, glyphosate, glyphosathe, greenouille, herbicides, insectes, journalisme, lecture, manifestation, marthon, mondediplomatique, nature, nousvoulonsdescoquelicots, palestine, paysan, paysans, pesticides, politique, pollutions, quimper, réunion, samouniroad, santé, stefanosavona, toxiques, travail, vin, viticulture, zaclys, zérofossile, zététique]
        php
                [actu, actulibre, announcements, apache, apparmor, arm, btrfsprogs, dev, disco, facebook, foss, glamp, gnome, gnu, gpd, gtk, hhvm, hiphopvirtualmachine, i686, intel, java, jit, jpg, kde, kernel, lamp, libreoffice, libstorage, linux, mariadb, moodle, music, mysql, nagios, network, php, poppler, pragha, proposed, python, qpdf, rfc, rt, snapper, song, sysadmin, systèmed, tumbleweed, ubuntu, uuic, videomission, w3schools, web, weeklynews, wicked]
        pouet
                [actualités, al, alternativelibertaire, astuce, bot, champimignon, deletefacebook, deleteme, dessin, framapiaf, ineptie, initiative, introductions, jdcjdr, langue, libriste, mastodon, mediateurnumerique, metoo, nddl, nouveauici, paris, partager, pouet, presentations, repouet, rions_un_coup, soutien, toot, tuto, tweet, twitter, welcome, zaclys]
        privacy
                [actulibre, ai, android, androidq, artificialintelligence, automating_opsec, boingboing, briar, chiffrement, chiffreztout, citrix, cloud, cloudfirewall, cpu, cybersecurity, cybersécurité, data, decentralization, deeplearning, dnr, duckduckgo, défensenumérique, développementdurable, encrypted, encryption, ephemeral_messaging, eu, facebook, federated, fediverse, fichier, firefox, framadrop, freesoftware, freeyourandroid, fuckoffgoogle, gafam, gdpr, ghidra, google, googleplay, gratuit, guardianproject, hack, humanetech, hypervisor, im, infosec, letterboxing, libre, lufi, machinelearning, marriott, messagerie, microsoft, nsa, oneplus, opensource, opsec, orbot, partage, podcast, privacy, protonmail, rennes, rowhammer, russie, security, securitynow, send, sggrc, smartphone, snapchat, spoiler, stevegibson, surveillancecapitalism, tails, televersement, tls13, tor, tracking, vieprivée, vulnerability, web, wetransfer, wickr, windows]
        recherche
                [acs, affects, anes, appelàprojets, apprentissage, astronomie, astuce, autonomie, bachelard, behringer, bestof, biais, bibliographie, choosefrance, chrome, cnrs, cognition, connaissance, critique, croyance, didactique, doute, enseignement, enseignementsup, esprit, espritcritique, esr, essai, etudesenfrance, flexibilité, formation, google, histoire, images, inhibition, innovation, intelligence, intelligenceartificielle, internet, intuition, irem, jachete, loire, mathématiques, navigateur, philosophie, pologne, prospective, précarité, psychologie, publication, pédagogie, question, qwant, raison, recherche, rennes, rogueesr, réalité, réunion, scepticisme, science, scienceenmarche, scienceparticipative, secondemain, shoah, sociologie, thales, université, universités, vraisemblance, vérité, émotion]
        roundcube
                [arnaque, azure, brique, degooglisons, docuwiki, dovecot, elastic, infosec, kde, kolab, kube, mail, microsoft, netdata, neutrinet, nextcloud, nginx, numérique, php, postfix, qt, rainloop, roundcube, servicios, sogo, thunderbird, transmission, vpn, wordpress, yunohost, zaclys]
        santé
                [a_la_une, actulibre, alimentation, alimentation_et_agriculture_biologique, alternatives, amazon, animaux, apple, canardenchaine, cantines, censure, cgu, chatons, climat, croixrouge, droitd, endométriose, enfants, environnement, facebook, fehap, gafam, google, health, international, internet, lobby, lobbying, logiciellibre, logicielslibres, maladie, microsoft, nexem, opco, pesticides, planète, politique, pollution, pollutions, quotidien, réseausocial, santé, science, shaarli, sida, sommeil, synerpa, sécurité, sécuritéalimentaire, tunisie, téléphone, unicancer, vaccination, vegan, viande, vieprivée, écologie, économie]
        service
                [academia, actulibre, akku, analytics, anoxinon, apple, applet2, artistes, artsdelascene, backup, bios, boot, borg, bourse, carte, cloud, code, computer, coreboot, critical, customer, datenverlust, dienste, diffusion, distribution, donner, développement, energie, evaluation, fedora, finance, firmware, formation, free, friendly, future, geek, gnu, grandpublic, halcyon, hp, ibm, ifixit, imacpro, infosec, installation, interactive, investissement, inédit, iphonexr, iso, libre, libreroot, linus, linux, logicielslibres, macbookpro, maintenance, manchot, mastodon, microsoft, mondiale, navigateur, news, nouveaut, onion, onionshare, opt, os, partage, pc, pengouin, pixelfed, planet, première, private, privateur, processeur, processor, product, programmateurs, promotion, provider, redhat, reparatur, repouet, research, reseau, retour, rpt, rückruf, scholarship, science, searx, securite, security, server, serveur, service, smartphones, spectaclevivant, ssd, stateoftheart, support, system, systemd, sécurité, tarifs, teaching, teardown, tenure, timer, tor, torbrowser, torvald, ubuntu, update, verein, verschlüsselung, virtualisation, wartungsarbeiten, windows, xmpp]
        slack
                [collaboratif, decentralized, digital, federated, fediverso, gdrive, hedicho, itespresso, jdn, lesechos, macg, matrix, messaging, opensource, pratique, riot, rocketchat, silicon, sip, slack, theverge, toolkit, trello, ui, xmpp]
        soutien
                [acteviii, amazon, android, anti, antirep, assassins, cagnotte, campagne, clément, communication, cryptpad, dettinger, dev, diaspora, digital, donate, dons, développement, enventelibre, facteurs, fpp, frais, framasoft, inquiétude, jesors, justice, laquadrature, leetchi, liberapay, libre, linux, lyon, mastodon, mentale, militants, moncollègeessonne, méric, peertube, perso, pixelfed, radiolibre, risque, santé, souffrance, soutien, stopbeingpoor, stress, travail, web, zad]
        toulouse
                [9mars2019, acte17, actexvi, alternatiba, artsdelarue, bretagne, chanson, climat, clown, colors, culture, démocratie, exposition, france, gafam, giletsjaunes, glyphosate, grenadesurgaronne, internet, libreenfête, logiciels, marchedusiècle, musique, nantes, occitanie, sciure, sky, spectaclevivant, srreetphotography, street, streetphotography, thcon2019, theatre, toilettesseches, toulouse]
        tusky
                [accessibility, fdroid, fedilab, i18n, mastalab, mastoart, mastodon, opencollective, opensource, polls, tusky]
        vieprivee
                [alternative, android, capitalisme, chrome, conference, conférence, data, degooglisation, donneespersonnelles, enseignants, eple, framasoft, gafam, github, google, infographie, internet, limoges, numérique, opensource, privacy, professeurs, reconnaissancefaciale, reseauxsociaux, rgpd, securite, security, surveillance, surveillanceciblee, surveillancedemasse]
        zaclys
                [associations, cloud, collaboratif, education, enfant, framapiaf, help, hipchat, initiative, internet, libre, mail, mastodon, nextcloud, office, onlyoffice, opensource, partager, pesticides, php, pouet, privacy, recherche, roundcube, santé, service, slack, soutien, toulouse, tusky, vieprivee, zaclys]
```
