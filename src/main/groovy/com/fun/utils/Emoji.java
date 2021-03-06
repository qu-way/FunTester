package com.fun.utils;

import com.fun.frame.SourceCode;

import java.util.stream.IntStream;

public class Emoji extends SourceCode {
//    public static void main(String[] args) {
//        String aa = "";
//        String aaa = EMPTY;
//        for (int i = 0; i < aa.length(); i += 2) {
//            String abc = aa.substring(i, i + 2);
//            aaa = aaa + "\"" + aa.substring(i, i + 2) + "\",";
//        }
//        output(aaa);
//        aaa = EMPTY;
//        int length = EMOJIS.length;
//        HashSet<String> strings = new HashSet<>(Arrays.asList(EMOJIS));
//        for (String string : strings) {
//            aaa = aaa + "\"" + string + "\",";
//        }
//        output(aaa);
//        output(length, strings.size());
//    }

    /**
     * 随机获取emoji表情数
     *
     * @param size
     * @return
     */
    public static String getEmojis(int size) {
        StringBuffer buffer = new StringBuffer();
        IntStream.range(0, size).forEach(x -> buffer.append(getEmojis()));
        return buffer.toString();
    }

    /**
     * 获取核表情
     *
     * @return
     */
    public static String getEmoji() {
        return EMOJIS[0];
    }

    /**
     * 获取序号符号
     *
     * @param i
     * @return
     */
    public static String getSerialEmoji(int i) {
        if (i < 0 || i > 20) return EMOJIS[0];
        return SERIAL[i];
    }

    /**
     * 随机获取emoji表情
     *
     * @return
     */
    public static String getEmojis() {
        return EMOJIS[getRandomInt(EMOJIS.length - 1)];
    }


    public static final String[] SERIAL = {"⓪", "①", "②", "③", "④", "⑤", "⑥", "⑦", "⑧", "⑨", "⑩", "⑪", "⑫", "⑬", "⑭", "⑮", "⑯", "⑰", "⑱", "⑲", "⑳"};

