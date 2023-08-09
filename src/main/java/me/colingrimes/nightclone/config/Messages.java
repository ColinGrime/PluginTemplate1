package me.colingrimes.nightclone.config;

import me.colingrimes.midnight.config.annotation.Configuration;
import me.colingrimes.midnight.message.Message;

import static me.colingrimes.midnight.config.option.OptionFactory.message;

@Configuration("messages.yml")
public interface Messages {

    /**************************************************
     *                Success Messages                *
     **************************************************/
    Message<?> TOOL_UPDATED = message("success.tool-updated", "&2&l✓ &aThe tool's command has been updated.");

    /**************************************************
     *                Failure Messages                *
     **************************************************/
    Message<?> INVALID_TOOL = message("failure.invalid-tool", "&4&l❌ &cThe held tool is not a build tool.");

    /**************************************************
     *                  Usage Messages                *
     **************************************************/
    Message<?> TOOLS_USAGE = message("usage.tools",
            "&eUsage: &a/tools <arg1> <arg2> <arg3> <etc>",
            "&a► &7Open up the tools menu or set the tool's command."
    );
}
