package com.flashtalking.reportmanager.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

	@RequestMapping("/Test")
	public @ResponseBody ResponseEntity<String> Test() {
		String json = "{\r\n" + 
				"    \"jobs\": [\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Regression - Basic Concept Validations\",\r\n" + 
				"            \"builds\": [\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 3,\r\n" + 
				"                            \"totalCount\": 51\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 8806594,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Basic Concept Validations #216\",\r\n" + 
				"                    \"id\": \"216\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540864489629,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Basic%20Concept%20Validations/216/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 3,\r\n" + 
				"                            \"totalCount\": 51\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 8808793,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Basic Concept Validations #215\",\r\n" + 
				"                    \"id\": \"215\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540778120381,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Basic%20Concept%20Validations/215/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 2,\r\n" + 
				"                            \"totalCount\": 51\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 8841529,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Basic Concept Validations #214\",\r\n" + 
				"                    \"id\": \"214\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540691619548,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Basic%20Concept%20Validations/214/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 3,\r\n" + 
				"                            \"totalCount\": 51\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 8735034,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Basic Concept Validations #213\",\r\n" + 
				"                    \"id\": \"213\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540605209487,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Basic%20Concept%20Validations/213/\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"color\": \"yellow\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Regression - Basic Flight Validations\",\r\n" + 
				"            \"builds\": [\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 28\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 6266464,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Basic Flight Validations #220\",\r\n" + 
				"                    \"id\": \"220\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540873302642,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Basic%20Flight%20Validations/220/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 28\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 6277906,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Basic Flight Validations #219\",\r\n" + 
				"                    \"id\": \"219\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540786937092,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Basic%20Flight%20Validations/219/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 28\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 6277060,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Basic Flight Validations #218\",\r\n" + 
				"                    \"id\": \"218\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540700467910,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Basic%20Flight%20Validations/218/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 28\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 6279432,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Basic Flight Validations #217\",\r\n" + 
				"                    \"id\": \"217\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540613964577,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Basic%20Flight%20Validations/217/\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"color\": \"blue\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Regression - Basic Strategy Validations\",\r\n" + 
				"            \"builds\": [\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 19\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 5129602,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Basic Strategy Validations #243\",\r\n" + 
				"                    \"id\": \"243\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540879577941,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Basic%20Strategy%20Validations/243/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 19\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 5121120,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Basic Strategy Validations #242\",\r\n" + 
				"                    \"id\": \"242\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540793222340,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Basic%20Strategy%20Validations/242/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 19\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 5127609,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Basic Strategy Validations #241\",\r\n" + 
				"                    \"id\": \"241\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540706753158,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Basic%20Strategy%20Validations/241/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 19\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 5124706,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Basic Strategy Validations #240\",\r\n" + 
				"                    \"id\": \"240\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540620253976,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Basic%20Strategy%20Validations/240/\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"color\": \"blue\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Regression - Campaign And Company Validations\",\r\n" + 
				"            \"builds\": [\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 6,\r\n" + 
				"                            \"totalCount\": 12\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 853069,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Campaign And Company Validations #98\",\r\n" + 
				"                    \"id\": \"98\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540884713183,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Campaign%20And%20Company%20Validations/98/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 6,\r\n" + 
				"                            \"totalCount\": 12\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 875645,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Campaign And Company Validations #97\",\r\n" + 
				"                    \"id\": \"97\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540851328207,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Campaign%20And%20Company%20Validations/97/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 6,\r\n" + 
				"                            \"totalCount\": 12\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 869282,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Campaign And Company Validations #96\",\r\n" + 
				"                    \"id\": \"96\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540823133810,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Campaign%20And%20Company%20Validations/96/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 6,\r\n" + 
				"                            \"totalCount\": 12\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 868622,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Campaign And Company Validations #95\",\r\n" + 
				"                    \"id\": \"95\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540798352687,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Campaign%20And%20Company%20Validations/95/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 12\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 2004286,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Campaign And Company Validations #74\",\r\n" + 
				"                    \"id\": \"74\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1539592219035,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Campaign%20And%20Company%20Validations/74/\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"color\": \"yellow\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Regression - Concept Targeting Validations\",\r\n" + 
				"            \"builds\": [\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 19\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 3310363,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Concept Targeting Validations #171\",\r\n" + 
				"                    \"id\": \"171\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540865247347,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Concept%20Targeting%20Validations/171/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 19\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 3310927,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Concept Targeting Validations #170\",\r\n" + 
				"                    \"id\": \"170\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540779156789,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Concept%20Targeting%20Validations/170/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 19\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 3303394,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Concept Targeting Validations #169\",\r\n" + 
				"                    \"id\": \"169\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540693057598,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Concept%20Targeting%20Validations/169/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 19\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 3308596,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Concept Targeting Validations #168\",\r\n" + 
				"                    \"id\": \"168\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540605219381,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Concept%20Targeting%20Validations/168/\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"color\": \"blue\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Regression - Creative Library Validations\",\r\n" + 
				"            \"builds\": [\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 67,\r\n" + 
				"                            \"totalCount\": 73\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 24943239,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Creative Library Validations #5\",\r\n" + 
				"                    \"id\": \"5\",\r\n" + 
				"                    \"result\": \"FAILURE\",\r\n" + 
				"                    \"timestamp\": 1540245953577,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Creative%20Library%20Validations/5/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 2,\r\n" + 
				"                            \"totalCount\": 34\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 7144188,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Creative Library Validations #4\",\r\n" + 
				"                    \"id\": \"4\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1536078760849,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Creative%20Library%20Validations/4/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 13,\r\n" + 
				"                            \"totalCount\": 26\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 9036088,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Creative Library Validations #3\",\r\n" + 
				"                    \"id\": \"3\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1535034035240,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Creative%20Library%20Validations/3/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 26,\r\n" + 
				"                            \"totalCount\": 26\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 2538738,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Creative Library Validations #2\",\r\n" + 
				"                    \"id\": \"2\",\r\n" + 
				"                    \"result\": \"FAILURE\",\r\n" + 
				"                    \"timestamp\": 1534973485762,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Creative%20Library%20Validations/2/\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"color\": \"red\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Regression - Existing Network Validations\",\r\n" + 
				"            \"builds\": [\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 40,\r\n" + 
				"                            \"totalCount\": 55\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 4796151,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Existing Network Validations #232\",\r\n" + 
				"                    \"id\": \"232\",\r\n" + 
				"                    \"result\": \"FAILURE\",\r\n" + 
				"                    \"timestamp\": 1540886280129,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Existing%20Network%20Validations/232/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 41,\r\n" + 
				"                            \"totalCount\": 55\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 4348813,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Existing Network Validations #231\",\r\n" + 
				"                    \"id\": \"231\",\r\n" + 
				"                    \"result\": \"FAILURE\",\r\n" + 
				"                    \"timestamp\": 1540799880231,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Existing%20Network%20Validations/231/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 42,\r\n" + 
				"                            \"totalCount\": 55\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 4508735,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Existing Network Validations #230\",\r\n" + 
				"                    \"id\": \"230\",\r\n" + 
				"                    \"result\": \"FAILURE\",\r\n" + 
				"                    \"timestamp\": 1540713480174,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Existing%20Network%20Validations/230/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 42,\r\n" + 
				"                            \"totalCount\": 55\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 4608709,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Existing Network Validations #229\",\r\n" + 
				"                    \"id\": \"229\",\r\n" + 
				"                    \"result\": \"FAILURE\",\r\n" + 
				"                    \"timestamp\": 1540627080324,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Existing%20Network%20Validations/229/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 13,\r\n" + 
				"                            \"totalCount\": 55\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 4692395,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Existing Network Validations #228\",\r\n" + 
				"                    \"id\": \"228\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540540680143,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Existing%20Network%20Validations/228/\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"color\": \"red\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Regression - Landing Page Validations\",\r\n" + 
				"            \"builds\": [\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 5,\r\n" + 
				"                            \"totalCount\": 26\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 2826366,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Landing Page Validations #212\",\r\n" + 
				"                    \"id\": \"212\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540891280217,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Landing%20Page%20Validations/212/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 5,\r\n" + 
				"                            \"totalCount\": 26\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 3516722,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Landing Page Validations #211\",\r\n" + 
				"                    \"id\": \"211\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540804237914,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Landing%20Page%20Validations/211/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 5,\r\n" + 
				"                            \"totalCount\": 26\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 2717141,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Landing Page Validations #210\",\r\n" + 
				"                    \"id\": \"210\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540717998607,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Landing%20Page%20Validations/210/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 4,\r\n" + 
				"                            \"totalCount\": 26\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 2850261,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Landing Page Validations #209\",\r\n" + 
				"                    \"id\": \"209\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540631694506,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Landing%20Page%20Validations/209/\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"color\": \"yellow\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Regression - Macros And Pixels\",\r\n" + 
				"            \"builds\": [\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 19,\r\n" + 
				"                            \"totalCount\": 100\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 4210390,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Macros And Pixels #212\",\r\n" + 
				"                    \"id\": \"212\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540894113396,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Macros%20And%20Pixels/212/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 21,\r\n" + 
				"                            \"totalCount\": 100\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 4258476,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Macros And Pixels #211\",\r\n" + 
				"                    \"id\": \"211\",\r\n" + 
				"                    \"result\": \"FAILURE\",\r\n" + 
				"                    \"timestamp\": 1540807763052,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Macros%20And%20Pixels/211/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 25,\r\n" + 
				"                            \"totalCount\": 100\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 4003353,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Macros And Pixels #210\",\r\n" + 
				"                    \"id\": \"210\",\r\n" + 
				"                    \"result\": \"FAILURE\",\r\n" + 
				"                    \"timestamp\": 1540720723711,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Macros%20And%20Pixels/210/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 19,\r\n" + 
				"                            \"totalCount\": 100\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 4753480,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Macros And Pixels #209\",\r\n" + 
				"                    \"id\": \"209\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540634552931,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Macros%20And%20Pixels/209/\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"color\": \"yellow\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Regression - Manager Validations\",\r\n" + 
				"            \"builds\": [\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 22\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 2546492,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Manager Validations #236\",\r\n" + 
				"                    \"id\": \"236\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540898489891,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Manager%20Validations/236/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 2,\r\n" + 
				"                            \"totalCount\": 22\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 2533938,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Manager Validations #235\",\r\n" + 
				"                    \"id\": \"235\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540812028213,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Manager%20Validations/235/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 22\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 2526770,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Manager Validations #234\",\r\n" + 
				"                    \"id\": \"234\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540724733879,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Manager%20Validations/234/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 22\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 2535399,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Manager Validations #233\",\r\n" + 
				"                    \"id\": \"233\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540639314796,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Manager%20Validations/233/\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"color\": \"blue\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Regression - Mobile Validations\",\r\n" + 
				"            \"builds\": [\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 7,\r\n" + 
				"                            \"totalCount\": 35\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 1240842,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Mobile Validations #202\",\r\n" + 
				"                    \"id\": \"202\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540906560433,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Mobile%20Validations/202/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 8,\r\n" + 
				"                            \"totalCount\": 35\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 1253268,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Mobile Validations #201\",\r\n" + 
				"                    \"id\": \"201\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540820160233,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Mobile%20Validations/201/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 6,\r\n" + 
				"                            \"totalCount\": 35\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 1244949,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Mobile Validations #200\",\r\n" + 
				"                    \"id\": \"200\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540733949243,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Mobile%20Validations/200/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 7,\r\n" + 
				"                            \"totalCount\": 35\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 1263437,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Mobile Validations #199\",\r\n" + 
				"                    \"id\": \"199\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540647360126,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Mobile%20Validations/199/\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"color\": \"yellow\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Regression - Reporting Validations\",\r\n" + 
				"            \"builds\": [\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 15\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 2260871,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Reporting Validations #208\",\r\n" + 
				"                    \"id\": \"208\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540907809340,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Reporting%20Validations/208/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 15\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 2217830,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Reporting Validations #207\",\r\n" + 
				"                    \"id\": \"207\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540821423616,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Reporting%20Validations/207/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 15\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 2261378,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Reporting Validations #206\",\r\n" + 
				"                    \"id\": \"206\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540735200227,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Reporting%20Validations/206/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 15\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 2236964,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Reporting Validations #205\",\r\n" + 
				"                    \"id\": \"205\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540648630399,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Reporting%20Validations/205/\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"color\": \"blue\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Regression - Rich Media Validations\",\r\n" + 
				"            \"builds\": [\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 3,\r\n" + 
				"                            \"totalCount\": 37\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 6723635,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Rich Media Validations #211\",\r\n" + 
				"                    \"id\": \"211\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540910079460,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Rich%20Media%20Validations/211/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 3,\r\n" + 
				"                            \"totalCount\": 37\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 6580632,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Rich Media Validations #210\",\r\n" + 
				"                    \"id\": \"210\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540823649632,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Rich%20Media%20Validations/210/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 3,\r\n" + 
				"                            \"totalCount\": 37\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 6733737,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Rich Media Validations #209\",\r\n" + 
				"                    \"id\": \"209\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540737469422,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Rich%20Media%20Validations/209/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 3,\r\n" + 
				"                            \"totalCount\": 37\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 6910948,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Rich Media Validations #208\",\r\n" + 
				"                    \"id\": \"208\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540650875615,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Rich%20Media%20Validations/208/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 37\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 7706392,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Rich Media Validations #118\",\r\n" + 
				"                    \"id\": \"118\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1533947135779,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Rich%20Media%20Validations/118/\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"color\": \"yellow\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Regression - Rotations Validations\",\r\n" + 
				"            \"builds\": [\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 1,\r\n" + 
				"                            \"totalCount\": 4\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 1403242,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Rotations Validations #80\",\r\n" + 
				"                    \"id\": \"80\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540916810500,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Rotations%20Validations/80/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 4\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 1447776,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Rotations Validations #79\",\r\n" + 
				"                    \"id\": \"79\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540830235853,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Rotations%20Validations/79/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 4\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 1444962,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Rotations Validations #78\",\r\n" + 
				"                    \"id\": \"78\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540744210115,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Rotations%20Validations/78/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 4\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 1431061,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Rotations Validations #77\",\r\n" + 
				"                    \"id\": \"77\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540657796242,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Rotations%20Validations/77/\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"color\": \"yellow\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Regression - SP Validations\",\r\n" + 
				"            \"builds\": [\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 1,\r\n" + 
				"                            \"totalCount\": 13\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 1746665,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - SP Validations #250\",\r\n" + 
				"                    \"id\": \"250\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540918221928,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20SP%20Validations/250/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 1,\r\n" + 
				"                            \"totalCount\": 13\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 1338409,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - SP Validations #249\",\r\n" + 
				"                    \"id\": \"249\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540831690956,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20SP%20Validations/249/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 13\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 1629728,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - SP Validations #248\",\r\n" + 
				"                    \"id\": \"248\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540745660250,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20SP%20Validations/248/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 1,\r\n" + 
				"                            \"totalCount\": 13\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 1353072,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - SP Validations #247\",\r\n" + 
				"                    \"id\": \"247\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540659236302,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20SP%20Validations/247/\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"color\": \"yellow\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Regression - Studio Elements Validations\",\r\n" + 
				"            \"builds\": [\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {}\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 0,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Studio Elements Validations #98\",\r\n" + 
				"                    \"id\": \"98\",\r\n" + 
				"                    \"result\": null,\r\n" + 
				"                    \"timestamp\": 1540934432595,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Studio%20Elements%20Validations/98/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 14,\r\n" + 
				"                            \"totalCount\": 60\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 10295044,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Studio Elements Validations #97\",\r\n" + 
				"                    \"id\": \"97\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540848064527,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Studio%20Elements%20Validations/97/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 13,\r\n" + 
				"                            \"totalCount\": 60\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 10513736,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Studio Elements Validations #96\",\r\n" + 
				"                    \"id\": \"96\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540761579780,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Studio%20Elements%20Validations/96/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 12,\r\n" + 
				"                            \"totalCount\": 60\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 10429442,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Studio Elements Validations #95\",\r\n" + 
				"                    \"id\": \"95\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540675180767,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Studio%20Elements%20Validations/95/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 8,\r\n" + 
				"                            \"totalCount\": 60\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 11908059,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Studio Elements Validations #94\",\r\n" + 
				"                    \"id\": \"94\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540588780004,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Studio%20Elements%20Validations/94/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 2\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 204651,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Studio Elements Validations #12\",\r\n" + 
				"                    \"id\": \"12\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1533676786847,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Studio%20Elements%20Validations/12/\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"color\": \"yellow_anime\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Regression - Studio Validations\",\r\n" + 
				"            \"builds\": [\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {}\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 0,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Studio Validations #217\",\r\n" + 
				"                    \"id\": \"217\",\r\n" + 
				"                    \"result\": null,\r\n" + 
				"                    \"timestamp\": 1540927745854,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Studio%20Validations/217/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 1,\r\n" + 
				"                            \"totalCount\": 52\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 10570266,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Studio Validations #216\",\r\n" + 
				"                    \"id\": \"216\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540841405407,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Studio%20Validations/216/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 52\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 10530622,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Studio Validations #215\",\r\n" + 
				"                    \"id\": \"215\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540754968134,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Studio%20Validations/215/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 52\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 10501423,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Studio Validations #214\",\r\n" + 
				"                    \"id\": \"214\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540668540271,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Studio%20Validations/214/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 52\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 10542102,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Studio Validations #213\",\r\n" + 
				"                    \"id\": \"213\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540582149751,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Studio%20Validations/213/\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"color\": \"yellow_anime\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Regression - Targeting Group Validations\",\r\n" + 
				"            \"builds\": [\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 22\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 3407335,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Targeting Group Validations #193\",\r\n" + 
				"                    \"id\": \"193\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1540851981784,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Targeting%20Group%20Validations/193/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 1,\r\n" + 
				"                            \"totalCount\": 22\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 3995270,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Targeting Group Validations #192\",\r\n" + 
				"                    \"id\": \"192\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540765506201,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Targeting%20Group%20Validations/192/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 1,\r\n" + 
				"                            \"totalCount\": 22\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 4010002,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Targeting Group Validations #191\",\r\n" + 
				"                    \"id\": \"191\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540679047030,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Targeting%20Group%20Validations/191/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 12,\r\n" + 
				"                            \"totalCount\": 22\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 2226549,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - Targeting Group Validations #190\",\r\n" + 
				"                    \"id\": \"190\",\r\n" + 
				"                    \"result\": \"FAILURE\",\r\n" + 
				"                    \"timestamp\": 1540592697827,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20Targeting%20Group%20Validations/190/\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"color\": \"blue\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Regression - TPT Validations\",\r\n" + 
				"            \"builds\": [\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 1,\r\n" + 
				"                            \"totalCount\": 28\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 3015668,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - TPT Validations #195\",\r\n" + 
				"                    \"id\": \"195\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540855396905,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20TPT%20Validations/195/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 1,\r\n" + 
				"                            \"totalCount\": 28\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 2862971,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - TPT Validations #194\",\r\n" + 
				"                    \"id\": \"194\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540769511375,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20TPT%20Validations/194/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 3,\r\n" + 
				"                            \"totalCount\": 28\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 3197282,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - TPT Validations #193\",\r\n" + 
				"                    \"id\": \"193\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540683067181,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20TPT%20Validations/193/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 1,\r\n" + 
				"                            \"totalCount\": 28\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 2973301,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - TPT Validations #192\",\r\n" + 
				"                    \"id\": \"192\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540594939391,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20TPT%20Validations/192/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 0,\r\n" + 
				"                            \"totalCount\": 28\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 2183515,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - TPT Validations #50\",\r\n" + 
				"                    \"id\": \"50\",\r\n" + 
				"                    \"result\": \"SUCCESS\",\r\n" + 
				"                    \"timestamp\": 1528925956693,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20TPT%20Validations/50/\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"color\": \"yellow\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Regression - UI Validations\",\r\n" + 
				"            \"builds\": [\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 10,\r\n" + 
				"                            \"totalCount\": 56\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 6816432,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - UI Validations #227\",\r\n" + 
				"                    \"id\": \"227\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540858422059,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20UI%20Validations/227/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 10,\r\n" + 
				"                            \"totalCount\": 56\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 6769577,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - UI Validations #226\",\r\n" + 
				"                    \"id\": \"226\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540772381518,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20UI%20Validations/226/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 11,\r\n" + 
				"                            \"totalCount\": 56\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 6776595,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - UI Validations #225\",\r\n" + 
				"                    \"id\": \"225\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540686272318,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20UI%20Validations/225/\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 18,\r\n" + 
				"                            \"totalCount\": 56\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 7038291,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - UI Validations #224\",\r\n" + 
				"                    \"id\": \"224\",\r\n" + 
				"                    \"result\": \"UNSTABLE\",\r\n" + 
				"                    \"timestamp\": 1540598040696,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20UI%20Validations/224/\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"color\": \"yellow\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Regression - VPAID VAST Validations\",\r\n" + 
				"            \"builds\": [\r\n" + 
				"                {\r\n" + 
				"                    \"actions\": [\r\n" + 
				"                        {\r\n" + 
				"                            \"failCount\": 3,\r\n" + 
				"                            \"totalCount\": 3\r\n" + 
				"                        }\r\n" + 
				"                    ],\r\n" + 
				"                    \"duration\": 1292422,\r\n" + 
				"                    \"fullDisplayName\": \"Regression - VPAID VAST Validations #1\",\r\n" + 
				"                    \"id\": \"1\",\r\n" + 
				"                    \"result\": \"FAILURE\",\r\n" + 
				"                    \"timestamp\": 1526258034994,\r\n" + 
				"                    \"url\": \"http://dev-jenkins.spongecell.net/job/Regression%20-%20VPAID%20VAST%20Validations/1/\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"color\": \"disabled\"\r\n" + 
				"        }\r\n" + 
				"    ]\r\n" + 
				"}";
		return new ResponseEntity<String>(json, HttpStatus.OK);		
	}
}
