package eu.pb4.ansharpatch;

import com.lgmrszd.anshar.ModComponentTypes;
import eu.pb4.polymer.rsm.api.RegistrySyncUtils;
import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnsharPolymerPatch implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("anshar-polymer-patch");

	@Override
	public void onInitialize() {
		RegistrySyncUtils.setServerEntry(Registries.DATA_COMPONENT_TYPE, ModComponentTypes.BEACON_POS);
		/*PolymerResourcePackUtils.addModAssets("anshar");
		PolymerResourcePackUtils.getInstance().creationEvent.register(x -> {
			x.addWriteConverter((path, bytes) -> path.startsWith("/assets/anshar/sounds/tunes") ? null : bytes);
		});
		 */
	}
}