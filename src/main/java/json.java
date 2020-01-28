import com.alibaba.fastjson.JSONArray;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class json {

   static String l = "[\n" +
            "        {\n" +
            "            \"large_id\": \"18\",\n" +
            "            \"vaccine_code\": \"1\",\n" +
            "            \"vaccine_cn_full_name\": \"卡介苗\",\n" +
            "            \"vaccine_cn_short_name\": \"卡介苗\",\n" +
            "            \"vaccine_en_full_name\": \"BCG\",\n" +
            "            \"vaccine_en_short_name\": \"BCG\",\n" +
            "            \"vaccine_category\": \"一类\",\n" +
            "            \"Inoculation_order_num\": \"2\",\n" +
            "            \"description\": \"卡介苗\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.673\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"19\",\n" +
            "            \"vaccine_code\": \"2\",\n" +
            "            \"vaccine_cn_full_name\": \"乙肝\",\n" +
            "            \"vaccine_cn_short_name\": \"乙肝\",\n" +
            "            \"vaccine_en_full_name\": \"HepB\",\n" +
            "            \"vaccine_en_short_name\": \"HepB\",\n" +
            "            \"vaccine_category\": \"一类\",\n" +
            "            \"Inoculation_order_num\": \"1\",\n" +
            "            \"description\": \"乙肝\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.676\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"20\",\n" +
            "            \"vaccine_code\": \"3\",\n" +
            "            \"vaccine_cn_full_name\": \"脊灰\",\n" +
            "            \"vaccine_cn_short_name\": \"脊灰\",\n" +
            "            \"vaccine_en_full_name\": \"PV\",\n" +
            "            \"vaccine_en_short_name\": \"PV\",\n" +
            "            \"vaccine_category\": \"一类\",\n" +
            "            \"Inoculation_order_num\": \"3\",\n" +
            "            \"description\": \"脊灰\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.676\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"21\",\n" +
            "            \"vaccine_code\": \"4\",\n" +
            "            \"vaccine_cn_full_name\": \"百白破\",\n" +
            "            \"vaccine_cn_short_name\": \"百白破\",\n" +
            "            \"vaccine_en_full_name\": \"DPT\",\n" +
            "            \"vaccine_en_short_name\": \"DPT\",\n" +
            "            \"vaccine_category\": \"一类\",\n" +
            "            \"Inoculation_order_num\": \"5\",\n" +
            "            \"description\": \"百白破\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.676\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"22\",\n" +
            "            \"vaccine_code\": \"5\",\n" +
            "            \"vaccine_cn_full_name\": \"百白\",\n" +
            "            \"vaccine_cn_short_name\": \"百白\",\n" +
            "            \"vaccine_en_full_name\": \"DP\",\n" +
            "            \"vaccine_en_short_name\": \"DP\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"百白\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.676\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"23\",\n" +
            "            \"vaccine_code\": \"6\",\n" +
            "            \"vaccine_cn_full_name\": \"白破\",\n" +
            "            \"vaccine_cn_short_name\": \"白破\",\n" +
            "            \"vaccine_en_full_name\": \"DT\",\n" +
            "            \"vaccine_en_short_name\": \"DT\",\n" +
            "            \"vaccine_category\": \"一类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"白破\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.676\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"24\",\n" +
            "            \"vaccine_code\": \"7\",\n" +
            "            \"vaccine_cn_full_name\": \"白喉\",\n" +
            "            \"vaccine_cn_short_name\": \"白喉\",\n" +
            "            \"vaccine_en_full_name\": \"DV\",\n" +
            "            \"vaccine_en_short_name\": \"DV\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"白喉\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.68\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"25\",\n" +
            "            \"vaccine_code\": \"8\",\n" +
            "            \"vaccine_cn_full_name\": \"破伤风\",\n" +
            "            \"vaccine_cn_short_name\": \"破伤风\",\n" +
            "            \"vaccine_en_full_name\": \"TT\",\n" +
            "            \"vaccine_en_short_name\": \"TT\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"破伤风\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.68\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"26\",\n" +
            "            \"vaccine_code\": \"9\",\n" +
            "            \"vaccine_cn_full_name\": \"麻疹\",\n" +
            "            \"vaccine_cn_short_name\": \"麻疹\",\n" +
            "            \"vaccine_en_full_name\": \"MV\",\n" +
            "            \"vaccine_en_short_name\": \"MV\",\n" +
            "            \"vaccine_category\": \"一类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"麻疹\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.68\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"27\",\n" +
            "            \"vaccine_code\": \"10\",\n" +
            "            \"vaccine_cn_full_name\": \"腮腺炎\",\n" +
            "            \"vaccine_cn_short_name\": \"腮腺炎\",\n" +
            "            \"vaccine_en_full_name\": \"Mum\",\n" +
            "            \"vaccine_en_short_name\": \"Mum\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"腮腺炎\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.68\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"28\",\n" +
            "            \"vaccine_code\": \"11\",\n" +
            "            \"vaccine_cn_full_name\": \"风疹\",\n" +
            "            \"vaccine_cn_short_name\": \"风疹\",\n" +
            "            \"vaccine_en_full_name\": \"Rub\",\n" +
            "            \"vaccine_en_short_name\": \"Rub\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"风疹\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.68\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"29\",\n" +
            "            \"vaccine_code\": \"12\",\n" +
            "            \"vaccine_cn_full_name\": \"麻腮风\",\n" +
            "            \"vaccine_cn_short_name\": \"麻腮风\",\n" +
            "            \"vaccine_en_full_name\": \"MMR\",\n" +
            "            \"vaccine_en_short_name\": \"MMR\",\n" +
            "            \"vaccine_category\": \"一类\",\n" +
            "            \"Inoculation_order_num\": \"4\",\n" +
            "            \"description\": \"麻腮风\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.68\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"30\",\n" +
            "            \"vaccine_code\": \"13\",\n" +
            "            \"vaccine_cn_full_name\": \"麻腮\",\n" +
            "            \"vaccine_cn_short_name\": \"麻腮\",\n" +
            "            \"vaccine_en_full_name\": \"MM\",\n" +
            "            \"vaccine_en_short_name\": \"MM\",\n" +
            "            \"vaccine_category\": \"一类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"麻腮\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.683\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"31\",\n" +
            "            \"vaccine_code\": \"14\",\n" +
            "            \"vaccine_cn_full_name\": \"麻风\",\n" +
            "            \"vaccine_cn_short_name\": \"麻风\",\n" +
            "            \"vaccine_en_full_name\": \"MR\",\n" +
            "            \"vaccine_en_short_name\": \"MR\",\n" +
            "            \"vaccine_category\": \"一类\",\n" +
            "            \"Inoculation_order_num\": \"4\",\n" +
            "            \"description\": \"麻风\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.683\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"32\",\n" +
            "            \"vaccine_code\": \"15\",\n" +
            "            \"vaccine_cn_full_name\": \"腮风\",\n" +
            "            \"vaccine_cn_short_name\": \"腮风\",\n" +
            "            \"vaccine_en_full_name\": \"MumR\",\n" +
            "            \"vaccine_en_short_name\": \"MumR\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"腮风\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.683\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"33\",\n" +
            "            \"vaccine_code\": \"16\",\n" +
            "            \"vaccine_cn_full_name\": \"流脑A\",\n" +
            "            \"vaccine_cn_short_name\": \"流脑A\",\n" +
            "            \"vaccine_en_full_name\": \"MenA\",\n" +
            "            \"vaccine_en_short_name\": \"MenA\",\n" +
            "            \"vaccine_category\": \"一类\",\n" +
            "            \"Inoculation_order_num\": \"6\",\n" +
            "            \"description\": \"流脑A\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.683\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"34\",\n" +
            "            \"vaccine_code\": \"17\",\n" +
            "            \"vaccine_cn_full_name\": \"流脑A+C\",\n" +
            "            \"vaccine_cn_short_name\": \"流脑A+C\",\n" +
            "            \"vaccine_en_full_name\": \"MenAC\",\n" +
            "            \"vaccine_en_short_name\": \"MenAC\",\n" +
            "            \"vaccine_category\": \"一类\",\n" +
            "            \"Inoculation_order_num\": \"6\",\n" +
            "            \"description\": \"流脑A+C\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.683\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"35\",\n" +
            "            \"vaccine_code\": \"18\",\n" +
            "            \"vaccine_cn_full_name\": \"乙脑\",\n" +
            "            \"vaccine_cn_short_name\": \"乙脑\",\n" +
            "            \"vaccine_en_full_name\": \"JE\",\n" +
            "            \"vaccine_en_short_name\": \"JE\",\n" +
            "            \"vaccine_category\": \"一类\",\n" +
            "            \"Inoculation_order_num\": \"7\",\n" +
            "            \"description\": \"乙脑\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.686\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"36\",\n" +
            "            \"vaccine_code\": \"19\",\n" +
            "            \"vaccine_cn_full_name\": \"甲肝\",\n" +
            "            \"vaccine_cn_short_name\": \"甲肝\",\n" +
            "            \"vaccine_en_full_name\": \"HepA\",\n" +
            "            \"vaccine_en_short_name\": \"HepA\",\n" +
            "            \"vaccine_category\": \"一类\",\n" +
            "            \"Inoculation_order_num\": \"8\",\n" +
            "            \"description\": \"甲肝\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.686\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"37\",\n" +
            "            \"vaccine_code\": \"20\",\n" +
            "            \"vaccine_cn_full_name\": \"甲乙肝\",\n" +
            "            \"vaccine_cn_short_name\": \"甲乙肝\",\n" +
            "            \"vaccine_en_full_name\": \"HepAB\",\n" +
            "            \"vaccine_en_short_name\": \"HepAB\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"甲乙肝\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.686\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"38\",\n" +
            "            \"vaccine_code\": \"21\",\n" +
            "            \"vaccine_cn_full_name\": \"流感\",\n" +
            "            \"vaccine_cn_short_name\": \"流感\",\n" +
            "            \"vaccine_en_full_name\": \"Flu\",\n" +
            "            \"vaccine_en_short_name\": \"Flu\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"流感\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.686\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"39\",\n" +
            "            \"vaccine_code\": \"22\",\n" +
            "            \"vaccine_cn_full_name\": \"水痘\",\n" +
            "            \"vaccine_cn_short_name\": \"水痘\",\n" +
            "            \"vaccine_en_full_name\": \"Var\",\n" +
            "            \"vaccine_en_short_name\": \"Var\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"水痘\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.686\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"40\",\n" +
            "            \"vaccine_code\": \"23\",\n" +
            "            \"vaccine_cn_full_name\": \"Hib\",\n" +
            "            \"vaccine_cn_short_name\": \"Hib\",\n" +
            "            \"vaccine_en_full_name\": \"Hib\",\n" +
            "            \"vaccine_en_short_name\": \"Hib\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"Hib\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.69\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"41\",\n" +
            "            \"vaccine_code\": \"24\",\n" +
            "            \"vaccine_cn_full_name\": \"轮状病毒\",\n" +
            "            \"vaccine_cn_short_name\": \"轮状病毒\",\n" +
            "            \"vaccine_en_full_name\": \"Rot\",\n" +
            "            \"vaccine_en_short_name\": \"Rot\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"轮状病毒\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.69\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"42\",\n" +
            "            \"vaccine_code\": \"25\",\n" +
            "            \"vaccine_cn_full_name\": \"肺炎\",\n" +
            "            \"vaccine_cn_short_name\": \"肺炎\",\n" +
            "            \"vaccine_en_full_name\": \"Pneu\",\n" +
            "            \"vaccine_en_short_name\": \"Pneu\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"肺炎\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.69\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"43\",\n" +
            "            \"vaccine_code\": \"26\",\n" +
            "            \"vaccine_cn_full_name\": \"气管炎\",\n" +
            "            \"vaccine_cn_short_name\": \"气管炎\",\n" +
            "            \"vaccine_en_full_name\": \"Tra\",\n" +
            "            \"vaccine_en_short_name\": \"Tra\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"气管炎\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.69\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"44\",\n" +
            "            \"vaccine_code\": \"27\",\n" +
            "            \"vaccine_cn_full_name\": \"兰菌净\",\n" +
            "            \"vaccine_cn_short_name\": \"兰菌净\",\n" +
            "            \"vaccine_en_full_name\": \"Lan\",\n" +
            "            \"vaccine_en_short_name\": \"Lan\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"兰菌净\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.69\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"45\",\n" +
            "            \"vaccine_code\": \"28\",\n" +
            "            \"vaccine_cn_full_name\": \"狂犬病\",\n" +
            "            \"vaccine_cn_short_name\": \"狂犬病\",\n" +
            "            \"vaccine_en_full_name\": \"Rab\",\n" +
            "            \"vaccine_en_short_name\": \"Rab\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"狂犬病\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.69\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"46\",\n" +
            "            \"vaccine_code\": \"29\",\n" +
            "            \"vaccine_cn_full_name\": \"出血热\",\n" +
            "            \"vaccine_cn_short_name\": \"出血热\",\n" +
            "            \"vaccine_en_full_name\": \"HF\",\n" +
            "            \"vaccine_en_short_name\": \"HF\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"出血热\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.69\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"47\",\n" +
            "            \"vaccine_code\": \"30\",\n" +
            "            \"vaccine_cn_full_name\": \"伤寒\",\n" +
            "            \"vaccine_cn_short_name\": \"伤寒\",\n" +
            "            \"vaccine_en_full_name\": \"Typh\",\n" +
            "            \"vaccine_en_short_name\": \"Typh\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"伤寒\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.693\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"48\",\n" +
            "            \"vaccine_code\": \"31\",\n" +
            "            \"vaccine_cn_full_name\": \"伤寒副伤寒甲\",\n" +
            "            \"vaccine_cn_short_name\": \"伤寒副伤寒甲\",\n" +
            "            \"vaccine_en_full_name\": \"T-pTA\",\n" +
            "            \"vaccine_en_short_name\": \"T-pTA\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"伤寒副伤寒甲\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.693\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"49\",\n" +
            "            \"vaccine_code\": \"32\",\n" +
            "            \"vaccine_cn_full_name\": \"伤寒副伤寒甲乙\",\n" +
            "            \"vaccine_cn_short_name\": \"伤寒副伤寒甲乙\",\n" +
            "            \"vaccine_en_full_name\": \"T-pTAB\",\n" +
            "            \"vaccine_en_short_name\": \"T-pTAB\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"伤寒副伤寒甲乙\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.693\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"50\",\n" +
            "            \"vaccine_code\": \"33\",\n" +
            "            \"vaccine_cn_full_name\": \"痢疾\",\n" +
            "            \"vaccine_cn_short_name\": \"痢疾\",\n" +
            "            \"vaccine_en_full_name\": \"Dys\",\n" +
            "            \"vaccine_en_short_name\": \"Dys\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"痢疾\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.693\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"51\",\n" +
            "            \"vaccine_code\": \"34\",\n" +
            "            \"vaccine_cn_full_name\": \"钩体\",\n" +
            "            \"vaccine_cn_short_name\": \"钩体\",\n" +
            "            \"vaccine_en_full_name\": \"Lep\",\n" +
            "            \"vaccine_en_short_name\": \"Lep\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"钩体\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.696\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"52\",\n" +
            "            \"vaccine_code\": \"35\",\n" +
            "            \"vaccine_cn_full_name\": \"鼠疫\",\n" +
            "            \"vaccine_cn_short_name\": \"鼠疫\",\n" +
            "            \"vaccine_en_full_name\": \"Plag\",\n" +
            "            \"vaccine_en_short_name\": \"Plag\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"鼠疫\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.696\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"53\",\n" +
            "            \"vaccine_code\": \"36\",\n" +
            "            \"vaccine_cn_full_name\": \"炭疽\",\n" +
            "            \"vaccine_cn_short_name\": \"炭疽\",\n" +
            "            \"vaccine_en_full_name\": \"Anth\",\n" +
            "            \"vaccine_en_short_name\": \"Anth\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"炭疽\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.696\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"54\",\n" +
            "            \"vaccine_code\": \"37\",\n" +
            "            \"vaccine_cn_full_name\": \"布病\",\n" +
            "            \"vaccine_cn_short_name\": \"布病\",\n" +
            "            \"vaccine_en_full_name\": \"bruc\",\n" +
            "            \"vaccine_en_short_name\": \"bruc\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"布病\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.696\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"55\",\n" +
            "            \"vaccine_code\": \"38\",\n" +
            "            \"vaccine_cn_full_name\": \"霍乱\",\n" +
            "            \"vaccine_cn_short_name\": \"霍乱\",\n" +
            "            \"vaccine_en_full_name\": \"Chol\",\n" +
            "            \"vaccine_en_short_name\": \"Chol\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"霍乱\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.696\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"56\",\n" +
            "            \"vaccine_code\": \"39\",\n" +
            "            \"vaccine_cn_full_name\": \"乙肝球蛋白\",\n" +
            "            \"vaccine_cn_short_name\": \"乙肝球蛋白\",\n" +
            "            \"vaccine_en_full_name\": \"HepBIG\",\n" +
            "            \"vaccine_en_short_name\": \"HepBIG\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"乙肝球蛋白\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.7\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"57\",\n" +
            "            \"vaccine_code\": \"40\",\n" +
            "            \"vaccine_cn_full_name\": \"白抗\",\n" +
            "            \"vaccine_cn_short_name\": \"白抗\",\n" +
            "            \"vaccine_en_full_name\": \"DAT\",\n" +
            "            \"vaccine_en_short_name\": \"DAT\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"白抗\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.7\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"58\",\n" +
            "            \"vaccine_code\": \"41\",\n" +
            "            \"vaccine_cn_full_name\": \"破抗\",\n" +
            "            \"vaccine_cn_short_name\": \"破抗\",\n" +
            "            \"vaccine_en_full_name\": \"TAT\",\n" +
            "            \"vaccine_en_short_name\": \"TAT\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"破抗\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.7\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"59\",\n" +
            "            \"vaccine_code\": \"42\",\n" +
            "            \"vaccine_cn_full_name\": \"破伤风球蛋白\",\n" +
            "            \"vaccine_cn_short_name\": \"破伤风球蛋白\",\n" +
            "            \"vaccine_en_full_name\": \"TIG\",\n" +
            "            \"vaccine_en_short_name\": \"TIG\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"破伤风球蛋白\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.7\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"60\",\n" +
            "            \"vaccine_code\": \"43\",\n" +
            "            \"vaccine_cn_full_name\": \"狂犬病血清\",\n" +
            "            \"vaccine_cn_short_name\": \"狂犬病血清\",\n" +
            "            \"vaccine_en_full_name\": \"RAS\",\n" +
            "            \"vaccine_en_short_name\": \"RAS\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"狂犬病血清\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.703\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"61\",\n" +
            "            \"vaccine_code\": \"44\",\n" +
            "            \"vaccine_cn_full_name\": \"狂犬免疫球蛋白\",\n" +
            "            \"vaccine_cn_short_name\": \"狂犬免疫球蛋白\",\n" +
            "            \"vaccine_en_full_name\": \"RIG\",\n" +
            "            \"vaccine_en_short_name\": \"RIG\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"狂犬免疫球蛋白\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.703\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"62\",\n" +
            "            \"vaccine_code\": \"45\",\n" +
            "            \"vaccine_cn_full_name\": \"纯蛋白衍生物\",\n" +
            "            \"vaccine_cn_short_name\": \"纯蛋白衍生物\",\n" +
            "            \"vaccine_en_full_name\": \"PPD\",\n" +
            "            \"vaccine_en_short_name\": \"PPD\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"纯蛋白衍生物\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.703\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"63\",\n" +
            "            \"vaccine_code\": \"46\",\n" +
            "            \"vaccine_cn_full_name\": \"锡克毒素\",\n" +
            "            \"vaccine_cn_short_name\": \"锡克毒素\",\n" +
            "            \"vaccine_en_full_name\": \"STT\",\n" +
            "            \"vaccine_en_short_name\": \"STT\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"锡克毒素\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.706\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"64\",\n" +
            "            \"vaccine_code\": \"47\",\n" +
            "            \"vaccine_cn_full_name\": \"森林脑炎\",\n" +
            "            \"vaccine_cn_short_name\": \"森林脑炎\",\n" +
            "            \"vaccine_en_full_name\": \"TBE\",\n" +
            "            \"vaccine_en_short_name\": \"TBE\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"森林脑炎\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.706\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"65\",\n" +
            "            \"vaccine_code\": \"48\",\n" +
            "            \"vaccine_cn_full_name\": \"登革热\",\n" +
            "            \"vaccine_cn_short_name\": \"登革热\",\n" +
            "            \"vaccine_en_full_name\": \"DFV\",\n" +
            "            \"vaccine_en_short_name\": \"DFV\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"登革热\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.706\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"66\",\n" +
            "            \"vaccine_code\": \"49\",\n" +
            "            \"vaccine_cn_full_name\": \"百白破Hib四联\",\n" +
            "            \"vaccine_cn_short_name\": \"百白破Hib四联\",\n" +
            "            \"vaccine_en_full_name\": \"DTaP-Hib\",\n" +
            "            \"vaccine_en_short_name\": \"DTaP-Hib\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"5\",\n" +
            "            \"description\": \"百白破Hib四联\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.71\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"67\",\n" +
            "            \"vaccine_code\": \"50\",\n" +
            "            \"vaccine_cn_full_name\": \"百白破IPV和Hib五联\",\n" +
            "            \"vaccine_cn_short_name\": \"百白破IPV和Hib五联\",\n" +
            "            \"vaccine_en_full_name\": \"DTaP-IPV/H\",\n" +
            "            \"vaccine_en_short_name\": \"DTaP-IPV/H\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"3\",\n" +
            "            \"description\": \"百白破IPV和Hib五联\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.71\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"68\",\n" +
            "            \"vaccine_code\": \"51\",\n" +
            "            \"vaccine_cn_full_name\": \"黄热减毒活疫苗\",\n" +
            "            \"vaccine_cn_short_name\": \"黄热减毒活疫苗\",\n" +
            "            \"vaccine_en_full_name\": \"YF\",\n" +
            "            \"vaccine_en_short_name\": \"YF\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"黄热减毒活疫苗\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.71\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"69\",\n" +
            "            \"vaccine_code\": \"52\",\n" +
            "            \"vaccine_cn_full_name\": \"戊肝\",\n" +
            "            \"vaccine_cn_short_name\": \"戊肝\",\n" +
            "            \"vaccine_en_full_name\": \"HepE\",\n" +
            "            \"vaccine_en_short_name\": \"HepE\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"戊肝\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.71\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"70\",\n" +
            "            \"vaccine_code\": \"53\",\n" +
            "            \"vaccine_cn_full_name\": \"AC-Hib联合疫苗\",\n" +
            "            \"vaccine_cn_short_name\": \"AC-Hib联合疫苗\",\n" +
            "            \"vaccine_en_full_name\": \"AC-Hib\",\n" +
            "            \"vaccine_en_short_name\": \"AC-Hib\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"6\",\n" +
            "            \"description\": \"AC-Hib联合疫苗\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.713\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"71\",\n" +
            "            \"vaccine_code\": \"54\",\n" +
            "            \"vaccine_cn_full_name\": \"肠道病毒71型灭活疫苗\",\n" +
            "            \"vaccine_cn_short_name\": \"肠道病毒71型灭活疫苗\",\n" +
            "            \"vaccine_en_full_name\": \"EV71V\",\n" +
            "            \"vaccine_en_short_name\": \"EV71V\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"肠道病毒71型灭活疫苗\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.713\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"72\",\n" +
            "            \"vaccine_code\": \"55\",\n" +
            "            \"vaccine_cn_full_name\": \"人乳头疫苗\",\n" +
            "            \"vaccine_cn_short_name\": \"人乳头疫苗\",\n" +
            "            \"vaccine_en_full_name\": \"HPV\",\n" +
            "            \"vaccine_en_short_name\": \"HPV\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"人乳头疫苗\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.716\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"73\",\n" +
            "            \"vaccine_code\": \"91\",\n" +
            "            \"vaccine_cn_full_name\": \"甲型流感\",\n" +
            "            \"vaccine_cn_short_name\": \"甲型流感\",\n" +
            "            \"vaccine_en_full_name\": \"FluA\",\n" +
            "            \"vaccine_en_short_name\": \"FluA\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"甲型流感\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.716\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"74\",\n" +
            "            \"vaccine_code\": \"92\",\n" +
            "            \"vaccine_cn_full_name\": \"七价肺炎\",\n" +
            "            \"vaccine_cn_short_name\": \"七价肺炎\",\n" +
            "            \"vaccine_en_full_name\": \"PCV-7\",\n" +
            "            \"vaccine_en_short_name\": \"PCV-7\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"七价肺炎\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.716\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"75\",\n" +
            "            \"vaccine_code\": \"93\",\n" +
            "            \"vaccine_cn_full_name\": \"13价肺炎\",\n" +
            "            \"vaccine_cn_short_name\": \"13价肺炎\",\n" +
            "            \"vaccine_en_full_name\": \"PCV13\",\n" +
            "            \"vaccine_en_short_name\": \"PCV13\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"13价肺炎\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.72\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"large_id\": \"76\",\n" +
            "            \"vaccine_code\": \"99\",\n" +
            "            \"vaccine_cn_full_name\": \"其他\",\n" +
            "            \"vaccine_cn_short_name\": \"其他\",\n" +
            "            \"vaccine_en_full_name\": \"OTHER\",\n" +
            "            \"vaccine_en_short_name\": \"OTHER\",\n" +
            "            \"vaccine_category\": \"二类\",\n" +
            "            \"Inoculation_order_num\": \"9\",\n" +
            "            \"description\": \"其他\",\n" +
            "            \"created_by\": \"\",\n" +
            "            \"creation_date\": \"8/1/2020 15:34:16.72\",\n" +
            "            \"last_updated_by\": \"\",\n" +
            "            \"last_updated_date\": \"\",\n" +
            "            \"enabled_flag\": \"Jan  8 2020  3:34PM\"\n" +
            "        }\n" +
            "    ]";

        static String m = "[{\"vaccineCnShort\":\"卡介苗\",\"vaccineEnShort\":\"BCG\",\"vaccineCnFull\":\"皮内注射用卡介苗\",\"vaccineCode\":\"0101\",\"inoculationDesc\":\"2\",\"property\":\"一类\"},{\"vaccineCnShort\":\"乙肝(CHO)\",\"vaccineEnShort\":\"HepB-cho\",\"vaccineCnFull\":\"重组乙型肝炎疫苗(CHO细胞)\",\"vaccineCode\":\"0201\",\"inoculationDesc\":\"1\",\"property\":\"一类\"},{\"vaccineCnShort\":\"乙肝(酿酒酵母)\",\"vaccineEnShort\":\"HepB-scy\",\"vaccineCnFull\":\"重组乙型肝炎疫苗(酿酒酵母)\",\"vaccineCode\":\"0202\",\"inoculationDesc\":\"1\",\"property\":\"一类\"},{\"vaccineCnShort\":\"乙肝(汉逊酵母)\",\"vaccineEnShort\":\"HepB-hpy\",\"vaccineCnFull\":\"重组乙型肝炎疫苗(汉逊酵母)\",\"vaccineCode\":\"0203\",\"inoculationDesc\":\"1\",\"property\":\"一类\"},{\"vaccineCnShort\":\"脊灰(减毒二倍体)\",\"vaccineEnShort\":\"OPV-hdc\",\"vaccineCnFull\":\"脊髓灰质炎减毒活疫苗(人二倍体细胞)\",\"vaccineCode\":\"0301\",\"inoculationDesc\":\"3\",\"property\":\"一类\"},{\"vaccineCnShort\":\"脊灰(减毒猴肾)\",\"vaccineEnShort\":\"OPV-mkc\",\"vaccineCnFull\":\"脊髓灰质炎减毒活疫苗(猴肾细胞)\",\"vaccineCode\":\"0302\",\"inoculationDesc\":\"3\",\"property\":\"一类\"},{\"vaccineCnShort\":\"脊灰(灭活)\",\"vaccineEnShort\":\"IPV\",\"vaccineCnFull\":\"脊髓灰质炎灭活疫苗\",\"vaccineCode\":\"0303\",\"inoculationDesc\":\"3\",\"property\":\"一类\"},{\"vaccineCnShort\":\"脊灰减毒(液体)\",\"vaccineEnShort\":\"OPV\",\"vaccineCnFull\":\"脊髓灰质炎减毒活疫苗(液体)\",\"vaccineCode\":\"0304\",\"inoculationDesc\":\"3\",\"property\":\"一类\"},{\"vaccineCnShort\":\"Sabin株脊灰灭活疫苗\",\"vaccineEnShort\":\"sIPV\",\"vaccineCnFull\":\"脊髓灰质炎灭活疫苗\",\"vaccineCode\":\"0306\",\"inoculationDesc\":\"3\",\"property\":\"一类\"},{\"vaccineCnShort\":\"二价脊灰疫苗\",\"vaccineEnShort\":\"bOPV\",\"vaccineCnFull\":\"口服Ⅰ型Ⅲ脊髓灰质炎减毒活疫苗（人二倍体细胞）\",\"vaccineCode\":\"0311\",\"inoculationDesc\":\"3\",\"property\":\"一类\"},{\"vaccineCnShort\":\"百白破\",\"vaccineEnShort\":\"DPT\",\"vaccineCnFull\":\"吸附百白破联合疫苗\",\"vaccineCode\":\"0401\",\"inoculationDesc\":\"5\",\"property\":\"一类\"},{\"vaccineCnShort\":\"百白破(无细胞)\",\"vaccineEnShort\":\"DaPT\",\"vaccineCnFull\":\"吸附无细胞百白破联合疫苗\",\"vaccineCode\":\"0402\",\"inoculationDesc\":\"5\",\"property\":\"一类\"},{\"vaccineCnShort\":\"百白\",\"vaccineEnShort\":\"DP\",\"vaccineCnFull\":\"吸附百日咳白喉联合疫苗\",\"vaccineCode\":\"0501\",\"inoculationDesc\":\"9\",\"property\":\"一类\"},{\"vaccineCnShort\":\"白破\",\"vaccineEnShort\":\"DT\",\"vaccineCnFull\":\"吸附白喉破伤风联合疫苗\",\"vaccineCode\":\"0601\",\"inoculationDesc\":\"5\",\"property\":\"一类\"},{\"vaccineCnShort\":\"白破(成人)\",\"vaccineEnShort\":\"DT-a\",\"vaccineCnFull\":\"吸附白喉破伤风联合疫苗(成人及青少年用)\",\"vaccineCode\":\"0602\",\"inoculationDesc\":\"9\",\"property\":\"一类\"},{\"vaccineCnShort\":\"百白破(青少年)\",\"vaccineEnShort\":\"Tdap\",\"vaccineCnFull\":\"吸附无细胞百白破联合疫苗(青少年)\",\"vaccineCode\":\"0603\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"白喉\",\"vaccineEnShort\":\"Dv\",\"vaccineCnFull\":\"吸附白喉疫苗\",\"vaccineCode\":\"0701\",\"inoculationDesc\":\"9\",\"property\":\"一类\"},{\"vaccineCnShort\":\"白喉(成人)\",\"vaccineEnShort\":\"Dv-a\",\"vaccineCnFull\":\"吸附白喉疫苗(成人及青少年用)\",\"vaccineCode\":\"0702\",\"inoculationDesc\":\"9\",\"property\":\"一类\"},{\"vaccineCnShort\":\"破伤风\",\"vaccineEnShort\":\"TT\",\"vaccineCnFull\":\"吸附破伤风疫苗\",\"vaccineCode\":\"0801\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"麻疹\",\"vaccineEnShort\":\"MV\",\"vaccineCnFull\":\"麻疹减毒活疫苗\",\"vaccineCode\":\"0901\",\"inoculationDesc\":\"4\",\"property\":\"一类\"},{\"vaccineCnShort\":\"腮腺炎\",\"vaccineEnShort\":\"Mum\",\"vaccineCnFull\":\"腮腺炎减毒活疫苗\",\"vaccineCode\":\"1001\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"风疹(二倍体)\",\"vaccineEnShort\":\"Rub-hdc\",\"vaccineCnFull\":\"风疹减毒活疫苗(人二倍体细胞)\",\"vaccineCode\":\"1101\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"风疹(兔肾)\",\"vaccineEnShort\":\"Rub-rkc\",\"vaccineCnFull\":\"风疹减毒活疫苗(兔肾细胞)\",\"vaccineCode\":\"1102\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"麻腮风\",\"vaccineEnShort\":\"MMR\",\"vaccineCnFull\":\"麻疹腮腺炎风疹联合减毒活疫苗\",\"vaccineCode\":\"1201\",\"inoculationDesc\":\"4\",\"property\":\"一类\"},{\"vaccineCnShort\":\"麻腮\",\"vaccineEnShort\":\"MM\",\"vaccineCnFull\":\"麻疹腮腺炎联合减毒活疫苗\",\"vaccineCode\":\"1301\",\"inoculationDesc\":\"4\",\"property\":\"一类\"},{\"vaccineCnShort\":\"麻风\",\"vaccineEnShort\":\"MR\",\"vaccineCnFull\":\"麻疹风疹联合减毒活疫苗\",\"vaccineCode\":\"1401\",\"inoculationDesc\":\"4\",\"property\":\"一类\"},{\"vaccineCnShort\":\"腮风\",\"vaccineEnShort\":\"MumR\",\"vaccineCnFull\":\"腮腺炎风疹联合减毒活疫苗\",\"vaccineCode\":\"1501\",\"inoculationDesc\":\"4\",\"property\":\"一类\"},{\"vaccineCnShort\":\"流脑A\",\"vaccineEnShort\":\"MenA\",\"vaccineCnFull\":\"A群脑膜炎球菌多糖疫苗\",\"vaccineCode\":\"1601\",\"inoculationDesc\":\"6\",\"property\":\"一类\"},{\"vaccineCnShort\":\"流脑A+C结合\",\"vaccineEnShort\":\"MenAC\",\"vaccineCnFull\":\"A+C群脑膜炎球菌多糖结合疫苗\",\"vaccineCode\":\"1602\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"流脑A+C\",\"vaccineEnShort\":\"MenAC\",\"vaccineCnFull\":\"A+C群脑膜炎球菌多糖疫苗\",\"vaccineCode\":\"1701\",\"inoculationDesc\":\"6\",\"property\":\"一类\"},{\"vaccineCnShort\":\"流脑A+C+Y+W135\",\"vaccineEnShort\":\"MenAC\",\"vaccineCnFull\":\"ACYW135群脑膜炎球菌多糖疫苗\",\"vaccineCode\":\"1703\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"乙脑(减毒)\",\"vaccineEnShort\":\"JE-l\",\"vaccineCnFull\":\"乙型脑炎减毒活疫苗\",\"vaccineCode\":\"1801\",\"inoculationDesc\":\"7\",\"property\":\"一类\"},{\"vaccineCnShort\":\"乙脑(灭活)\",\"vaccineEnShort\":\"JE-i\",\"vaccineCnFull\":\"乙型脑炎灭活疫苗\",\"vaccineCode\":\"1802\",\"inoculationDesc\":\"7\",\"property\":\"二类\"},{\"vaccineCnShort\":\"甲肝(减毒)\",\"vaccineEnShort\":\"HepA-l\",\"vaccineCnFull\":\"甲型肝炎减毒活疫苗\",\"vaccineCode\":\"1901\",\"inoculationDesc\":\"8\",\"property\":\"一类\"},{\"vaccineCnShort\":\"甲肝(减毒冻干)\",\"vaccineEnShort\":\"HepA-l-fd\",\"vaccineCnFull\":\"冻干甲型肝炎减毒活疫苗\",\"vaccineCode\":\"1902\",\"inoculationDesc\":\"12\",\"property\":\"一类\"},{\"vaccineCnShort\":\"甲肝(灭活)\",\"vaccineEnShort\":\"HepA-i\",\"vaccineCnFull\":\"甲型肝炎灭活疫苗\",\"vaccineCode\":\"1903\",\"inoculationDesc\":\"8\",\"property\":\"二类\"},{\"vaccineCnShort\":\"甲乙肝\",\"vaccineEnShort\":\"HepAB\",\"vaccineCnFull\":\"甲肝乙肝联合疫苗\",\"vaccineCode\":\"2001\",\"inoculationDesc\":\"12\",\"property\":\"二类\"},{\"vaccineCnShort\":\"流感(全病毒)\",\"vaccineEnShort\":\"Flu-wv\",\"vaccineCnFull\":\"流行性感冒全病毒灭活疫苗\",\"vaccineCode\":\"2101\",\"inoculationDesc\":\"12\",\"property\":\"二类\"},{\"vaccineCnShort\":\"流感(裂解)\",\"vaccineEnShort\":\"Flu-sp\",\"vaccineCnFull\":\"流行性感冒裂解疫苗\",\"vaccineCode\":\"2102\",\"inoculationDesc\":\"12\",\"property\":\"二类\"},{\"vaccineCnShort\":\"流感(亚单位)\",\"vaccineEnShort\":\"Flu-su\",\"vaccineCnFull\":\"流行性感冒亚单位疫苗\",\"vaccineCode\":\"2103\",\"inoculationDesc\":\"12\",\"property\":\"二类\"},{\"vaccineCnShort\":\"4价流感\",\"vaccineEnShort\":\"InfV-4\",\"vaccineCnFull\":\"四价流感病毒裂解疫苗\",\"vaccineCode\":\"2108\",\"inoculationDesc\":\"12\",\"property\":\"二类\"},{\"vaccineCnShort\":\"水痘\",\"vaccineEnShort\":\"Var\",\"vaccineCnFull\":\"冻干水痘减毒活疫苗\",\"vaccineCode\":\"2201\",\"inoculationDesc\":\"12\",\"property\":\"二类\"},{\"vaccineCnShort\":\"Hib\",\"vaccineEnShort\":\"Hib\",\"vaccineCnFull\":\"b型流感嗜血杆菌多糖结合疫苗\",\"vaccineCode\":\"2301\",\"inoculationDesc\":\"12\",\"property\":\"二类\"},{\"vaccineCnShort\":\"Hib-OMPC\",\"vaccineEnShort\":\"Hib-OMPC\",\"vaccineCnFull\":\"b型流感嗜血杆菌多糖结合疫苗\",\"vaccineCode\":\"2302\",\"inoculationDesc\":\"12\",\"property\":\"二类\"},{\"vaccineCnShort\":\"轮状病毒\",\"vaccineEnShort\":\"Rot\",\"vaccineCnFull\":\"口服轮状病毒活疫苗\",\"vaccineCode\":\"2401\",\"inoculationDesc\":\"12\",\"property\":\"二类\"},{\"vaccineCnShort\":\"5价轮状病毒疫苗\",\"vaccineEnShort\":\"RotV-5\",\"vaccineCnFull\":\"口服五价重配轮状病毒减毒活疫苗(Vero细胞)\",\"vaccineCode\":\"2402\",\"inoculationDesc\":\"12\",\"property\":\"二类\"},{\"vaccineCnShort\":\"肺炎23\",\"vaccineEnShort\":\"PPSV-23\",\"vaccineCnFull\":\"23价肺炎球菌多糖疫苗\",\"vaccineCode\":\"2501\",\"inoculationDesc\":\"12\",\"property\":\"二类\"},{\"vaccineCnShort\":\"13价肺炎疫苗\",\"vaccineEnShort\":\"PCV13\",\"vaccineCnFull\":\"13价肺炎球菌多糖结合疫苗\",\"vaccineCode\":\"2503\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"气管炎\",\"vaccineEnShort\":\"Tra\",\"vaccineCnFull\":\"气管炎疫苗\",\"vaccineCode\":\"2601\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"兰菌净\",\"vaccineEnShort\":\"Lan\",\"vaccineCnFull\":\"兰菌净细菌溶解物\",\"vaccineCode\":\"2701\",\"inoculationDesc\":\"12\",\"property\":\"二类\"},{\"vaccineCnShort\":\"狂犬病(Vero)\",\"vaccineEnShort\":\"Rab-Vero\",\"vaccineCnFull\":\"人用狂犬病疫苗(Vero细胞)\",\"vaccineCode\":\"2801\",\"inoculationDesc\":\"12\",\"property\":\"二类\"},{\"vaccineCnShort\":\"狂犬病(Vero冻干)\",\"vaccineEnShort\":\"Rab-Vero-fd\",\"vaccineCnFull\":\"冻干人用狂犬病疫苗(Vero细胞)\",\"vaccineCode\":\"2802\",\"inoculationDesc\":\"12\",\"property\":\"二类\"},{\"vaccineCnShort\":\"狂犬病(地鼠肾)\",\"vaccineEnShort\":\"Rab-hkc\",\"vaccineCnFull\":\"人用狂犬病疫苗(地鼠肾细胞)\",\"vaccineCode\":\"2803\",\"inoculationDesc\":\"12\",\"property\":\"二类\"},{\"vaccineCnShort\":\"狂犬病疫苗(二倍体)\",\"vaccineEnShort\":\"Rab-ebt\",\"vaccineCnFull\":\"狂犬病疫苗(二倍体细胞)\",\"vaccineCode\":\"2804\",\"inoculationDesc\":\"13\",\"property\":\"二类\"},{\"vaccineCnShort\":\"狂犬病疫苗(鸡胚)\",\"vaccineEnShort\":\"Rab-jp\",\"vaccineCnFull\":\"狂犬病疫苗(鸡胚细胞)\",\"vaccineCode\":\"2805\",\"inoculationDesc\":\"14\",\"property\":\"二类\"},{\"vaccineCnShort\":\"出血热(Ⅰ价)\",\"vaccineEnShort\":\"HFⅠ\",\"vaccineCnFull\":\"Ⅰ价肾综合征出血热灭活疫苗\",\"vaccineCode\":\"2901\",\"inoculationDesc\":\"10\",\"property\":\"二类\"},{\"vaccineCnShort\":\"出血热(Ⅱ价)\",\"vaccineEnShort\":\"HFⅡ\",\"vaccineCnFull\":\"Ⅱ价肾综合征出血热灭活疫苗\",\"vaccineCode\":\"2902\",\"inoculationDesc\":\"10\",\"property\":\"二类\"},{\"vaccineCnShort\":\"出血热(双价)\",\"vaccineEnShort\":\"HFⅠ+Ⅱ\",\"vaccineCnFull\":\"双价肾综合征出血热灭活疫苗\",\"vaccineCode\":\"2903\",\"inoculationDesc\":\"10\",\"property\":\"二类\"},{\"vaccineCnShort\":\"伤寒\",\"vaccineEnShort\":\"Typh\",\"vaccineCnFull\":\"伤寒疫苗\",\"vaccineCode\":\"3001\",\"inoculationDesc\":\"11\",\"property\":\"二类\"},{\"vaccineCnShort\":\"伤寒Vi\",\"vaccineEnShort\":\"Typh-Vi\",\"vaccineCnFull\":\"伤寒Vi多糖疫苗\",\"vaccineCode\":\"3002\",\"inoculationDesc\":\"11\",\"property\":\"二类\"},{\"vaccineCnShort\":\"伤寒副伤寒甲\",\"vaccineEnShort\":\"T-pTA\",\"vaccineCnFull\":\"伤寒副伤寒甲联合疫苗\",\"vaccineCode\":\"3101\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"伤寒副伤寒甲乙\",\"vaccineEnShort\":\"T-pTAB\",\"vaccineCnFull\":\"伤寒副伤寒甲乙联合疫苗\",\"vaccineCode\":\"3201\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"痢疾\",\"vaccineEnShort\":\"Dys\",\"vaccineCnFull\":\"口服福氏宋内痢疾双价活疫苗\",\"vaccineCode\":\"3301\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"钩体\",\"vaccineEnShort\":\"Lep\",\"vaccineCnFull\":\"钩端螺旋体疫苗\",\"vaccineCode\":\"3401\",\"inoculationDesc\":\"9\",\"property\":\"一类\"},{\"vaccineCnShort\":\"鼠疫\",\"vaccineEnShort\":\"Plag\",\"vaccineCnFull\":\"皮肤划痕用鼠疫活疫苗\",\"vaccineCode\":\"3501\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"炭疽\",\"vaccineEnShort\":\"Anth\",\"vaccineCnFull\":\"皮肤划痕人用炭疽活疫苗\",\"vaccineCode\":\"3601\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"布病\",\"vaccineEnShort\":\"Bruc\",\"vaccineCnFull\":\"皮肤划痕人用布氏菌活疫苗\",\"vaccineCode\":\"3701\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"霍乱\",\"vaccineEnShort\":\"Chol\",\"vaccineCnFull\":\"霍乱疫苗\",\"vaccineCode\":\"3801\",\"inoculationDesc\":\"12\",\"property\":\"二类\"},{\"vaccineCnShort\":\"乙肝球蛋白\",\"vaccineEnShort\":\"HepBIG\",\"vaccineCnFull\":\"乙型肝炎人免疫球蛋白\",\"vaccineCode\":\"3901\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"乙肝球蛋白(冻干)\",\"vaccineEnShort\":\"HepBIG-fd\",\"vaccineCnFull\":\"冻干乙型肝炎人免疫球蛋白\",\"vaccineCode\":\"3902\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"白抗\",\"vaccineEnShort\":\"DAT\",\"vaccineCnFull\":\"白喉抗毒素\",\"vaccineCode\":\"4001\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"白抗(冻干)\",\"vaccineEnShort\":\"DAT-fd\",\"vaccineCnFull\":\"冻干白喉抗毒素\",\"vaccineCode\":\"4002\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"破抗\",\"vaccineEnShort\":\"TAT\",\"vaccineCnFull\":\"破伤风抗毒素\",\"vaccineCode\":\"4101\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"破抗(冻干)\",\"vaccineEnShort\":\"TAT-fd\",\"vaccineCnFull\":\"冻干破伤风抗毒素\",\"vaccineCode\":\"4102\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"破伤风球蛋白\",\"vaccineEnShort\":\"TIG\",\"vaccineCnFull\":\"破伤风人免疫球蛋白\",\"vaccineCode\":\"4201\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"破伤风球蛋白(冻干)\",\"vaccineEnShort\":\"TIG-fd\",\"vaccineCnFull\":\"冻干破伤风人免疫球蛋白\",\"vaccineCode\":\"4202\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"狂犬病血清\",\"vaccineEnShort\":\"RAS\",\"vaccineCnFull\":\"抗狂犬病血清\",\"vaccineCode\":\"4301\",\"inoculationDesc\":\"12\",\"property\":\"二类\"},{\"vaccineCnShort\":\"狂犬病球蛋白\",\"vaccineEnShort\":\"RIG\",\"vaccineCnFull\":\"狂犬病人免疫球蛋白\",\"vaccineCode\":\"4401\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"狂犬病球蛋白(冻干)\",\"vaccineEnShort\":\"RIG-fd\",\"vaccineCnFull\":\"冻干狂犬病人免疫球蛋白\",\"vaccineCode\":\"4402\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"结核菌素衍生物\",\"vaccineEnShort\":\"TB-PPD\",\"vaccineCnFull\":\"结核菌素纯蛋白衍生物\",\"vaccineCode\":\"4501\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"卡介菌衍生物\",\"vaccineEnShort\":\"BCG-PPD\",\"vaccineCnFull\":\"卡介菌纯蛋白衍生物\",\"vaccineCode\":\"4502\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"锡克毒素\",\"vaccineEnShort\":\"STT\",\"vaccineCnFull\":\"锡克试验毒素\",\"vaccineCode\":\"4601\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"森林脑炎\",\"vaccineEnShort\":\"TBE\",\"vaccineCnFull\":\"森林脑炎疫苗\",\"vaccineCode\":\"4701\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"登革热\",\"vaccineEnShort\":\"DFV\",\"vaccineCnFull\":\"登革热疫苗\",\"vaccineCode\":\"4801\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"无细胞百白破Hib四联苗\",\"vaccineEnShort\":\"DTaP-Hib\",\"vaccineCnFull\":\"b型流感嗜血杆菌（结合）和吸附无细胞百白破联合疫苗\",\"vaccineCode\":\"4901\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"百白破IPV和Hib五联\",\"vaccineEnShort\":\"DTaP-IPV-H\",\"vaccineCnFull\":\"无细胞百白破IPV和Hib五联疫苗\",\"vaccineCode\":\"5001\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"黄热减毒活疫苗\",\"vaccineEnShort\":\"YF\",\"vaccineCnFull\":\"黄热减毒活疫苗\",\"vaccineCode\":\"5101\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"重组戊型肝炎疫苗\",\"vaccineEnShort\":\"HepE\",\"vaccineCnFull\":\"重组戊型肝炎疫苗\",\"vaccineCode\":\"5201\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"AC-Hib联合疫苗\",\"vaccineEnShort\":\"AC-Hib\",\"vaccineCnFull\":\"AC-Hib联合疫苗\",\"vaccineCode\":\"5301\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"EV71(人二倍体)\",\"vaccineEnShort\":\"EV71V-i\",\"vaccineCnFull\":\"肠道病毒71型灭活疫苗(人二倍体细胞)\",\"vaccineCode\":\"5401\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"EV71(Vero细胞)\",\"vaccineEnShort\":\"EV71V-Vero\",\"vaccineCnFull\":\"肠道病毒71型灭活疫苗(Vero细胞)\",\"vaccineCode\":\"5402\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"2价HPV疫苗\",\"vaccineEnShort\":\"HPV2\",\"vaccineCnFull\":\"二价人乳头瘤病毒疫苗\",\"vaccineCode\":\"5501\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"4价HPV疫苗\",\"vaccineEnShort\":\"HPV4\",\"vaccineCnFull\":\"四价人乳头瘤病毒疫苗（酿酒酵母）\",\"vaccineCode\":\"5502\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"9价HPV疫苗\",\"vaccineEnShort\":\"HPV9\",\"vaccineCnFull\":\"九价人乳头瘤病毒疫苗（酿酒酵母）\",\"vaccineCode\":\"5503\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"甲型流感(裂解无佐剂)\",\"vaccineEnShort\":\"FluA/H1N1-sp\",\"vaccineCnFull\":\"甲型H1N1流感疫苗(裂解无佐剂)\",\"vaccineCode\":\"9104\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"甲型流感(裂解有佐剂)\",\"vaccineEnShort\":\"FluA/H1N1-spa\",\"vaccineCnFull\":\"甲型H1N1流感疫苗(裂解有佐剂)\",\"vaccineCode\":\"9105\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"甲型流感(全病毒)\",\"vaccineEnShort\":\"FluA/H1N1-wv\",\"vaccineCnFull\":\"甲型H1N1流感疫苗(全病毒)\",\"vaccineCode\":\"9106\",\"inoculationDesc\":\"9\",\"property\":\"二类\"},{\"vaccineCnShort\":\"七价肺炎\",\"vaccineEnShort\":\"PCV-7\",\"vaccineCnFull\":\"七价肺炎球菌结合疫苗\",\"vaccineCode\":\"9202\",\"inoculationDesc\":\"12\",\"property\":\"二类\"},{\"vaccineCnShort\":\"其他疫苗\",\"vaccineEnShort\":\"OTHER\",\"vaccineCnFull\":\"其他疫苗\",\"vaccineCode\":\"9999\",\"inoculationDesc\":\"99\",\"property\":\"二类\"}]";

    public static void main(String[] args) {

        JSONArray l_objects = JSONArray.parseArray(l);
        List<Map> l_maps = l_objects.toJavaList(Map.class);

        JSONArray m_objects = JSONArray.parseArray(m);
        List<Map> m_maps = m_objects.toJavaList(Map.class);

        /*for (Map lmap : l_maps)
        {
            for (Map mMap : m_maps)
            {
                String vaccineCode = (String)mMap.get("vaccineCode");
                int vaccineBeforTwo = Integer.parseInt(vaccineCode.substring(0, 2));
                if (vaccineBeforTwo == Integer.parseInt(lmap.get("vaccine_code").toString()))
                {
                    String sql = "insert into um_base_vaccine_middle_t(vaccine_code, vaccine_cn_full_name, vaccine_cn_short_name, vaccine_en_full_name, vaccine_en_short_name, vaccine_custom_name, " +
                            "vaccine_category, large_id, inoculation_order_num, description, creation_date, last_updated_date) values (";

                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(sql);
                    stringBuffer.append("'"+ vaccineCode +"',");
                    stringBuffer.append("'"+ mMap.get("vaccineCnFull").toString() +"',");
                    stringBuffer.append("'"+ mMap.get("vaccineCnShort").toString() +"',");
                    stringBuffer.append("'"+ mMap.get("vaccineEnShort").toString() +"',");
                    stringBuffer.append("'"+ mMap.get("vaccineEnShort").toString() +"',");
                    stringBuffer.append("'"+ mMap.get("vaccineCnShort").toString() +"',");
                    stringBuffer.append("'"+ mMap.get("property").toString()+"',");
                    stringBuffer.append(""+ Integer.parseInt(lmap.get("large_id").toString()) +",");
                    stringBuffer.append(""+ Integer.parseInt(mMap.get("inoculationDesc").toString()) +",");
                    stringBuffer.append("'"+ mMap.get("vaccineCnShort").toString() +"',");
                    stringBuffer.append("getdate(),");
                    stringBuffer.append("getdate());");
                    System.out.println(stringBuffer.toString());
                }
            }
        }*/

//        for (Map mMap : m_maps)
//        {
//            String vaccineCode = (String)mMap.get("vaccineCode");
//            int vaccineBeforTwo = Integer.parseInt(vaccineCode.substring(0, 2));
//            if (vaccineBeforTwo == Integer.parseInt(lmap.get("vaccine_code").toString()))
//            {
//
//            }
//        }
    }
}
