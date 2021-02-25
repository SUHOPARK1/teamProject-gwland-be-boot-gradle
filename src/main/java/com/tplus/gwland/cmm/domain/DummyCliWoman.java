package com.tplus.gwland.cmm.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class DummyCliWoman {
	String womanName1 = "서연\t1\t35,647\n" + "서윤\t2\t34,342\n" + "지우\t3\t30,009\n" + "서현\t4\t29,070\n"
			+ "민서\t5\t27,935\n" + "하은\t6\t26,936\n" + "하윤\t7\t25,992\n" + "윤서\t8\t23,692\n" + "지유\t9\t22,862\n"
			+ "지민\t10\t22,707\n" + "채원\t11\t22,157\n" + "지윤\t12\t20,891\n" + "은서\t13\t20,830\n" + "수아\t14\t20,778\n"
			+ "다은\t15\t20,302\n" + "예은\t16\t19,516\n" + "지아\t17\t18,613\n" + "수빈\t18\t18,544\n" + "소율\t19\t18,041\n"
			+ "예린\t20\t17,547\n" + "예원\t21\t17,400\n" + "지원\t22\t17,077\n" + "소윤\t23\t16,681\n" + "지안\t24\t16,170\n"
			+ "하린\t25\t15,480\n" + "시은\t26\t15,367\n" + "유진\t27\t15,259\n" + "채은\t28\t14,683\n" + "윤아\t29\t14,365\n"
			+ "유나\t30\t14,284\n" + "가은\t31\t14,238\n" + "서영\t32\t13,902\n" + "민지\t33\t13,686\n" + "예진\t34\t13,514\n"
			+ "서아\t35\t13,465\n" + "수민\t36\t13,176\n" + "수연\t37\t12,900\n" + "연우\t38\t12,813\n" + "예나\t39\t12,697\n"
			+ "예서\t40\t12,387\n" + "주아\t41\t12,293\n" + "시연\t42\t11,820\n" + "연서\t43\t11,598\n" + "하율\t44\t11,456\n"
			+ "다인\t45\t11,309\n" + "다연\t46\t11,038\n" + "시아\t47\t10,976\n" + "아인\t48\t10,924\n" + "현서\t49\t10,856\n"
			+ "서은\t50\t10,731\n" + "유주\t51\t10,674\n" + "아린\t52\t10,578\n" + "서우\t53\t10,475\n" + "하연\t54\t10,287\n"
			+ "서율\t55\t10,268\n" + "서진\t56\t10,247\n" + "채윤\t57\t10,238\n" + "유빈\t58\t10,166\n" + "지율\t59\t10,114\n"
			+ "나윤\t60\t10,015\n" + "수현\t61\t9,988\n" + "예지\t62\t9,809\n" + "다현\t63\t9,722\n" + "소은\t64\t9,056\n"
			+ "나은\t65\t9,027\n" + "나연\t66\t9,024\n" + "지은\t67\t9,003\n" + "민주\t68\t8,936\n" + "아윤\t69\t8,837\n"
			+ "사랑\t70\t8,833\n" + "시현\t71\t8,747\n" + "예빈\t72\t8,714\n" + "윤지\t73\t8,682\n" + "서하\t74\t8,667\n"
			+ "지현\t75\t8,564\n" + "소연\t76\t8,524\n" + "혜원\t77\t8,137\n" + "지수\t78\t8,108\n" + "은채\t79\t8,106\n"
			+ "주하\t80\t8,050\n" + "채아\t81\t7,827\n" + "승아\t82\t7,800\n" + "다윤\t83\t7,554\n" + "소민\t84\t7,502\n"
			+ "서희\t85\t7,402\n" + "나현\t86\t7,365\n" + "민아\t87\t7,355\n" + "채린\t88\t7,332\n" + "하영\t89\t7,288\n"
			+ "세아\t90\t7,238\n" + "세은\t91\t7,214\n" + "도연\t92\t7,112\n" + "규리\t93\t7,091\n" + "아영\t94\t7,075\n"
			+ "다온\t95\t6,778\n" + "가윤\t96\t6,679\n" + "지연\t97\t6,670\n" + "예림\t98\t6,626\n" + "태희\t99\t6,460\n"
			+ "민채\t100\t6,444\n" + "주은\t101\t6,408\n" + "시윤\t102\t6,347\n" + "유정\t103\t6,318\n" + "연아\t104\t6,258\n"
			+ "소현\t105\t6,179\n" + "아현\t106\t6,167\n" + "보민\t107\t6,159\n" + "민정\t108\t6,148\n" + "수진\t109\t6,015\n"
			+ "현지\t110\t6,014\n" + "민경\t111\t5,928\n" + "정원\t112\t5,889\n" + "나경\t113\t5,871\n" + "가현\t114\t5,835\n"
			+ "세연\t115\t5,686\n" + "은지\t116\t5,657\n" + "윤하\t117\t5,649\n" + "가연\t118\t5,648\n" + "지효\t119\t5,624\n"
			+ "가온\t120\t5,482\n" + "라희\t121\t5,377\n" + "예슬\t122\t5,317\n" + "채연\t123\t5,283\n" + "한별\t124\t5,247\n"
			+ "현아\t125\t5,179\n" + "하늘\t126\t5,096\n" + "소희\t127\t5,070\n" + "효주\t128\t4,950\n" + "유림\t129\t4,949\n"
			+ "유하\t130\t4,931\n" + "채민\t131\t4,835\n" + "은솔\t132\t4,832\n" + "봄\t133\t4,779\n" + "주연\t134\t4,724\n"
			+ "가영\t134\t4,724\n" + "예주\t136\t4,714\n" + "소이\t137\t4,703\n" + "유리\t138\t4,624\n" + "혜린\t139\t4,589\n"
			+ "하진\t140\t4,585\n" + "다희\t141\t4,571\n" + "하랑\t142\t4,521\n" + "하나\t143\t4,450\n" + "태연\t144\t4,444\n"
			+ "설아\t145\t4,439\n" + "윤슬\t146\t4,432\n" + "은우\t147\t4,413\n" + "하람\t148\t4,403\n" + "다혜\t149\t4,395\n"
			+ "다솜\t150\t4,370\n" + "혜인\t151\t4,359\n" + "지혜\t152\t4,348\n" + "유민\t153\t4,342\n" + "재인\t154\t4,329\n"
			+ "승연\t155\t4,311\n" + "다빈\t156\t4,282\n" + "수인\t157\t4,265\n" + "재이\t158\t4,239\n" + "지영\t159\t4,229\n"
			+ "수정\t160\t4,188\n" + "리아\t161\t4,184\n" + "시온\t162\t4,138\n" + "은유\t163\t4,127\n" + "채영\t164\t4,116\n"
			+ "주원\t165\t4,086\n" + "고은\t166\t4,038\n" + "태린\t167\t4,034\n" + "태은\t168\t3,992\n" + "지후\t169\t3,972\n"
			+ "아라\t170\t3,912\n" + "민하\t171\t3,846\n" + "나영\t171\t3,846\n" + "수지\t173\t3,844\n" + "소영\t174\t3,830\n"
			+ "단아\t175\t3,730\n" + "은별\t176\t3,727\n" + "서인\t177\t3,702\n" + "보경\t178\t3,664\n" + "다영\t179\t3,651\n"
			+ "주희\t180\t3,615\n" + "가빈\t181\t3,611\n" + "채현\t182\t3,608\n" + "정민\t183\t3,560\n" + "예솔\t184\t3,528\n"
			+ "시우\t185\t3,455\n" + "효린\t186\t3,451\n" + "지온\t187\t3,441\n" + "정윤\t188\t3,397\n" + "소정\t189\t3,384\n"
			+ "라온\t190\t3,381\n" + "은재\t191\t3,376\n" + "세빈\t192\t3,369\n" + "한나\t193\t3,348\n" + "연재\t194\t3,338\n"
			+ "채이\t195\t3,334\n" + "서빈\t196\t3,324\n" + "예담\t197\t3,305\n" + "슬아\t198\t3,277\n" + "아진\t199\t3,267\n"
			+ "해인\t200\t3,261\n" + "아연\t201\t3,254\n" + "연주\t202\t3,225\n" + "도희\t203\t3,223\n" + "보미\t204\t3,222\n"
			+ "예인\t205\t3,197\n" + "지호\t206\t3,189\n" + "나율\t207\t3,188\n" + "서정\t208\t3,178\n" + "다원\t209\t3,172\n"
			+ "하음\t210\t3,143\n" + "정연\t211\t3,135\n" + "별\t212\t3,125\n" + "은빈\t213\t3,121\n" + "다율\t214\t3,114\n"
			+ "서원\t215\t3,070\n" + "율\t216\t3,063\n" + "세인\t217\t3,062\n" + "효은\t218\t3,061\n" + "연지\t219\t3,040\n"
			+ "준희\t220\t3,031\n" + "재희\t221\t3,029\n" + "채희\t222\t3,000\n" + "지인\t222\t3,000\n" + "도은\t224\t2,998\n"
			+ "은비\t225\t2,953\n" + "다경\t226\t2,951\n" + "리원\t227\t2,926\n" + "채빈\t228\t2,913\n" + "소미\t229\t2,905\n"
			+ "희원\t230\t2,900\n" + "가인\t231\t2,880\n" + "윤주\t232\t2,851\n" + "유은\t233\t2,832\n" + "혜민\t234\t2,812\n"
			+ "미소\t235\t2,808\n" + "루아\t236\t2,783\n" + "솔\t237\t2,775\n" + "은수\t238\t2,717\n" + "혜진\t239\t2,712\n"
			+ "은율\t240\t2,701\n" + "세린\t241\t2,697\n" + "이안\t242\t2,666\n" + "리안\t243\t2,662\n" + "은혜\t244\t2,644\n"
			+ "연수\t245\t2,636\n" + "재은\t246\t2,615\n" + "설\t247\t2,610\n" + "하민\t247\t2,610\n" + "아름\t249\t2,607\n"
			+ "로아\t250\t2,605\n" + "유라\t251\t2,604\n" + "효원\t252\t2,600\n" + "라윤\t253\t2,587\n" + "현진\t254\t2,573\n"
			+ "유이\t255\t2,554\n" + "민영\t256\t2,545\n" + "이현\t257\t2,529\n" + "선우\t258\t2,527\n" + "혜빈\t259\t2,515\n"
			+ "단비\t259\t2,515\n" + "하온\t261\t2,489\n" + "정현\t262\t2,482\n" + "혜윤\t263\t2,475\n" + "온유\t264\t2,466\n"
			+ "윤\t265\t2,444\n" + "세영\t266\t2,426\n" + "정은\t267\t2,420\n" + "제인\t268\t2,400\n" + "여진\t269\t2,387\n"
			+ "채율\t270\t2,386\n" + "가을\t271\t2,361\n" + "민솔\t272\t2,359\n" + "윤진\t273\t2,341\n" + "라엘\t274\t2,333\n"
			+ "은성\t275\t2,329\n" + "세희\t276\t2,318\n" + "유경\t277\t2,298\n" + "여원\t278\t2,297\n" + "현정\t279\t2,296\n"
			+ "서린\t280\t2,289\n" + "가람\t281\t2,285\n" + "주현\t282\t2,279\n" + "윤채\t283\t2,257\n" + "소원\t284\t2,244\n"
			+ "진서\t285\t2,239\n" + "나린\t285\t2,239\n" + "은설\t287\t2,235\n" + "현주\t288\t2,231\n" + "도경\t289\t2,215\n"
			+ "하엘\t290\t2,207\n" + "연희\t291\t2,205\n" + "해나\t292\t2,200\n" + "혜림\t293\t2,187\n" + "효민\t294\t2,186\n"
			+ "진아\t295\t2,110\n" + "다정\t296\t2,099\n" + "주영\t297\t2,065\n" + "가희\t297\t2,065\n" + "제이\t299\t2,063\n"
			+ "혜리\t300\t2,048\n" + "라임\t301\t2,047\n" + "소담\t302\t2,044\n" + "하빈\t303\t2,041\n" + "규빈\t304\t2,000\n"
			+ "지예\t305\t1,994\n" + "지희\t306\t1,983\n" + "태리\t307\t1,979\n" + "수영\t308\t1,978\n" + "효빈\t309\t1,971\n"
			+ "희주\t310\t1,969\n" + "다예\t311\t1,946\n" + "시원\t312\t1,944\n" + "아림\t313\t1,940\n" + "리나\t314\t1,935\n"
			+ "려원\t315\t1,892\n" + "승희\t316\t1,866\n" + "은진\t317\t1,858\n" + "가율\t318\t1,830\n" + "시율\t319\t1,823\n"
			+ "하정\t320\t1,807\n" + "혜주\t321\t1,800\n" + "시영\t322\t1,794\n" + "윤희\t323\t1,789\n" + "효정\t324\t1,785\n"
			+ "다민\t324\t1,785\n" + "하리\t326\t1,781\n" + "이나\t327\t1,754\n" + "이솔\t328\t1,753\n" + "선아\t329\t1,746\n"
			+ "나희\t330\t1,741\n" + "해솔\t331\t1,737\n" + "은아\t332\t1,731\n" + "희진\t333\t1,730\n" + "효진\t334\t1,726\n"
			+ "정인\t335\t1,718\n" + "하경\t336\t1,712\n" + "윤정\t337\t1,711\n" + "성은\t337\t1,711\n" + "승현\t339\t1,708\n"
			+ "규린\t340\t1,701\n" + "윤솔\t341\t1,665\n" + "영은\t342\t1,661\n" + "새봄\t342\t1,661\n" + "유안\t344\t1,629\n"
			+ "지오\t345\t1,625\n" + "송현\t346\t1,621\n" + "해린\t347\t1,618\n" + "재아\t348\t1,617\n" + "소유\t349\t1,605\n"
			+ "은영\t350\t1,603\n" + "선유\t351\t1,600\n" + "영서\t352\t1,593\n" + "인서\t353\t1,586\n" + "보영\t354\t1,579\n"
			+ "아율\t355\t1,558\n" + "서이\t356\t1,553\n" + "규림\t357\t1,548\n" + "태이\t358\t1,535\n" + "민선\t359\t1,530\n"
			+ "은하\t360\t1,524\n" + "민희\t361\t1,519\n" + "아정\t362\t1,514\n" + "하임\t363\t1,510\n" + "이서\t364\t1,509\n"
			+ "세현\t365\t1,506\n" + "우리\t366\t1,503\n" + "도윤\t367\t1,490\n" + "도아\t368\t1,485\n" + "아란\t369\t1,480\n"
			+ "승주\t370\t1,477\n" + "혜나\t371\t1,476\n" + "효림\t372\t1,446\n" + "별하\t373\t1,441\n" + "가원\t374\t1,416\n"
			+ "선영\t375\t1,415\n" + "하늬\t376\t1,404\n" + "수린\t377\t1,403\n" + "예온\t378\t1,389\n" + "예리\t379\t1,386\n"
			+ "시하\t380\t1,384\n" + "담희\t381\t1,369\n" + "도영\t382\t1,342\n" + "희수\t383\t1,327\n" + "정아\t384\t1,325\n"
			+ "다솔\t384\t1,325\n" + "루리\t386\t1,315\n" + "선율\t387\t1,312\n" + "희연\t388\t1,310\n" + "라은\t389\t1,301\n"
			+ "한비\t390\t1,289\n" + "은정\t391\t1,278\n" + "희서\t392\t1,276\n" + "송연\t393\t1,274\n" + "해원\t394\t1,269\n"
			+ "예람\t395\t1,267\n" + "이수\t396\t1,265\n" + "시안\t396\t1,265\n" + "서경\t398\t1,256\n" + "혜연\t399\t1,247\n"
			+ "라율\t400\t1,240\n" + "리하\t401\t1,228\n" + "은\t401\t1,228\n" + "하원\t401\t1,228\n" + "지나\t404\t1,221\n"
			+ "다해\t405\t1,220\n" + "유미\t406\t1,219\n" + "린\t407\t1,214\n" + "유현\t408\t1,213\n" + "예랑\t409\t1,212\n"
			+ "아람\t409\t1,212\n" + "은주\t411\t1,206\n" + "윤영\t412\t1,198\n" + "하루\t412\t1,198\n" + "빛나\t414\t1,195\n"
			+ "여은\t415\t1,192\n" + "우주\t416\t1,184\n" + "세령\t417\t1,166\n" + "경민\t418\t1,147\n" + "하라\t419\t1,146\n"
			+ "세진\t420\t1,140\n" + "예령\t421\t1,138\n" + "예영\t422\t1,121\n" + "혜정\t423\t1,119\n" + "예윤\t423\t1,119\n"
			+ "진\t425\t1,110\n" + "수안\t426\t1,102\n" + "로하\t427\t1,098\n" + "진희\t428\t1,084\n" + "초아\t429\t1,077\n"
			+ "나예\t430\t1,076\n" + "수하\t431\t1,072\n" + "수경\t432\t1,065\n" + "누리\t433\t1,061\n" + "아리\t434\t1,058\n"
			+ "진주\t435\t1,055\n" + "인아\t436\t1,054\n" + "태경\t437\t1,051\n" + "민진\t438\t1,049\n" + "나원\t439\t1,033\n"
			+ "윤설\t440\t1,030\n" + "민\t441\t1,023\n" + "보현\t442\t1,019\n" + "인영\t443\t1,017\n" + "이레\t444\t1,016\n"
			+ "하선\t445\t1,013\n" + "성연\t446\t1,010\n" + "승은\t447\t1,003\n" + "태인\t448\t995\n";

	String womanName2 = "정빈\t449\t994\n" + "예현\t450\t990\n" + "다미\t451\t988\n" + "경은\t452\t980\n" + "연진\t453\t966\n"
			+ "유담\t454\t962\n" + "해윤\t455\t959\n" + "나래\t456\t958\n" + "희정\t457\t953\n" + "소예\t458\t950\n"
			+ "규원\t459\t946\n" + "가민\t460\t932\n" + "한솔\t461\t931\n" + "서안\t462\t919\n" + "여울\t463\t907\n"
			+ "세하\t464\t898\n" + "희윤\t465\t894\n" + "여름\t465\t894\n" + "도이\t467\t892\n" + "다겸\t467\t892\n"
			+ "율아\t469\t891\n" + "채하\t470\t889\n" + "규민\t471\t888\n" + "로희\t472\t886\n" + "이진\t473\t880\n"
			+ "세나\t474\t879\n" + "아민\t475\t878\n" + "서유\t476\t871\n" + "나라\t477\t865\n" + "혜은\t478\t863\n"
			+ "시유\t479\t860\n" + "재연\t480\t856\n" + "세윤\t481\t855\n" + "지선\t482\t853\n" + "세라\t483\t852\n"
			+ "하이\t484\t849\n" + "해리\t485\t843\n" + "슬\t486\t838\n" + "안나\t487\t834\n" + "채령\t488\t832\n"
			+ "혜영\t489\t828\n" + "재윤\t490\t824\n" + "미나\t491\t823\n" + "루다\t492\t822\n" + "현\t493\t807\n"
			+ "주혜\t494\t801\n" + "태림\t494\t801\n" + "루나\t496\t798\n" + "연후\t497\t796\n" + "민설\t497\t796\n"
			+ "린아\t499\t793\n" + "혜령\t500\t785\n" + "보윤\t501\t783\n" + "진영\t502\t774\n" + "에스더\t503\t773\n"
			+ "초은\t504\t762\n" + "슬기\t505\t758\n" + "세림\t506\t757\n" + "보람\t507\t756\n" + "유희\t507\t756\n"
			+ "예봄\t509\t753\n" + "성아\t510\t750\n" + "기쁨\t511\t747\n" + "채림\t512\t743\n" + "시언\t513\t742\n"
			+ "송이\t514\t740\n" + "다나\t514\t740\n" + "미주\t516\t739\n" + "윤경\t516\t739\n" + "로운\t518\t734\n"
			+ "은송\t519\t733\n" + "보라\t520\t730\n" + "지애\t521\t727\n" + "설하\t522\t720\n" + "승하\t523\t719\n"
			+ "리우\t524\t715\n" + "사라\t524\t715\n" + "도현\t526\t714\n" + "현경\t527\t704\n" + "설희\t528\t701\n"
			+ "영주\t529\t699\n" + "민재\t530\t696\n" + "로은\t531\t692\n" + "효인\t532\t688\n" + "주빈\t533\t687\n"
			+ "보빈\t534\t685\n" + "소망\t535\t676\n" + "예승\t535\t676\n" + "주이\t537\t670\n" + "세민\t538\t667\n"
			+ "예음\t539\t662\n" + "아랑\t540\t660\n" + "나혜\t541\t659\n" + "라원\t542\t658\n" + "은결\t542\t658\n"
			+ "이은\t544\t657\n" + "샛별\t545\t653\n" + "혜지\t546\t652\n" + "소진\t547\t651\n" + "예하\t547\t651\n"
			+ "민유\t549\t648\n" + "한결\t550\t644\n" + "태영\t551\t642\n" + "서후\t552\t639\n" + "하림\t553\t637\n"
			+ "은경\t553\t637\n" + "연두\t555\t636\n" + "선민\t556\t630\n" + "보연\t557\t625\n" + "율희\t558\t622\n"
			+ "유솔\t559\t621\n" + "은희\t560\t619\n" + "연정\t561\t618\n" + "제니\t562\t615\n" + "규연\t563\t613\n"
			+ "율하\t564\t610\n" + "세이\t564\t610\n" + "라현\t566\t609\n" + "은호\t567\t607\n" + "고운\t568\t606\n"
			+ "예안\t568\t606\n" + "희선\t570\t598\n" + "은교\t571\t595\n" + "보은\t571\t595\n" + "율리\t573\t593\n"
			+ "세정\t574\t592\n" + "가령\t575\t591\n" + "재원\t576\t589\n" + "호연\t577\t587\n" + "송희\t578\t586\n"
			+ "나림\t579\t584\n" + "영채\t580\t580\n" + "제나\t581\t578\n" + "지언\t581\t578\n" + "희은\t583\t570\n"
			+ "시호\t584\t569\n" + "승민\t584\t569\n" + "예율\t586\t564\n" + "채안\t586\t564\n" + "서온\t588\t563\n"
			+ "현희\t589\t562\n" + "민교\t590\t558\n" + "지빈\t591\t557\n" + "재영\t592\t555\n" + "하현\t593\t554\n"
			+ "선하\t593\t554\n" + "효리\t595\t552\n" + "주윤\t595\t552\n" + "도담\t597\t547\n" + "재경\t597\t547\n"
			+ "강희\t599\t540\n" + "세경\t600\t539\n" + "세경\t600\t539\n" + "수희\t602\t537\n" + "선주\t603\t533\n"
			+ "소빈\t603\t533\n" + "우림\t605\t530\n" + "해온\t606\t529\n" + "이엘\t606\t529\n" + "루하\t608\t528\n"
			+ "세원\t608\t528\n" + "조이\t610\t526\n" + "주미\t611\t523\n" + "희영\t612\t522\n" + "연경\t613\t519\n"
			+ "민혜\t613\t519\n" + "미래\t613\t519\n" + "승혜\t616\t516\n" + "은선\t617\t515\n" + "희재\t617\t515\n"
			+ "제아\t619\t513\n" + "경빈\t619\t513\n" + "혜선\t619\t513\n" + "미진\t622\t512\n" + "윤선\t622\t512\n"
			+ "민송\t624\t510\n" + "유선\t624\t510\n" + "채경\t624\t510\n" + "성현\t624\t510\n" + "주안\t628\t508\n"
			+ "나엘\t629\t507\n" + "근영\t629\t507\n" + "인혜\t629\t507\n" + "보아\t632\t505\n" + "예성\t633\t504\n"
			+ "수미\t634\t500\n" + "로이\t635\t499\n" + "하령\t636\t498\n" + "현영\t637\t497\n" + "세미\t638\t495\n"
			+ "이랑\t639\t494\n" + "희\t640\t493\n" + "혜율\t640\t493\n" + "다엘\t642\t492\n" + "도원\t643\t490\n"
			+ "이담\t644\t489\n" + "호정\t645\t486\n" + "한서\t645\t486\n" + "태윤\t647\t485\n" + "경원\t647\t485\n"
			+ "새론\t649\t482\n" + "려은\t650\t479\n" + "성희\t651\t477\n" + "아은\t652\t476\n" + "도하\t653\t475\n"
			+ "윤빈\t654\t472\n" + "해민\t654\t472\n" + "다애\t656\t471\n" + "서주\t657\t470\n" + "보배\t658\t467\n"
			+ "윤우\t658\t467\n" + "소을\t658\t467\n" + "선미\t661\t466\n" + "미정\t662\t464\n" + "혜수\t663\t463\n"
			+ "준서\t664\t462\n" + "애린\t665\t461\n" + "선혜\t665\t461\n" + "소울\t665\t461\n" + "나리\t665\t461\n"
			+ "유아\t669\t456\n" + "혜미\t670\t453\n" + "지이\t671\t451\n" + "선\t672\t450\n" + "윤이\t673\t449\n"
			+ "레아\t674\t447\n" + "예희\t675\t446\n" + "민소\t675\t446\n" + "연\t677\t444\n" + "선희\t677\t444\n"
			+ "정희\t679\t440\n" + "샤론\t679\t440\n" + "이정\t679\t440\n" + "세온\t682\t438\n" + "리온\t683\t437\n"
			+ "연화\t684\t436\n" + "슬비\t684\t436\n" + "정음\t684\t436\n" + "초원\t687\t433\n" + "가림\t688\t431\n"
			+ "예소\t689\t430\n" + "새별\t689\t430\n" + "수윤\t691\t429\n" + "루비\t691\t429\n" + "담이\t693\t428\n"
			+ "솔희\t694\t423\n" + "유연\t695\t422\n" + "채리\t695\t422\n" + "진솔\t697\t420\n" + "나겸\t698\t419\n"
			+ "시후\t699\t418\n" + "나온\t699\t418\n" + "솔비\t701\t417\n" + "혜성\t701\t417\n" + "서령\t703\t416\n"
			+ "규나\t703\t416\n" + "정하\t705\t415\n" + "효연\t706\t414\n" + "유린\t707\t413\n" + "어진\t708\t411\n"
			+ "루미\t709\t410\n" + "리윤\t710\t409\n" + "유지\t711\t406\n" + "혜승\t712\t405\n" + "건희\t713\t404\n"
			+ "단희\t713\t404\n" + "금비\t715\t403\n" + "이슬\t715\t403\n" + "보나\t717\t402\n" + "이든\t717\t402\n"
			+ "선빈\t717\t402\n" + "연하\t720\t401\n" + "윤비\t720\t401\n" + "신비\t720\t401\n" + "영인\t723\t400\n"
			+ "루희\t724\t399\n" + "효경\t724\t399\n" + "규은\t726\t397\n" + "이설\t727\t395\n" + "정안\t728\t394\n"
			+ "정서\t729\t393\n" + "지음\t729\t393\n" + "한슬\t731\t392\n" + "리예\t732\t391\n" + "설현\t733\t389\n"
			+ "은후\t733\t389\n" + "초희\t733\t389\n" + "서형\t736\t388\n" + "소리\t737\t387\n" + "은세\t737\t387\n"
			+ "예솜\t739\t386\n" + "신영\t739\t386\n" + "진하\t741\t385\n" + "혜서\t741\t385\n" + "효서\t743\t384\n"
			+ "지서\t744\t382\n" + "찬희\t745\t381\n" + "채유\t746\t380\n" + "조은\t747\t378\n" + "미경\t748\t377\n"
			+ "원희\t749\t376\n" + "리현\t750\t375\n" + "단\t750\t375\n" + "솔빈\t750\t375\n" + "다운\t753\t372\n"
			+ "수림\t753\t372\n" + "솔민\t755\t370\n" + "유영\t756\t369\n" + "해빈\t757\t368\n" + "우정\t758\t367\n"
			+ "해진\t758\t367\n" + "이지\t760\t366\n" + "승미\t761\t365\n" + "아빈\t761\t365\n" + "선경\t763\t364\n"
			+ "하솜\t764\t362\n" + "의진\t764\t362\n" + "현채\t764\t362\n" + "환희\t764\t362\n" + "주리\t768\t361\n"
			+ "경서\t768\t361\n" + "원\t768\t361\n" + "혜경\t768\t361\n" + "효재\t772\t360\n" + "빈\t772\t360\n"
			+ "해림\t774\t359\n" + "솜\t775\t358\n" + "은효\t776\t356\n" + "예준\t777\t355\n" + "가경\t778\t354\n"
			+ "우진\t778\t354\n" + "소라\t780\t352\n" + "봄이\t781\t351\n" + "선화\t782\t350\n" + "은미\t783\t349\n"
			+ "윤성\t784\t348\n" + "채인\t784\t348\n" + "세리\t786\t346\n" + "진경\t787\t345\n" + "신혜\t787\t345\n"
			+ "채언\t789\t344\n" + "여정\t790\t343\n" + "한빛\t790\t343\n" + "라연\t792\t342\n" + "다흰\t792\t342\n"
			+ "푸름\t794\t340\n" + "승유\t794\t340\n" + "희경\t794\t340\n" + "화영\t794\t340\n" + "서림\t798\t339\n"
			+ "상은\t799\t337\n" + "해주\t799\t337\n" + "해주\t799\t337\n" + "상아\t802\t336\n" + "연제\t803\t333\n"
			+ "예선\t803\t333\n" + "은민\t805\t332\n" + "수예\t806\t331\n" + "소혜\t807\t329\n" + "지운\t807\t329\n"
			+ "희우\t809\t328\n" + "승빈\t810\t327\n" + "민성\t811\t325\n" + "나나\t811\t325\n" + "은총\t811\t325\n"
			+ "성주\t814\t323\n" + "담\t814\t323\n" + "리사\t816\t321\n" + "태현\t817\t319\n" + "승원\t817\t319\n"
			+ "하담\t817\t319\n" + "결\t817\t319\n" + "주예\t821\t318\n" + "다슬\t822\t317\n" + "주언\t823\t316\n"
			+ "예송\t823\t316\n" + "그린\t823\t316\n" + "솔지\t826\t315\n" + "윤재\t827\t314\n" + "규희\t827\t314\n"
			+ "현수\t829\t313\n" + "경아\t829\t313\n" + "소린\t831\t312\n" + "찬미\t832\t311\n" + "하니\t832\t311\n"
			+ "유원\t834\t309\n" + "단하\t834\t309\n" + "미연\t836\t308\n" + "송하\t837\t307\n" + "초연\t838\t306\n"
			+ "엘리\t838\t306\n" + "현선\t840\t305\n" + "단우\t840\t305\n" + "지솔\t842\t304\n" + "아원\t842\t304\n"
			+ "유비\t842\t304\n" + "래아\t845\t301\n" + "솔아\t845\t301\n" + "채우\t847\t300\n" + "혜준\t848\t299\n"
			+ "은조\t849\t298\n" + "애리\t850\t297\n" + "한울\t851\t296\n" + "규아\t852\t295\n" + "규비\t852\t295\n"
			+ "승리\t854\t293\n" + "현민\t855\t292\n" + "성윤\t856\t291\n" + "하얀\t856\t291\n" + "미영\t856\t291\n"
			+ "연호\t856\t291\n" + "제희\t860\t290\n" + "현이\t861\t289\n" + "동희\t862\t287\n" + "승윤\t862\t287\n"
			+ "미서\t862\t287\n" + "민슬\t862\t287\n" + "수은\t862\t287\n" + "진이\t867\t286\n" + "영지\t867\t286\n"
			+ "수애\t867\t286\n" + "현비\t867\t286\n" + "진유\t871\t285\n" + "윤혜\t871\t285\n" + "영아\t873\t283\n"
			+ "하솔\t873\t283\n" + "인하\t875\t281\n" + "유화\t876\t280\n" + "미현\t877\t279\n" + "경희\t877\t279\n"
			+ "예경\t879\t278\n" + "수\t880\t277\n" + "한율\t881\t276\n" + "해연\t881\t276\n" + "조안\t881\t276\n"
			+ "새롬\t881\t276\n" + "미선\t885\t275\n" + "이린\t885\t275\n" + "해율\t885\t275\n" + "규미\t888\t274\n"
			+ "비\t888\t274\n" + "마리\t890\t273\n" + "자윤\t890\t273\n" + "혜온\t890\t273\n" + "율이\t890\t273\n"
			+ "초이\t890\t273\n" + "은제\t895\t272\n" + "우빈\t895\t272\n" + "다올\t895\t272\n" + "성경\t895\t272\n"
			+ "바다\t895\t272\n" + "승지\t900\t271\n" + "세율\t901\t270\n" + "이주\t901\t270\n" + "준영\t901\t270\n"
			+ "미우\t904\t269\n" + "해슬\t905\t268\n" + "해담\t906\t267\n" + "가린\t907\t266\n" + "인경\t907\t266\n"
			+ "레나\t909\t265\n" + "하유\t909\t265\n" + "원영\t911\t264\n" + "벼리\t911\t264\n" + "정화\t913\t263\n"
			+ "소명\t913\t263\n" + "래은\t915\t262\n" + "솔이\t915\t262\n" + "인애\t915\t262\n" + "명주\t918\t261\n"
			+ "유니\t919\t258\n" + "유\t919\t258\n" + "비주\t919\t258\n" + "루빈\t922\t257\n" + "설리\t922\t257\n"
			+ "희나\t924\t254\n" + "자은\t925\t253\n" + "담비\t926\t252\n" + "명지\t926\t252\n" + "해은\t928\t251\n"
			+ "소운\t929\t250\n" + "희지\t929\t250\n" + "다유\t931\t249\n" + "리유\t931\t249\n" + "은찬\t933\t247\n"
			+ "경진\t933\t247\n" + "보겸\t935\t246\n" + "경미\t935\t246\n" + "이룸\t935\t246\n" + "혜담\t938\t245\n"
			+ "예닮\t939\t244\n" + "아이린\t940\t243\n" + "서혜\t940\t243\n" + "여경\t940\t243\n" + "준이\t943\t240\n"
			+ "효선\t944\t239\n" + "솔미\t944\t239\n" + "미지\t944\t239\n" + "예정\t947\t237\n" + "새나\t948\t236\n"
			+ "지향\t949\t235\n" + "보리\t949\t235\n" + "서휘\t949\t235\n" + "명진\t949\t235\n" + "도혜\t953\t234\n"
			+ "준아\t953\t234\n" + "린하\t953\t234\n" + "이음\t956\t233\n" + "이솜\t956\t233\n" + "상희\t956\t233\n"
			+ "자인\t959\t232\n" + "소하\t960\t230\n" + "명서\t960\t230\n" + "여빈\t962\t228\n" + "지해\t962\t228\n"
			+ "해랑\t962\t228\n" + "송아\t965\t227\n" + "윤미\t966\t226\n" + "한희\t967\t225\n" + "유란\t967\t225\n"
			+ "혜솔\t969\t224\n" + "노을\t970\t223\n" + "도예\t970\t223\n" + "한아\t970\t223\n" + "자영\t973\t221\n"
			+ "우영\t973\t221\n" + "우경\t973\t221\n" + "재나\t976\t220\n" + "송은\t977\t219\n" + "재린\t977\t219\n"
			+ "영선\t979\t218\n" + "채정\t979\t218\n" + "설화\t979\t218\n" + "이재\t982\t217\n" + "아미\t983\t216\n"
			+ "다진\t983\t216\n" + "성민\t985\t215\n" + "은빛\t986\t214\n" + "나빈\t987\t213\n" + "설린\t987\t213\n"
			+ "자연\t987\t213\n" + "나령\t987\t213\n" + "미유\t991\t212\n" + "수련\t991\t212\n" + "효담\t991\t212\n"
			+ "예본\t994\t211\n" + "효영\t995\t209\n" + "세화\t995\t209\n" + "승효\t995\t209\n" + "수화\t998\t207\n"
			+ "우희\t998\t207\n" + "리엘\t1000\t206";

	public static void main(String[] args) {
		DummyCliWoman name = new DummyCliWoman();
        // 1~500
        String wname1 = name.womanName1.replaceAll("[\\w\\s]", "");
        String[] aa = wname1.split("[,]");
        List<String> finalResult = new ArrayList<>();
        for (int i = 0; i < aa.length; i++) {
            String result = '"' + aa[i] + '"' + ",";
            finalResult.add(result);
        }
        for (int i = 0; i < finalResult.size(); i++) {
            System.out.println(finalResult.get(i));
        }

        // 500~1000
        String wname500 = name.womanName2.replaceAll("[\\w^\\t]", "");
        String[] aa2 = wname500.split("[\\n]");
        List<String> result2 = new ArrayList<>();
        for (int i = 0; i < aa2.length; i++) {
            String result = '"' + aa2[i] + '"' + ",";
            result2.add(result);
        }
        result2.stream().forEach(System.out::println);

    }
}

