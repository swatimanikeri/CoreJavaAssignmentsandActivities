package tester;

import java.util.HashSet;
import java.util.Set;

import com.app.core.Mgr;

import utils.GenericUtils;

public class Test6 {

	public static void main(String[] args) {
		/*
		 * HashSet<Mgr> , LinkedList<SalesMgr> , ArrayList<TempWorker>
		 */
		HashSet<Mgr> mgrs=new HashSet<>(Set.of(new Mgr(1000), new Mgr(2000)));
		GenericUtils.getSumOfSalaries(mgrs);

	}

}