    /**
     * emoji表情
     */
    public static final String[] EMOJIS = {"☢", "💸", "💷", "💶", "💵", "💼", "💻", "💰", "💮", "💴", "💳", "💨", "💧", "💦", "💪", "💡", "📘", "📗", "📖", "📕", "📜", "📚", "📙", "📐", "📏", "📎", "📍", "📔", "📓", "📑", "📈", "📇", "📆", "📅", "📌", "📋", "📊", "📉", "📀", "💿", "💾", "💽", "📄", "📃", "📂", "📁", "📷", "📼", "📻", "📺", "📹", "📰", "📯", "📮", "📭", "📲", "📱", "📨", "📧", "📦", "📥", "📬", "📫", "📪", "📩", "📠", "📟", "📞", "📝", "📤", "📡", "🔗", "🔖", "🔐", "🔏", "🔎", "🔍", "🔓", "🔒", "🔑", "🔌", "🔋", "🔮", "🔭", "🔨", "🔧", "🔦", "🔥", "🔬", "🔫", "🔪", "🔩", "🦋", "😘", "😗", "😖", "😕", "😜", "😛", "😚", "😙", "😐", "😏", "😎", "😍", "😔", "😓", "😒", "😑", "😇", "😆", "😅", "😌", "😋", "😊", "😉", "😀", "😄", "😃", "😂", "😁", "😸", "😷", "😶", "😵", "😼", "😻", "😺", "😹", "😰", "😯", "😮", "😭", "😴", "😳", "😲", "😱", "😨", "😧", "😦", "😥", "😬", "😫", "😪", "😠", "😟", "😞", "😝", "😤", "😣", "😢", "😡", "🙏", "🙎", "🙍", "🙈", "🙇", "🙆", "🙅", "🙌", "🙋", "🙊", "🙉", "🙀", "😿", "😾", "😽", "🚘", "🚗", "🚖", "🚕", "🚜", "🚛", "🚚", "✏✒", "🚐", "🚏", "🚎", "🚍", "🚔", "🚓", "🚒", "🚑", "🚈", "🚌", "🚋", "🚊", "🚉", "☀", "☁", "🚶", "🚵", "🚴", "🚲", "☎", "🚨", "🚥", "🚬", "☔", "☕", "🚪", "🚩", "🚞", "🚝", "🚣", "🛀", "🚿", "🚽", "🛁", "🌗", "🌖", "🌕", "🌔", "🌛", "🌚", "🌙", "🌘", "♈", "🌏", "♉", "🌎", "♊", "🌍", "♋", "♌", "🌓", "♍", "🌒", "♎", "🌑", "♏", "🌐", "♐", "♑", "♒", "♓", "🌊", "🌂", "🌷", "🌵", "🌴", "🌻", "🌺", "🌹", "🌸", "🌳", "🌲", "🌱", "🌰", "🌟", "🌞", "🌝", "🌜", "🌠", "🍗", "🍖", "🍕", "🍔", "🍛", "🍚", "🍙", "🍘", "🍏", "🍎", "🍍", "🍌", "🍓", "🍒", "🍑", "🍐", "🍇", "🍆", "🍅", "🍄", "🍋", "🍊", "🍉", "🍈", "🌿", "🌾", "🌽", "🌼", "🍃", "🍂", "🍁", "🍀", "🍷", "🍶", "⚡", "🍵", "🍴", "🍻", "🍺", "🍹", "🍸", "🍯", "🍮", "🍭", "🍬", "🍳", "🍲", "🍱", "🍰", "🍧", "🍦", "🍥", "🍤", "🍫", "🍪", "🍩", "🍨", "🍟", "🍞", "🍝", "🍜", "🍣", "🍢", "⚽", "🍡", "⚾", "🍠", "⛅", "🎏", "🎎", "🎌", "🎓", "🎒", "⛎", "🎐", "🎅", "🎊", "🎉", "🎈", "🍼", "🎂", "🎁", "🎀", "🎷", "🎻", "🎺", "🎸", "🎯", "🎮", "🎭", "🎬", "🎳", "🎲", "🎱", "🎰", "🎥", "🎫", "🎪", "🎩", "🎨", "🎣", "✂", "✉", "✊", "✋", "✌", "🏇", "🏆", "🏄", "🏊", "🏉", "🏈", "🎿", "🎾", "🎽", "⌚", "⌛", "🏃", "🏂", "🏀", "🏮", "❄", "⭐", "🐘", "🐗", "🐖", "🐕", "🐜", "🐛", "🐚", "🐙", "🐐", "🐏", "🐎", "🐍", "🐔", "🐓", "🐒", "🐑", "🐈", "🐇", "🐆", "🐅", "🐌", "🐋", "🐊", "🐉", "🐀", "🐄", "🐃", "🐂", "🐁", "🐸", "🐷", "🐶", "🐵", "🐼", "🐻", "🐺", "🐹", "🐰", "🐯", "🐮", "🐭", "🐴", "🐳", "🐲", "🐱", "🐨", "🐧", "🐦", "🐥", "🐬", "🐫", "🐪", "🐩", "🐠", "🐟", "🐞", "🐝", "🐤", "🐣", "🐢", "🐡", "👘", "👗", "👖", "👕", "👜", "👛", "👚", "👙", "👐", "👏", "👎", "👍", "👔", "👓", "👒", "👑", "👈", "👇", "👆", "👅", "👌", "👋", "👊", "👉", "👀", "🐾", "🐽", "👄", "👃", "👂", "👸", "👷", "👶", "👵", "👼", "👰", "👯", "👮", "👭", "👴", "👳", "👲", "👱", "👨", "👧", "👦", "👥", "👬", "👫", "👪", "👩", "👠", "👟", "👞", "👝", "👤", "👣", "👢", "👡", "💐", "💏", "💎", "💍", "💑", "⏰", "💈", "💇", "💆", "💅", "⏳", "💌", "💋", "💊", "💉", "💄", "💃", "💂", "💁"};
}