class DummyWomanFinal {
	List<String> womanNameList = Arrays.asList(

			"서연", "서윤", "지우", "서현", "민서", "하은", "하윤", "윤서", "지유", "지민", "채원", "지윤", "은서", "수아", "다은", "예은", "지아", "수빈",
			"소율", "예린", "예원", "지원", "소윤", "지안", "하린", "시은", "유진", "채은", "윤아", "유나", "가은", "서영", "민지", "예진", "서아", "수민",
			"수연", "연우", "예나", "예서", "주아", "시연", "연서", "하율", "다인", "다연", "시아", "아인", "현서", "서은", "유주", "아린", "서우", "하연",
			"서율", "서진", "채윤", "유빈", "지율", "나윤", "수현", "예지", "다현", "소은", "나은", "나연", "지은", "민주", "아윤", "사랑", "시현", "예빈",
			"윤지", "서하", "지현", "소연", "혜원", "지수", "은채", "주하", "채아", "승아", "다윤", "소민", "서희", "나현", "민아", "채린", "하영", "세아",
			"세은", "도연", "규리", "아영", "다온", "가윤", "지연", "예림", "태희", "민채", "주은", "시윤", "유정", "연아", "소현", "아현", "보민", "민정",
			"수진", "현지", "민경", "정원", "나경", "가현", "세연", "은지", "윤하", "가연", "지효", "가온", "라희", "예슬", "채연", "한별", "현아", "하늘",
			"소희", "효주", "유림", "유하", "채민", "은솔", "봄", "주연", "가영", "예주", "소이", "유리", "혜린", "하진", "다희", "하랑", "하나", "태연",
			"설아", "윤슬", "은우", "하람", "다혜", "다솜", "혜인", "지혜", "유민", "재인", "승연", "다빈", "수인", "재이", "지영", "수정", "리아", "시온",
			"은유", "채영", "주원", "고은", "태린", "태은", "지후", "아라", "민하", "나영", "수지", "소영", "단아", "은별", "서인", "보경", "다영", "주희",
			"가빈", "채현", "정민", "예솔", "시우", "효린", "지온", "정윤", "소정", "라온", "은재", "세빈", "한나", "연재", "채이", "서빈", "예담", "슬아",
			"아진", "해인", "아연", "연주", "도희", "보미", "예인", "지호", "나율", "서정", "다원", "하음", "정연", "별", "은빈", "다율", "서원", "율",
			"세인", "효은", "연지", "준희", "재희", "채희", "지인", "도은", "은비", "다경", "리원", "채빈", "소미", "희원", "가인", "윤주", "유은", "혜민",
			"미소", "루아", "솔", "은수", "혜진", "은율", "세린", "이안", "리안", "은혜", "연수", "재은", "설", "하민", "아름", "로아", "유라", "효원",
			"라윤", "현진", "유이", "민영", "이현", "선우", "혜빈", "단비", "하온", "정현", "혜윤", "온유", "윤", "세영", "정은", "제인", "여진", "채율",
			"가을", "민솔", "윤진", "라엘", "은성", "세희", "유경", "여원", "현정", "서린", "가람", "주현", "윤채", "소원", "진서", "나린", "은설", "현주",
			"도경", "하엘", "연희", "해나", "혜림", "효민", "진아", "다정", "주영", "가희", "제이", "혜리", "라임", "소담", "하빈", "규빈", "지예", "지희",
			"태리", "수영", "효빈", "희주", "다예", "시원", "아림", "리나", "려원", "승희", "은진", "가율", "시율", "하정", "혜주", "시영", "윤희", "효정",
			"다민", "하리", "이나", "이솔", "선아", "나희", "해솔", "은아", "희진", "효진", "정인", "하경", "윤정", "성은", "승현", "규린", "윤솔", "영은",
			"새봄", "유안", "지오", "송현", "해린", "재아", "소유", "은영", "선유", "영서", "인서", "보영", "아율", "서이", "규림", "태이", "민선", "은하",
			"민희", "아정", "하임", "이서", "세현", "우리", "도윤", "도아", "아란", "승주", "혜나", "효림", "별하", "가원", "선영", "하늬", "수린", "예온",
			"예리", "시하", "담희", "도영", "희수", "정아", "다솔", "루리", "선율", "희연", "라은", "한비", "은정", "희서", "송연", "해원", "예람", "이수",
			"시안", "서경", "혜연", "라율", "리하", "은", "하원", "지나", "다해", "유미", "린", "유현", "예랑", "아람", "은주", "윤영", "하루", "빛나",
			"여은", "우주", "세령", "경민", "하라", "세진", "예령", "예영", "혜정", "예윤", "진", "수안", "로하", "진희", "초아", "나예", "수하", "수경",
			"누리", "아리", "진주", "인아", "태경", "민진", "나원", "윤설", "민", "보현", "인영", "이레", "하선", "성연", "승은", "태인", "정빈", "예현",
			"다미", "경은", "연진", "유담", "해윤", "나래", "희정", "소예", "규원", "가민", "한솔", "서안", "여울", "세하", "희윤", "여름", "도이", "다겸",
			"율아", "채하", "규민", "로희", "이진", "세나", "아민", "서유", "나라", "혜은", "시유", "재연", "세윤", "지선", "세라", "하이", "해리", "슬",
			"안나", "채령", "혜영", "재윤", "미나", "루다", "현", "주혜", "태림", "루나", "연후", "민설", "린아", "혜령", "보윤", "진영", "에스더", "초은",
			"슬기", "세림", "보람", "유희", "예봄", "성아", "기쁨", "채림", "시언", "송이", "다나", "미주", "윤경", "로운", "은송", "보라", "지애", "설하",
			"승하", "리우", "사라", "도현", "현경", "설희", "영주", "민재", "로은", "효인", "주빈", "보빈", "소망", "예승", "주이", "세민", "예음", "아랑",
			"나혜", "라원", "은결", "이은", "샛별", "혜지", "소진", "예하", "민유", "한결", "태영", "서후", "하림", "은경", "연두", "선민", "보연", "율희",
			"유솔", "은희", "연정", "제니", "규연", "율하", "세이", "라현", "은호", "고운", "예안", "희선", "은교", "보은", "율리", "세정", "가령", "재원",
			"호연", "송희", "나림", "영채", "제나", "지언", "희은", "시호", "승민", "예율", "채안", "서온", "현희", "민교", "지빈", "재영", "하현", "선하",
			"효리", "주윤", "도담", "재경", "강희", "세경", "세경", "수희", "선주", "소빈", "우림", "해온", "이엘", "루하", "세원", "조이", "주미", "희영",
			"연경", "민혜", "미래", "승혜", "은선", "희재", "제아", "경빈", "혜선", "미진", "윤선", "민송", "유선", "채경", "성현", "주안", "나엘", "근영",
			"인혜", "보아", "예성", "수미", "로이", "하령", "현영", "세미", "이랑", "희", "혜율", "다엘", "도원", "이담", "호정", "한서", "태윤", "경원",
			"새론", "려은", "성희", "아은", "도하", "윤빈", "해민", "다애", "서주", "보배", "윤우", "소을", "선미", "미정", "혜수", "준서", "애린", "선혜",
			"소울", "나리", "유아", "혜미", "지이", "선", "윤이", "레아", "예희", "민소", "연", "선희", "정희", "샤론", "이정", "세온", "리온", "연화",
			"슬비", "정음", "초원", "가림", "예소", "새별", "수윤", "루비", "담이", "솔희", "유연", "채리", "진솔", "나겸", "시후", "나온", "솔비", "혜성",
			"서령", "규나", "정하", "효연", "유린", "어진", "루미", "리윤", "유지", "혜승", "건희", "단희", "금비", "이슬", "보나", "이든", "선빈", "연하",
			"윤비", "신비", "영인", "루희", "효경", "규은", "이설", "정안", "정서", "지음", "한슬", "리예", "설현", "은후", "초희", "서형", "소리", "은세",
			"예솜", "신영", "진하", "혜서", "효서", "지서", "찬희", "채유", "조은", "미경", "원희", "리현", "단", "솔빈", "다운", "수림", "솔민", "유영",
			"해빈", "우정", "해진", "이지", "승미", "아빈", "선경", "하솜", "의진", "현채", "환희", "주리", "경서", "원", "혜경", "효재", "빈", "해림",
			"솜", "은효", "예준", "가경", "우진", "소라", "봄이", "선화", "은미", "윤성", "채인", "세리", "진경", "신혜", "채언", "여정", "한빛", "라연",
			"다흰", "푸름", "승유", "희경", "화영", "서림", "상은", "해주", "해주", "상아", "연제", "예선", "은민", "수예", "소혜", "지운", "희우", "승빈",
			"민성", "나나", "은총", "성주", "담", "리사", "태현", "승원", "하담", "결", "주예", "다슬", "주언", "예송", "그린", "솔지", "윤재", "규희",
			"현수", "경아", "소린", "찬미", "하니", "유원", "단하", "미연", "송하", "초연", "엘리", "현선", "단우", "지솔", "아원", "유비", "래아", "솔아",
			"채우", "혜준", "은조", "애리", "한울", "규아", "규비", "승리", "현민", "성윤", "하얀", "미영", "연호", "제희", "현이", "동희", "승윤", "미서",
			"민슬", "수은", "진이", "영지", "수애", "현비", "진유", "윤혜", "영아", "하솔", "인하", "유화", "미현", "경희", "예경", "수", "한율", "해연",
			"조안", "새롬", "미선", "이린", "해율", "규미", "비", "마리", "자윤", "혜온", "율이", "초이", "은제", "우빈", "다올", "성경", "바다", "승지",
			"세율", "이주", "준영", "미우", "해슬", "해담", "가린", "인경", "레나", "하유", "원영", "벼리", "정화", "소명", "래은", "솔이", "인애", "명주",
			"유니", "유", "비주", "루빈", "설리", "희나", "자은", "담비", "명지", "해은", "소운", "희지", "다유", "리유", "은찬", "경진", "보겸", "경미",
			"이룸", "혜담", "예닮", "아이린", "서혜", "여경", "준이", "효선", "솔미", "미지", "예정", "새나", "지향", "보리", "서휘", "명진", "도혜", "준아",
			"린하", "이음", "이솜", "상희", "자인", "소하", "명서", "여빈", "지해", "해랑", "송아", "윤미", "한희", "유란", "혜솔", "노을", "도예", "한아",
			"자영", "우영", "우경", "재나", "송은", "재린", "영선", "채정", "설화", "이재", "아미", "다진", "성민", "은빛", "나빈", "설린", "자연", "나령",
			"미유", "수련", "효담", "예본", "효영", "세화", "승효", "수화", "우희", "리엘");
}
