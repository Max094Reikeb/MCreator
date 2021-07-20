/*
 * MCreator (https://mcreator.net/)
 * Copyright (C) 2012-2020, Pylo
 * Copyright (C) 2020-2021, Pylo, opensource contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package net.mcreator.element.types;

import net.mcreator.element.GeneratableElement;
import net.mcreator.element.parts.MItemBlock;
import net.mcreator.element.parts.VillagerTradeEntry;
import net.mcreator.workspace.elements.ModElement;

import java.util.ArrayList;
import java.util.List;

public class VillagerTrade extends GeneratableElement {

	public List<CustomTradeEntry> tradeEntries;

	public VillagerTrade(ModElement element) {
		super(element);
		tradeEntries = new ArrayList<>();
	}

	public static class CustomTradeEntry {

		public VillagerTradeEntry tradeEntry;
		public int level;
		public List<Entry> entries;

		public static class Entry {
			public MItemBlock price1;
			public int countPrice1;
			public MItemBlock price2;
			public int countPrice2;
			public MItemBlock sale1;
			public int countSale1;
			public int maxTrades;
			public int xp;
			public double priceMultiplier;

			public Entry() {
				this.countPrice1 = 1;
				this.countPrice2 = 1;
				this.countSale1 = 1;
				this.maxTrades = 10;
				this.xp = 10;
				this.priceMultiplier = 0.05;
			}
		}
	}
}