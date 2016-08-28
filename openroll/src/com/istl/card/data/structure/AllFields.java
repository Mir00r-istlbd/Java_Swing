/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istl.card.data.structure;

import com.istl.card.model.Field;



/**
 *
 * @author User
 */
public interface AllFields 
{
      Field NewNidNo = new Field("NewNid", "@", 10, 10, true);
      Field OldNidNo = new Field("OldNid", "$", 17, 17, false);
      Field NameBangla = new Field("NameBangla", "~", 1, 130, true);
      Field NameEnglish = new Field("NameEnglish", "&", 1, 60, true);
      Field DateBirth = new Field("BirthDate", "#", 1, 10, true);
      Field FathersName = new Field("Father", "`", 1, 130, true);
      Field MothersName = new Field("Mother", "*", 1, 130, true);
      Field BloodGroup = new Field("BloodGroup", "%", 0, 3, false);
      Field DateIssue = new Field("IssueDate", "|", 1, 10, true);
      Field PlaceOfBirth = new Field("Birthplace", "?", 0, 20, false);
      Field Nationality = new Field("Nationality", "!", 1, 3, true);
      Field Gender = new Field("Gender", "^", 1, 1, true);
      Field VoterAt = new Field("VoterAt", ":", 2, 2, true);
      Field VoterAddress = new Field("VoterAdd", "{", 1, 1000, true);
      Field SecuredFingerCode1 = new Field("SecuredFingerCode1", "@", 0, 1, false);
      Field SecuredFingerprint1 = new Field("SecuredFingerprint1", "$", 0, 816, false);
      Field SecuredFingerCode2 = new Field("SecuredFingerCode2", "~", 0, 1, false);
      Field SecuredFingerprint2 = new Field("SecuredFingerprint2", "&", 0, 816, false);
      Field PublicFingerCode1 = new Field("PublicFingerCode1", "@", 0, 1, false);
      Field PublicFingerprint1 = new Field("PublicFingerprint1", "$", 0, 816, false);
      Field PublicFingerCode2 = new Field("PublicFingerCode2", "~", 0, 1, false);
      Field PublicFingerprint2 = new Field("PublicFingerprint2", "&", 0, 816, false);
      Field StaticDataDigitalSignature = new Field("StaticDigitalSign", "@", 128, 128, true);
      Field StaticDataDigitalSignaturePubKeyId = new Field("StaticDSPubKeyId", "@", 1, 7, true);
      Field StaticVerKeyId = new Field("StaticVerKeyId", "$", 1, 7, true);
      Field StaticEncVer = new Field("StaticEncVer", "~", 1, 7, true);
      Field IssueNumber = new Field("IssueNumber", "&", 1, 1, true);
      Field OtherAddress = new Field("OtherAdd", "@", 1, 1000, true);
      Field VoterNumber = new Field("VoterNumber", "$", 1, 15, true);
      Field VoterSerialNumber = new Field("VoterSerial", "~", 1, 15, true);
      Field BirthRegNo = new Field("BirthRegNo", "@", 0, 17, false);
      Field Qualification = new Field("Qualification", "$", 0, 50, false);
      Field Profession = new Field("Profession", "~", 1, 90, true);
      Field Disability = new Field("Disability", "&", 0, 45, false);
      Field VisibleIdentityMark = new Field("VisIdenMark", "#", 0, 180, false);
      Field Religion = new Field("Religion", "`", 0, 30, false);
      Field FathersNid = new Field("FatherNid", "@", 0, 17, false);
      Field MothersNid = new Field("MotherNid", "$", 0, 17, false);
      Field MaritalStatus = new Field("MaritalState", "~", 1, 9, true);
      Field SpouseName = new Field("SpouseName", "&", 0, 130, false);
      Field SpouseNid = new Field("SpouseNid", "#", 0, 17, false);
      Field TinNo = new Field("TIN", "@", 0, 15, false);
      Field DrivingLicenceNo = new Field("DrivingLicense", "$", 0, 15, false);
      Field PassportNo = new Field("Passport", "~", 0, 10, false);
      Field TelephoneNo = new Field("Telephone", "&", 0, 15, false);
      Field MobileNo = new Field("MobileNo", "#", 0, 20, false);
      Field EmailAddress = new Field("EMail", "`", 0, 50, false);
      Field AdditionalFingerCode1 = new Field("AdditionalFingerCode1", "@", 0, 1, false);
      Field AdditionalFingerprint1 = new Field("AdditionalFingerprint1", "$", 0, 816, false);
      Field AdditionalFingerCode2 = new Field("AdditionalFingerCode2", "~", 0, 1, false);
      Field AdditionalFingerprint2 = new Field("AdditionalFingerprint2", "&", 0, 816, false);
      Field AdditionalFingerCode3 = new Field("AdditionalFingerCode3", "#", 0, 1, false);
      Field AdditionalFingerprint3 = new Field("AdditionalFingerprint3", "`", 0, 816, false);
      Field AdditionalFingerCode4 = new Field("AdditionalFingerCode4", "*", 0, 1, false);
      Field AdditionalFingerprint4 = new Field("AdditionalFingerprint4", "%", 0, 816, false);
      Field AdditionalFingerCode5 = new Field("AdditionalFingerCode5", "|", 0, 1, false);
      Field AdditionalFingerprint5 = new Field("AdditionalFingerprint5", "?", 0, 816, false);
      Field AdditionalFingerCode6 = new Field("AdditionalFingerCode6", "!", 0, 1, false);
      Field AdditionalFingerprint6 = new Field("AdditionalFingerprint6", "^", 0, 816, false);
      Field IrisCode1 = new Field("IrisCode1", "@", 0, 4000, false);
      Field Iris1 = new Field("Iris1", "$", 0, 4000, false);
      Field IrisCode2 = new Field("IrisCode2", "~", 0, 4000, false);
      Field Iris2 = new Field("Iris2", "&", 0, 4000, false);
      Field UpdatableDataDigitalSignature = new Field("UpdatableDigitalSign", "@", 1, 128, true);
      Field UpdatableDataDigitalSignaturePubKeyId = new Field("UpdatableDSPubKeyId", "@", 1, 7, true);
      Field UpdatableVerKeyId = new Field("UpdatableVerKeyId", "$", 1, 7, true);
      Field UpdatablePersoKeyId = new Field("UpdatablePersoKeyId", "~", 1, 7, true);
      Field UpdatableEncVer = new Field("UpdatableEncVer", "&", 1, 7, true);
      Field IcaoDg1 = new Field("IcaoDg1", "@", 1, 101, true);
      Field IcaoDg2 = new Field("IcaoDg2", "@", 1, 10455);
      Field IcaoSod = new Field("IcaoSod", "@", 1, 3072, true);
      Field IcaoCom = new Field("IcaoCom", "@", 1, 39, true);
}
