package com.grobster.zip;


public class ZipperCleanUpServerFiles {
	public static void main(String[] args) {
		Zipper.zipDirectory("D:\\SAPFeedFiles\\archive\\", "E:\\ArchiveLogs\\uscisidmappp003\\SAPFeedFiles\\", ".csv", 10);
		Zipper.zipDirectory("D:\\Program Files (x86)\\CA\\Identity Manager\\Connector Server\\logs\\SAP_R3\\", "E:\\ArchiveLogs\\uscisidmappp003\\SAP_R3\\", "jcs_conn", 10);
		Zipper.zipDirectory("D:\\Program Files (x86)\\CA\\Identity Manager\\Provisioning Server\\logs\\", "E:\\ArchiveLogs\\uscisidmappp003\\ProvisioningServerLogs\\", ".log", 14);
		Zipper.zipDirectory("D:\\Program Files\\CA\\Directory\\dxserver\\logs\\", "E:\\ArchiveLogs\\uscisidmappp003\\dxserverLogs\\", ".log", 14);
		Zipper.zipDirectory("D:\\Program Files (x86)\\CA\\Identity Manager\\Connector Server\\logs\\", "E:\\ArchiveLogs\\uscisidmappp003\\ConnectorServerLogs\\", "jcs_daily.log.", 14);
		Zipper.zipDirectory("D:\\Program Files (x86)\\CA\\Identity Manager\\Provisioning Server\\logs\\ADS\\", "E:\\ArchiveLogs\\uscisidmappp003\\ADS\\", ".txt", 14);
	}

}