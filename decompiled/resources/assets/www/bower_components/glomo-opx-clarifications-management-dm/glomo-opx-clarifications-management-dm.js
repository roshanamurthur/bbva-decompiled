/*global moment*/
class GlomoOpxClarificationsManagementDm extends Polymer.mixinBehaviors([
  CellsBehaviors.CellsGlomoUtilsBehavior,
  CellsBehaviors.i18nBehavior,
  CellsBehaviors.CellsGlomoDmBehavior,
  CellsBehaviors.StepManagerBehavior
], Polymer.Element) {

  static get is() {
    return 'glomo-opx-clarifications-management-dm';
  }

  static get properties() {
    return {
      /**
       * @desc Array of radio buttons to first step
      */
      instructions: {
        type: Array,
        notify: true,
        value: () => ([])
      },
      /**
       * @desc Array of radio buttons to second step
      */
      electionRadioButton: {
        type: Array,
        notify: true,
        value: () => ([])
      },
      /**
       * @desc Go step two
      */
      currentStepInstructions: {
        type: Number,
        value: 2
      },
      /**
       * @desc Go step three
      */
      blockCardStep: {
        type: Number,
        value: 4
      },
      /**
       * @desc Go step three
      */
      blockChargeStep: {
        type: Number,
        value: 4
      },
      /**
       * @desc Go step three
      */
      currentStepClarificationsType: {
        type: Number,
        value: 3
      },
      /**
       * @desc Selected type of aclaration
      */
      radioButtonSelected: String,
      /**
       * @desc Selected type of phone number
      */
      radioButtonBbvaPhoneNumber: String,
      /**
       * @desc Selected type of atention
      */
      radioButtonSummaryTitle: String,
      /**
       * @desc Show description text of type of aclaration
      */
      bbvaPhoneTextInLine: String,
      /**
       * @desc Show text of request service
      */
      bbvaPhoneTextClaimLinePhone: String,
      /**
       * @desc Show description of second step
      */
      secondStepDescription: {
        type: Boolean,
        value: true
      },
      /**
       * @desc Show step three
      */
      flagStepView: {
        type: Boolean,
        value: false
      },
      /**
       * @desc Indicates if movement is domiciliation
      */
      isDomiciliation: {
        type: Boolean,
        value: false
      },
      /**
       * @desc Indicates if movement is Transit
      */
      isTransit: {
        type: Boolean,
        value: false
      },
      /**
       * @desc Indicates whether it is a case of card Theft or Loss and an in Against transaction
      */
      isTheftLossAgainst: {
        type: Boolean,
        value: false
      },
      /**
       * @desc Class to second step
      */
      classNameSecondStep: String,
      /**
       * @desc Show icon help in the summary view
      */
      iconHelpClarification: {
        type: Boolean,
        value: false,
        observer: '_sendIconHelp'
      },
      /**
       * @desc Cache storage to obtain customer detail
      */
      globalCacheStorage: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Object with info of the transaction detail
      */
      transactionClaim: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Obtain the bbvaPhoneNumber that the customer should be call
      */
      bbvaPhoneNumber: {
        type: Object,
        value: () => ({}),
        notify: true
      },
      /**
       * @desc Show message out of hours
      */
      bbvaAttentionOutOfHours: String,
      /**
       * @desc Show box in the payment succes screen
      */
      infoSuccessScreen: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Contain and cut the date and time of the transaction detail and show in the flow
      */
      dateAndTime: String,
      /**
       * @desc Contain and cut the date and time of the transaction detail and send from the service
      */
      datePostService: String,
      /**
       * @desc Contain the response of the post success data
      */
      responsePostSuccessData: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Contain the response of the patch success data
      */
      responsePatchSuccessData: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Cut the minus in the amount when the claim is in accounts and send to the service post
      */
      returnAmountService: String,
      /**
       * @desc Cut the minus in the amount when the claim is in accounts and put the minus in the amount when is card from show in the flow
      */
      returnAmountOffer: String,
      /**
       * @desc Obtain the debit card from the cache storage
      */
      debitCardNumber: {
        type: Array,
        value: () => ([])
      },
      /**
       * @desc Cut the reasonId from the service "01" to "1"
      */
      reasonId: String,
      /**
       * @desc Obtain the credit card from the cache storage
      */
      creditCardNumber: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Obtain the client id from the cache storage
      */
      clientId: String,
      /**
       * @desc Receive the encrypted email
      */
      userEmail: String,
      /**
       * @desc Obtain the segment user from the cache storage
      */
      segmentUser: String,
      /**
       * @desc Obtain the format from show in the success screen of clarification
      */
      dateFromSuccess: String,
      /**
       * @desc Put in the modals which clarifications is
      */
      clarificationType: String,
      /**
       * @desc Response error from the post service
      */
      errorResponsePost: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Response error from the patch service
      */
      errorResponsePatch: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Obtain the page name
      */
      pageName: String,
      /**
       * @desc Get the flag from the client id when doesn't exist in the global cache storage
      */
      flagClientId: {
        type: Boolean,
        value: false
      },
      /**
       * @desc Save the error count from the modal of information not available
      */
      errorCount: {
        type: Number,
        value: 0
      },
      /**
       * @desc Get the claims numbers from the app
      */
      bbvaPhonesClaimsNumbers: {
        type: Array,
        value: () => ([])
      },
      /**
       * @desc Get all the segments user from the app
      */
      segmentsByUser: {
        type: Array,
        value: () => ([])
      },
      /**
       * @desc Flag from send modals
      */
      modalFlag: {
        type: Boolean,
        value: false
      },
      /**
       * @desc Flag to know if any of any trigger for app-started was fired @type {Boolean}
      */
      appStartedFired: {
        type: Boolean,
        value: false
      },
      /**
       * @desc object sent every time an analytic event is fired @type {Object}
      */
      careAnalytics: {
        type: Object,
        value: {
          step: ''
        }
      },
      /**
       * @desc Flag to know if modal for theft loss was showed @type {Boolean}
      */
      flagModalTheftLoss: {
        type: Boolean,
        value: false
      },
      /**
       * @desc object to set when the radio button change @type {Object}
      */
      ANALYTICS_CONSTANTS: {
        type: Object,
        value: {
          NO_AUTORIZED: 'no autorice este cargo',
          CARD_LOST: 'me robaron mi tarjeta',
          CARD_STOLEN: 'perdí mi tarjeta',
          PROBLEM_COMMERCE: 'tuve un problema con el comercio',
          CONTINUE: 'continuar',
          REQUEST_PAYMENT: 'solicitar devolucion',
          START_ACLARATION: 'solicitar aclaracion',
          IMMEDIATE_PAYMENT: 'abono inmediato',
          RECURRENT_PAYMENT: 'abono inmediato y cargo recurrente',
          BLOCKCARD: 'abono inmediato y bloqueo de plastico',
          RECURRENT_AND_CARD: 'abono inmediato y bloqueo de plastico y cargo recurrente',
          DETAIL_CARD: 'detalle de tarjeta',
          DETAIL_ACCOUNT: 'detalle de cuenta',
          CARDS: 'tarjetas',
          ACCOUNTS: 'cuentas',
          CREDIT_CARDS: 'tarjetas credito',
          ACCOUNTS_SUB: ' ',
          DETAIL_TAG: 'detalle',
          MOVEMENTS: 'movimientos',
          CREDIT_TAG: 'credito',
          CREDIT_GOLD: 'tarjeta oro',
          ACCOUNT_BASIC: 'libreton basico',
          AGAINST_MOVEMENT: 'contra en linea',
          ERROR_LOAD_TICKET: 'error carga de recibo',
          RECURRENT_PAYMENT_BLOCK: 'bloqueo de cargos recurrentes',
          BLOCK_CARDS: 'bloqueo de tarjetas',
          REPORTING_REASON: '1 motivo de reporte',
          ATTENTION_TYPE: '2 tipo de atencion',
          PROVISIONAL_REFUND: 'abono provisional',
          FCR: 'abono',
          APROVED: 'aprobado',
          REVIEW: 'en revision'
        },
      },
      /**
       * @desc Get the radio name when the first step change
      */
      typology: String,
      /**
       * @desc Get type product
      */
      cardsOrAccountsTag: String,
      /**
       * @desc Get subType product
      */
      subTypeTag: String,
      /**
       * @desc Set type of product
      */
      stepTag: String,
      /**
       * @desc Set detail to level2 to analytics
      */
      detailTag: String,
      /**
       * @desc Set detail to level3 to analytics
      */
      movementsTag: String,
      /**
       * @desc Set detail to level4 to analytics
      */
      levelFour: String,
      /**
       * @desc Get productName to analytics
      */
      productNameTag: String,
      /**
       * @desc Get the blockType.id from the validate service
      */
      blockServicesFlag: String,
      /**
       * @desc Get the success from the service block card
      */
      successBlockCard: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Get the success from the service block payment
      */
      successBlockPaymentData: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Get the success from the service block domi
      */
      successBlockDomiData: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Get the error from the service block card
      */
      errorBlockCard: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Get the error from the service block payment
      */
      errorBlockPayment: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Get the error from the service deactivate direct debit
      */
      _errorBlockDirectDebit: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Get the error from the service get direct debit
      */
      _errorGetDirectDebit: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Payload for deactivate direct debit service
      */
      _payloadBlockDirectDebit: {
        type: Object,
        value: () => ({
          'status': {
            'id': 'DEACTIVATED'
          },
          'additionalInformations': [
            {
              'id': 'producto',
              'value': 'DOMICILIACION'
            },
            {
              'id': 'subproducto',
              'value': 'DOMICILIACION_BAJA'
            }
          ]
        })
      },
      /**
       * @desc Show info in the success screen
      */
      additionalInfo: {
        type: Array,
        value: () => ([])
      },
      /**
       * @desc Show type clarification in the modal "ERROR EN VALIDACIÓN"
      */
      buttonDetail: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Flag to validate fire petition post
      */
      errorPostPetition: {
        type: Boolean,
        value: false
      },
      /**
       * @desc Flag to validate fire petition block card service
      */
      fireBlockCardServiceFlag: {
        type: Boolean,
        value: false
      },
      /**
       * @desc List conditions of block card step
      */
      listBlockInfo: {
        type: Array,
        value: () => ([])
      },
      /**
       * @desc Fire the flag from recurring payment
      */
      fireBlockRecurringPaymentFlag: {
        type: Boolean,
        value: false
      },
      /**
       * @desc Send card to success screen
      */
      sendCardToSuccess: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Send message secondary from the success screen
      */
      sendMessageSecondary: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Change the title in the modal of case against online
       */
      titleCaseOnline: String,
      /**
       * @desc Identifier to know which modal appears of case against online
       */
      identifierModals: String,
      /**
       * @desc Clarifications Product Type
       */
      productType: String,
      financialData: {
        type: Object,
        value: () => ({})
      },
      globalFinancialData: {
        type: Object,
        value: () => ({})
      },
      customerId: String,
      clarificationsList: {
        type: String,
        value: ''
      },
      /**
       * @desc Validation of existing content in the flow
      */
      existingContent: {
        type: Boolean,
        value: false
      },
      /**
       * @desc Object for management of text between transit and domiciliation
       */
      centralizedTextsSuccess: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Flag to indicate if necesary return one step
       */
      flagBackStepAtModals: {
        type: Boolean,
        value: false
      },
      /**
       * @desc Flag to indicate if summary has been showed
       */
      _summaryExecute: {
        type: Boolean,
        value: false
      },
      /**
       * @desc Flag to indicate if clarification has provisional payment
       */
      _applyProvisionalPayment: {
        type: Boolean,
        value: false
      },
      /**
       * @desc Flag to indicate if card (credit o debit) is previously blocked
       */
      _previouslyBlockedCard: {
        type: Boolean,
        value: false
      },
      /**
      * Signature types to parse
      * @type {Object}
      */
      signatureTypes: {
        type: Object,
        value: () => ({
          '33': 'otp',
        })
      },
      /**
      * @desc account feature flags
      * @type {Object}
      */
      featureFlagCollection: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Reason ID for problem with commerce radio button
       */
      reasonIdProblemCommerce: {
        type: String,
        value: '3'
      },
      /**
       * @desc Flag for indicate if share ticket data template us already setted
       */
      templateSetted: {
        type: Boolean,
        value: false
      },
      /**
        * An object that stores contact-related data.
        * @type {Object}
        */
      contactsObject: {
        type: Object,
        value: () => ({})
      },
      /**
       * An object that stores the icon caution
       */
      imageIconCaution: {
        type: String,
        value: './images/icon_caution.svg'
      },
      /**
       * Store the phone bbva numbers used
       * @type {Object}
       */
      phoneNumbers: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Number of days to estimate the resolution date
      */
      _resolutionDateEstimatedDays: {
        type: Number,
        value: 36
      },
      /**
       * @desc Number of days to estimate the resolution date for direct debits
      */
      _resolutionDateEstimatedDaysDirectDebits: {
        type: Number,
        value: 7
      },
      /**
       * @desc Date format for resolution date
       */
      _resolutionDateFormat: {
        type: String,
        value: 'DD MMMM YYYY'
      },
      /**
        * @desc Internal code for domiciliation movement
        * @type {String}
       */
      domiciliationInternalCode: {
        type: String,
        value: '948'
      },
      /**
        * @desc Flag for indicate if a domiciliation movement has no debit card
        * @type {String}
       */
      _domiciliationWithoutCard: {
        type: Boolean,
        value: false
      },
      /**
        * @desc Store the account of the domiciliation movement
        * @type {String}
       */
      _domiciliationAccount: {
        type: Object,
        value: () => ({})
      },
      /**
        * @desc Code for update when response has no folio
        * @type {String}
       */
      _noUpdateFolio: {
        type: String,
        value: '0000000000'
      },
      /**
       * @desc Flag to indicate if the user has a previous claim for direct debit
       * @type {String}
       */
      _previousClaimDirectDebitText: {
        type: String,
        value: 'ERROR EN VALIDACIÓN: FOLIO YA EXISTE'
      },
      /**
       * @desc Flag to indicate if the user has a previous claim for direct debit
       * @type {Boolean}
       */
      _previousClaimDirectDebitFlag: {
        type: Boolean,
        value: false
      },
      /**
       * @desc An object that stores the availability hours for direct debit claims
       * @type {Object}
       */
      directDebitClaimsAvailableHours: {
        type: Object,
        value: {
          bottom: '08:00',
          top: '22:00',
          available: true
        }
      },
      /**
       * @desc Code for server error response
       * @type {Number}
       */
      responseServerErrorCode: {
        type: Number,
        value: 500
      },
      /**
       * @desc Store validate automatic refund response codes of block types that are used for show or hide the blocking product steps
       * @type {Object}
       * 01: Block card
       * 02: Block recurrent payment
       * 04: Block card and recurrent payment
       * 10: No block
       * 08: Block of direct debit payment
       */
      responseValidateBlockTypes: {
        type: Object,
        value: {
          allBlockTypes: ['01', '02', '04', '10', '08'],
          blockRecurrentPayment: ['02', '08'],
          blockRecurrentPaymentAndCard: ['02', '04', '08'],
          statusNameOptionsIds: ['1', '2', '03', '4']
        }
      },
      /**
       * @desc Object for store all the texts used by validations for productType selected
       * @type {Object}
      */
      productTypeTexts: {
        type: Object,
        value: {
          accounts: 'ACCOUNTS',
          cards: 'CARDS',
          cardsValid: 'VIGENTE'
        }
      },
      /**
       * @desc Object for store all the texts used by validations for reporting reasons type
       * @type {Object}
      */
      reportingReasonTexts: {
        type: Object,
        value: {
          noAuth: '01',
          stolen: '02',
          commerceProblems: '03',
        }
      },
      /**
       * @desc Object for store all the texts used for validation along the main flow
       * @type {Object}
      */
      validationsClaimsServiceResponseTexts: {
        type: Object,
        value: {
          validationAlreadyClarification: 'FOLIO YA EXISTE',
          validationInsurance: 'Seguros Bancomer',
          validationCommerceProblems: 'problemas',
          transactionTypeIdDirectDebit: 'AUTOMATIC_DEBIT'
        }
      },
      /**
       * @desc Object for store all segments data used in the flow
       * @type {Object}
      */
      contactDataDefault: {
        type: Object,
        value: () => ({})
      }
    };
  }

  ready() {
    super.ready();
  }

  /**
  * @desc Initialize clarification detail start
  */
  init() {
    this.contactDataDefault = {
      bbvaPhonesClaimsNumbers: {
        segmentA: {
          phoneNumber: '5588521495,0103'
        },
        segmentB: {
          phoneNumber: '5552262685,0403'
        },
        segmentC: {
          phoneNumber: '5552262685,0303'
        },
        segmentD: {
          phoneNumber: '5552262685,0203'
        },
        segmentDefault: {
          phoneNumber: '5552262685,0403'
        }
      },
      phoneNumberBbvaLineClarifications: '5552262685,0403',
      phoneNumberSAC: '5511020000'
    };
    this._validateDataContact(this.contactDataDefault);
    this._requestClientId();
    this._checkTypeOfTransaction();
    this._setGlobalTexts();
    this._setTextsSteps();
    this._requestChangeDenomitationFlag();
    this._getUserSegment();
    this.set('productType', this.get('productType', this.transactionClaim));
    this._fireGenericDispatchEvent('hidden-components', true);
    this.reset();
    this.lastActiveStep = null;
    this.canExecute = false;
    this.hasFinished = false;
    this._lastResponse = null;
    this.currentStep = 1;
    this.onAnyStepCollapsedChanged();
    this.setDataRadioButtons();
    this.setDataStepRadioButtons();
    this._setDescriptionSecondStepCARE();
    this.dataEstablishmentName();
    this.dataDateTransaction();
    this.dataReturnAmount();
    this.getCardOrAccountData();
    this.set('appStartedFired', false);
    this._fireClickStartAnalytics();
    this._fireAppVisitAnalytics();
    this._scrollBottom(undefined, undefined, true);
  }

  /**
   * @desc Set and validate contacts phone numbers used in the flow
   * @param {object} appSettings Store all app settings application content
   */
  setAppSettingsParams(appSettings = {}) {
    const validationObject = Object.entries(this.contactsObject).length > 0;
    if (validationObject) {
      this._validateDataContact(this.contactsObject);
      return;
    }
    this.contactsObject = { ...appSettings?.contact };
    this._validateDataContact(this.contactsObject);
  }

  /**
   * @desc Set the phone numbers used in the flow
   * @param {object} contact Contains phone numbers defined in the app-settings
   */
  _validateDataContact(contact) {
    const bbvaPhonesClaimsNumbersList = contact?.bbvaPhonesClaimsNumbers || '';
    this.bbvaPhonesClaimsNumbers = bbvaPhonesClaimsNumbersList;
    const lineCompleteNumber = (contact?.phoneNumberBbvaLineClarifications || '');
    const insuranceCompleteNumber = contact?.phoneNumberSAC || '';
    this.phoneNumbers = {
      lineCompleteNumber,
      lineParsedNumber: this.normalizePhoneNumber(lineCompleteNumber),
      insuranceCompleteNumber,
      insuranceParsedNumber: this.normalizePhoneNumber(lineCompleteNumber),
    };
  }

  /**
   * @desc Give format to amorphic phone numbers that come from app-settings
   * @param {string} amorphicPhone Contains the string that is going to be used to give the format
   */
  normalizePhoneNumber(amorphicPhone = '') {
    const splitPhonePhoneRegex = /(?=(?:....)*$)/;
    const phoneNumber = amorphicPhone.split(',');

    return phoneNumber[0].split(splitPhonePhoneRegex).join(' ');
  }

  /**
   * @desc Define the template object usend by share receipt component
   */
  _setTicketsTemplates({customerConfirmation}) {
    const theftLossSection = this.isTheftLossAgainst ? [] : [
      {
        title: this.t('clarifications-management-success-page-share-receipt-title-movement-amount'),
        resultPath: 'templateData.amountWithMinus'
      }
    ];

    const clarificationsBlockCardAgainst = {
      title: this.t('clarifications-management-success-page-share-receipt-header'),
      sections: [
        {
          title: this.t('clarifications-management-success-page-share-receipt-title-general-section'),
          fields: [
            {
              title: this.t('clarifications-management-success-page-share-receipt-title-operation-type'),
              resultPath: 'templateData.operationType',
            },
            {
              title: this.t('clarifications-management-success-page-share-receipt-title-report-motive'),
              resultPath: 'templateData.motive',
            },
            ... this._getExtraFirstSectionData(customerConfirmation)
          ]
        },
        {
          title: this.t('clarifications-management-success-page-share-receipt-title-movement-section'),
          fields: [
            {
              title: this._getTextObject().shareReceipt?.secondSection?.movementNameText,
              resultPath: (customerConfirmation) ? 'templateData.paymentMovementName' : 'templateData.clarificationMovementName'
            },
            {
              title: this.responsePostSuccessData?.operations[0]?.subproductRefund?.id,
              resultPath: 'templateData.contractNumber'
            },
            ... theftLossSection
          ]
        },
        ... this._getBlockCardPaymentSection()
      ]
    };

    if (!this.templateSetted) {
      this.templateSetted = true;
      this._fireGenericDispatchEvent('add-dynamic-template', { clarificationsBlockCardAgainst });
    }
  }


  /**
   * @desc Build additional section for share success tickets template
   */
  _getExtraFirstSectionData(customerConfirmation) {
    const extraData = [];
    if (customerConfirmation) {
      extraData.push({
        title: this._getTextObject().shareReceipt?.firstSection?.paymentText,
        resultPath: 'templateData.amount',
      });
    } else {
      if (this._applyProvisionalPayment) {
        extraData.push({
          title: this._getTextObject().shareReceipt?.firstSection?.provisionalPaymentText,
          resultPath: 'templateData.amount',
        });
      }
      extraData.push({
        title: this.t('clarifications-management-success-page-share-receipt-title-clarification-invoice'),
        resultPath: 'templateData.clarificationInvoice',
      });
    }
    return extraData;
  }

  /**
   * @desc Build block card and payment section for share success tickets template
   * @returns Data for block card and payment section in share success receipts
   */
  _getBlockCardPaymentSection() {
    let extraData = [];
    if ((this.responseValidateBlockTypes.blockRecurrentPaymentAndCard).includes(this.blockServicesFlag)) {
      extraData.push(
        {
          title: this.t(`clarifications-management-success-page-share-receipt-title-block-${ this.isDomiciliation ? 'direct' : 'payment' }`),
          fields: [
            {
              title: this.t('clarifications-management-success-page-share-receipt-title-trade-name'),
              resultPath: 'templateData.paymentMovementName'
            }
          ]
        }
      );
    }
    if (!this._previouslyBlockedCard && !this.isDomiciliation) {
      extraData.push(
        {
          title: this.t('clarifications-management-success-page-share-receipt-title-block-card'),
          fields: [
            {
              title: this.t('clarifications-management-success-page-block-card-case-number'),
              resultPath: 'templateData.cardBlockedInvoice'
            },
            {
              title: this.responsePostSuccessData?.operations[0]?.subproductRefund?.id,
              resultPath: 'templateData.contractNumber'
            },
            {
              title: this.t('clarifications-management-success-page-block-card-date-and-hour'),
              resultPath: 'templateData.date',
            }
          ]
        }
      );
    }
    return extraData;
  }

  /**
   * @desc Add fields to object template used by share receipt component
   * @param {object} originalObject Object that contains data for build the success
   * @param {string} customerConfirmation Flag to indicate type of success
   * @returns Object that contains data for build success and keys for share receipt template
   */
  _addFieldsToSuccessObject(originalObject, customerConfirmation) {
    const { additionalInfo, chargeAmount } = originalObject;
    const contractNumber = (() => {
      if (this.responsePatchSuccessData?.operations) {
        const contract = this.responsePatchSuccessData?.operations?.[0]?.claimReason?.contract;
        const { id, number } = contract || {};
        const rawContractNumber = this._domiciliationAccount ? id : number;
        return `•${rawContractNumber?.substr(rawContractNumber?.length - 4)}`;
      }
    })();
    const titleAmount = (() => {
      if (chargeAmount !== undefined) {
        const { amount, currency } = chargeAmount;
        return `${currency}${amount}`;
      }
    })();
    const keys = [
      'clarifications-management-success-page-block-card-date-and-hour',
      'clarifications-management-success-modal-reason-clarification',
      'clarifications-management-success-page-block-card-case-number',
      'clarifications-management-success-page-top-info-text',
      'clarifications-management-success-modal-case-number',
      `clarifications-management-success-modal-amount${this.isDomiciliation ? '-init' : ''}`
    ];
    const templateData = keys.reduce((acc, key) => {
      const item = additionalInfo.find(data => data?.key === key);
      acc[key] = item?.value;
      return acc;
    }, {});
    templateData.date = templateData['clarifications-management-success-page-block-card-date-and-hour'];
    templateData.motive = templateData['clarifications-management-success-modal-reason-clarification'];
    templateData.cardBlockedInvoice = templateData['clarifications-management-success-page-block-card-case-number'];
    templateData.paymentMovementName = templateData['clarifications-management-success-page-top-info-text'];
    templateData.clarificationMovementName = templateData['clarifications-management-success-page-top-info-text'];
    templateData.clarificationInvoice = templateData['clarifications-management-success-modal-case-number'];
    templateData.clarificationAmount = templateData[`clarifications-management-success-modal-amount${this.isDomiciliation ? '-init' : ''}`];
    templateData.paymentAmount = titleAmount;
    templateData.contractNumber = contractNumber;
    templateData.amount = (customerConfirmation  || (chargeAmount !== undefined)) ? titleAmount : templateData[`clarifications-management-success-modal-amount${this.isDomiciliation ? '-init' : ''}`];
    templateData.amountWithMinus = [(templateData.amount)?.slice(0, 1), '-', (templateData.amount)?.slice(1)].join('');
    originalObject.templateData = templateData;
    return originalObject;
  }

  /**
   * @desc Method to obtain the client id when clientId is not full
   */
  _requestClientId() {
    if (!this.clientId) {
      this._fireGenericDispatchEvent('global-get-from-storage', { key: 'loginData', secure: true });
    }
  }

  /**
   * @desc Method to obtain the client id
   */
  obtainIdClient(data) {
    this.clientId = data?.grantingTicketUserId;
  }

  /**
   * @desc Manage navigation between success to card detail
   */
  navigationtToCardDetail() {
    const payload = {
      productId: this.transactionClaim?.productId,
      transactionId: this.transactionClaim?.transactionId,
    };
    this._fireGenericDispatchEvent('navigate-to-card-transaction-detail', payload);
  }

  /**
   * @desc Manage navigation to card detail (movement list)
   */
  navigateToCardDetail() {
    this._fireGenericDispatchEvent('navigate-to-card-detail', {
      pageToNavigate: this.isDomiciliation ? 'account' : 'cardDetail',
      productId: this.isDomiciliation ? this.transactionClaim.accountId : this.transactionClaim.productId,
    });
  }

  /**
   * @desc Validate movement´s type for text setting in domiciliation and transit
   */
  _checkTypeOfTransaction() {
    this.isTransit = (this.transactionClaim?.status === 'PENDING');
    this.isDomiciliation = (this.transactionClaim?.internalCode === this.domiciliationInternalCode);
  }

  /**
   * @desc Get prefix string for type of movement
   */
  _getPrefixForTextsObjects() {
    return  (this.isTransit) ? 'pending' :
      (this.isDomiciliation) ? 'domis' :
        'normal';
  }

  /**
   * @desc Setting of global texts depending of type of movement
   */
  _setGlobalTexts() {
    this.centralizedTextsSuccess = {
      'texts-pending': {
        title: this.t('clarifications-management-successful-request'),
        amountLabel: this.t('clarifications-management-success-page-share-receipt-title-payment-pending-for'),
        key: this.t('clarifications-management-success-page-share-receipt-title-movement-name-pending'),
        messageText: this.t('clarifications-management-success-digital-message-secondary-pending'),
        firstStep: {
          title: this.t('clarifications-management-first-step-title-pending'),
          radios: [
            {
              radio: this.t('clarifications-management-first-radio-button'),
              description: this.t('clarifications-management-first-description')
            },
            {
              radio: this.t('clarifications-management-second-radio-button'),
              description: this.t('clarifications-management-second-description')
            },
            {
              radio: this.t('clarifications-management-four-radio-button'),
              description: this.t('clarifications-management-second-description')
            },
            {
              radio: this.t('clarifications-management-third-radio-button'),
              description: this.t('clarifications-management-third-description')
            }
          ],
          infoBox: () => {
            return { description: this.t('clarifications-management-geolocation-info-box') };
          }
        },
        secondStep: {
          description: this.t('clarifications-management-step-description-pending'),
          radios: [
            {
              radio: this.t('clarifications-management-second-step-first-radio-button-pending'),
              description: this.t('clarifications-management-second-step-first-description-pending')
            },
            {
              radio: this.t('clarifications-management-second-step-second-radio-button-pending'),
              description: this.t('clarifications-management-second-step-second-description-pending')
            }
          ],
          noRadios: {
            description: this.t('clarifications-management-second-step-second-description')
          },
          infoBox: this.t('clarifications-management-step-block-payment-info-box')
        },
        blockPaymentStep: {
          title: this.t('clarifications-management-block-payment-step'),
          description: this.t('clarifications-management-block-payment-description'),
          infoBox: () => {
            return {description: this.t('clarifications-management-third-step-info-box')};
          },
          collapsedLabel: this.t('clarifications-management-block-payment-description-collapsed')
        },
        summaryView: {
          payment: this.t('clarifications-management-button-summary-title-payment'),
          clarification: this.t('clarifications-management-button-summary-title-clarification')
        },
        successScreen: {
          account: () => this.responsePostSuccessData?.operations[0]?.subproductRefund?.id,
          infoBox: {
            content: () => ((this.radioButtonSelected === 'true') ? this.t('clarifications-management-success-digital-message-secondary-pending') : this.t('clarifications-management-success-page-value-experience-pending-clarify'))
          },
          buttons: {
            primary: () => this.t('clarifications-management-success-page-operations-secondary-btn-go-movements'),
            secondary: this.t('clarifications-management-button-exit')
          }
        },
        shareReceipt: {
          firstSection: {
            operationType: this.t('clarifications-management-success-page-share-receipt-content-operation-type-pending'),
            paymentText: this.t('clarifications-management-success-page-share-receipt-title-payment-pending'),
            provisionalPaymentText: this.t('clarifications-management-success-page-share-receipt-title-payment-provisional-pending')
          },
          secondSection: {
            movementNameText: this.t('clarifications-management-success-page-share-receipt-title-movement-name-pending'),
          }
        }
      },
      'texts-normal': {
        title: this.t('clarifications-management-success-page-title'),
        amountLabel: this.t('clarifications-management-success-page-fees-text'),
        key: this.t('clarifications-management-success-page-top-info-text'),
        messageText: this.t('clarifications-management-success-page-value-experience'),
        firstStep: {
          title: 'clarifications-management-first-step-title',
          radios: [
            {
              radio: this.t('clarifications-management-first-radio-button'),
              description: this.t('clarifications-management-first-description')
            },
            {
              radio: this.t('clarifications-management-second-radio-button'),
              description: this.t('clarifications-management-second-description')
            },
            {
              radio: this.t('clarifications-management-four-radio-button'),
              description: this.t('clarifications-management-second-description')
            },
            {
              radio: this.t('clarifications-management-third-radio-button'),
              description: this.t('clarifications-management-third-description')
            }
          ],
          infoBox: () => {
            return { description: this.t('clarifications-management-geolocation-info-box') };
          }
        },
        secondStep: {
          description: this.t('clarifications-management-step-description-normal'),
          radios: [
            {
              radio: this.t('clarifications-management-second-step-first-radio-button'),
              description: this.t('clarifications-management-second-step-first-description')
            },
            {
              radio: this.t('clarifications-management-second-step-second-radio-button'),
              description: this.t('clarifications-management-second-step-second-description')
            }
          ],
          noRadios: {
            description: this.t('clarifications-management-second-step-second-description')
          },
          infoBox: ''
        },
        blockPaymentStep: {
          title: this.t('clarifications-management-block-payment-step'),
          description: this.t('clarifications-management-block-payment-description'),
          collapsedLabel: this.t('clarifications-management-block-payment-description-collapsed')
        },
        summaryView: {
          payment: this.t('clarifications-management-button-summary-title-payment'),
          clarification: this.t('clarifications-management-button-summary-title-clarification')
        },
        successScreen: {
          account: () => this.responsePostSuccessData?.operations[0]?.subproductRefund?.id,
          infoBox: {
            content: () => ((this.radioButtonSelected === 'true') ? this.t('clarifications-management-success-page-value-experience') : this.t('clarifications-management-success-page-clarify')),
          },
          buttons: {
            primary: () => this.t('clarifications-management-success-page-operations-secondary-btn-go-movements'),
            secondary: this.t('clarifications-management-button-exit')
          }
        },
        shareReceipt: {
          firstSection: {
            operationType: this.t('clarifications-management-success-page-share-receipt-content-operation-type'),
            paymentText: this.t('clarifications-management-success-page-share-receipt-title-payment'),
            provisionalPaymentText: this.t('clarifications-management-success-page-share-receipt-title-payment-provisional-pending')
          },
          secondSection: {
            movementNameText: this.t('clarifications-management-success-page-share-receipt-title-movement-name'),
          }
        }
      },
      'texts-domis': {
        title: 'clarifications-management-success-page-title',
        amountLabel: 'clarifications-management-success-page-fees-text',
        firstStep: {
          title: this.t('clarifications-management-first-step-title-domiciliation'),
          radios: [
            {
              radio: this.t('clarifications-management-first-radio-button'),
              description: this.t('clarifications-management-first-description-domiciliation')
            },
            {
              radio: this.t('clarifications-management-second-radio-button-domiciliation'),
              description: this.t('clarifications-management-second-description-domiciliation')
            }
          ],
          infoBox: () => {
            return { description: this.t('clarifications-management-geolocation-info-box') };
          }
        },
        secondStep: {
          description: this.t('clarifications-management-second-step-description-domiciliation-radio'),
          descriptionNoRadio: this.t('clarifications-management-second-step-description-domiciliation-no-radio'),
          radios: [
            {
              radio: this.t('clarifications-management-second-step-first-radio-button-domiciliation'),
              description: this.t('clarifications-management-second-step-first-description-domiciliation')
            },
            {
              radio: this.t('clarifications-management-second-step-second-radio-button'),
              description: this.t('clarifications-management-second-step-second-description-domiciliation')
            }
          ],
          noRadios: {
            description: this.t('clarifications-management-second-step-second-description-domiciliation')
          }
        },
        blockPaymentStep: {
          title: this.t('clarifications-management-block-payment-step-domiciliation'),
          description: this.t('clarifications-management-block-payment-description-domiciliation'),
          infoBox: this.t('clarifications-management-step-block-payment-info-box-domiciliation'),
          checkBoxLabel: this.t('clarifications-management-accept-conditions'),
          collapsedLabel: this.t('clarifications-management-block-payment-description-collapsed-domiciliation')
        },
        summaryView: {
          payment: this.t('clarifications-management-button-summary-title-payment'),
          clarification: this.t('clarifications-management-button-summary-title-clarification')
        },
        successScreen: {
          account: () => this.t('clarifications-management-success-modal-info-account-label'),
          infoBox: {
            content: () => ((this.radioButtonSelected === 'true') ? this.t('clarifications-management-success-page-value-experience') : `${this.t('clarifications-management-success-page-value-experience-domiciliation-clarify-email')}<br> <strong>${this._getEmail()}</strong>`),
          },
          buttons: {
            primary: () => ((this.radioButtonSelected === 'true') ? this.t('clarifications-management-success-page-operations-secondary-btn-go-movements') : this.t('clarifications-management-success-page-operations-secondary-btn-go-clarifications')),
            secondary: this.t('clarifications-management-button-exit')
          },
          additional: [
            {
              key: this.t('clarifications-management-success-modal-date-resolution'),
              value: ''
            },
            {
              key: this.t('clarifications-management-success-modal-email-text-domiciliation'),
              value: `•${this.userEmail?.split('*')?.join('')}`
            }
          ]
        },
        shareReceipt: {
          firstSection: {
            operationType: this.t('clarifications-management-success-page-share-receipt-content-operation-type'),
            paymentText: this.t('clarifications-management-success-page-share-receipt-title-payment'),
            provisionalPaymentText: this.t('clarifications-management-success-page-share-receipt-title-payment-provisional-pending')
          },
          secondSection: {
            movementNameText: this.t('clarifications-management-success-page-share-receipt-title-movement-name'),
          }
        }
      }
    };
  }

  /**
   * @desc Get specific text object depending movement type
   * @return {string} Prefix for use as key at texts object
   */
  _getTextObject() {
    const prefix = this._getPrefixForTextsObjects();
    return this.centralizedTextsSuccess[`texts-${prefix}`];
  }

  /**
   * @desc Send text to components depending status or domis
   */
  _setTextsSteps() {
    this._fireGenericDispatchEvent('set-title-page', this._getTextObject().firstStep?.title);
    this._fireGenericDispatchEvent('set-message-info-box-geolocation', this._getTextObject().firstStep?.infoBox());
    if (!this.isDomiciliation) {
      this._fireGenericDispatchEvent('set-description-step-attention-type', this._getTextObject().secondStep?.description);
    }
    if (this.isTransit) {
      this._fireGenericDispatchEvent('set-info-box-pending-attention-type', this._getTextObject().blockPaymentStep?.infoBox());
    } else if (this.isDomiciliation) {
      this._fireGenericDispatchEvent('set-title-recurrent-charge-step', this._getTextObject().blockPaymentStep?.title);
      this._fireGenericDispatchEvent('set-message-info-box-domi-block-payment', this._getTextObject().blockPaymentStep?.infoBox);
      this._fireGenericDispatchEvent('set-checkbox-label-payment', this._getTextObject().blockPaymentStep?.checkBoxLabel);
    }
  }

  /**
  * fire dispatchEvent
  * @param eventName
  * @param detail
  * @param bubbles
  * @param composed
  * @private
  */
  _fireGenericDispatchEvent(eventName, detail = true, bubbles = true, composed = true) {
    if (eventName) {
      this.dispatchEvent(new CustomEvent(eventName, {
        bubbles: bubbles,
        composed: composed,
        detail: detail,
      }));
    }
  }

  /**
  * @desc Method that make the request from native for the flag
  */
  _requestChangeDenomitationFlag() {
    const denominationFlag = {
      module: 'claimsFlag',
      feature: 'trackingClaimsFlag'
    };
    this._fireGenericDispatchEvent('request-change-denomination-flag', denominationFlag);
  }

  /**
   * @desc Method to set clarifications tracking flag
  */
  setDenominationFlag(payload) {
    if (payload.isFlagEnable) {
      this.clarificationsList = 'TRACKING';
    } else {
      this.clarificationsList = 'LIST';
    }
  }

  /**
   * @desc dispatch event for navigate to clarifications list
   * @event request-user-classifications
  */
  validateClarificationsListFlag() {
    this._fireGenericDispatchEvent(`clarifications-management-care-${this.clarificationsList.toLowerCase()}`);
  }

  /**
   * @desc Reset all steps and flow when the page becomes inactive
  */
  reset() {
    this._previouslyBlockedCard = false;
    this._summaryExecute = false;
    this.returnAmountService = '';
    this.flagBackStepAtModals = true;
    this.clarificationsList = 'TRACKING';
    this.flagStepView = false;
    this.errorCount = 0;
    this.flagClientId = false;
    this.responsePostSuccessData = {};
    this.responsePatchSuccessData = {};
    this.bbvaPhoneTextClaimLinePhone = '';
    this.bbvaAttentionHours = '';
    this.bbvaAttentionOutOfHours = '';
    this.bbvaPhoneTextInLine = '';
    this.clarificationType = '';
    this.errorResponsePatch = {};
    this.errorResponsePost = {};
    this.modalFlag = false;
    this.debitCardNumber = [];
    this.creditCardNumber = null;
    this.blockServicesFlag = '';
    this.sendCardToSuccess = {};
    this.fireBlockRecurringPaymentFlag = false;
    this.fireBlockCardServiceFlag = false;
    this.successBlockCard = {};
    this.successBlockPaymentData = {};
    this.errorBlockPayment = {};
    this.errorBlockCard = {};
    this.titleCaseOnline = '';
    this.identifierModals = '';
    this._fireGenericDispatchEvent('reset-flow');
    let collapsed = false;
    this._fireGenericDispatchEvent('descollapsed-step', collapsed);
    let active = false;
    this._fireGenericDispatchEvent('active-step', active);
    this._fireGenericDispatchEvent('hidden-components', true);
    this.errorPostPetition = false;
    this.existingContent = false;
    this.isTheftLossAgainst = false;
    this._previousClaimDirectDebitFlag = false;
  }

  /**
   * @desc Dispatch event request for obtain user segment
   * @event request-user-classifications
  */
  _getSegmentUser() {
    this._fireGenericDispatchEvent('request-user-classifications', {
      urlParams: {
        expand: 'avatars,indicators,classifications'
      }
    });
  }

  /**
   * @desc Obtain segmentUser
  */
  _getUserSegment() {
    if (!this.flagClientId) {
      this.clientId = this.get('clientId', this.globalCacheStorage.customer) || this._fireGenericDispatchEvent('request-user-client-id') || this.clientId;
      let classifications = this.get('classifications', this.globalCacheStorage.customer);
      this.segmentUser = classifications ? this.get('id', classifications[0].segments[0]) : this._getSegmentUser();
      this.flagClientId = true;
    }
  }

  /**
   * @desc Obtain clientId
  */
  responseClientId(detail) {
    this.clientId = detail.value ? detail.value : detail;
  }

  /**
   * @desc Obtain segmentUser from customer service
  */
  successResponseClassification(detail) {
    if (this.get('id', detail[0].classifications[0].segments[0])) {
      this.segmentUser = this.get('id', detail[0].classifications[0].segments[0]);
    } else {
      this.segmentUser = 'S1';
    }
    this.userClassifications();
  }

  /**
   * @desc segment assignment when error response service
  */
  errorResponseCassification() {
    this.set('segmentUser', 'S1');
  }

  /**
   * @desc Return to previous page
  */
  _returnToPage() {
    const params = {
      productId: this.creditCardNumber?.id,
      transactionId: this.transactionClaim?.transactionId,
    };
    this.reset();
    this._fireGenericDispatchEvent('return-to-page', params);
  }

  /**
   * @desc Return in which segment user is it
  */
  _getPhoneNumerToClarification(userSegmentId, bbvaPhonesClaimsNumbers, segmentsByUser) {
    let userSegmentName;
    segmentsByUser.forEach((segment) => {
      if (segment.keys.includes(userSegmentId)) {
        userSegmentName = segment.name;
        return;
      }
    });
    return userSegmentName ? bbvaPhonesClaimsNumbers[userSegmentName] : bbvaPhonesClaimsNumbers.segmentDefault;
  }

  /**
   * @desc Return the phone bbva depending of the segment
  */
  userClassifications() {
    this.set('bbvaPhoneNumber', this._getPhoneNumerToClarification(this.segmentUser, this.bbvaPhonesClaimsNumbers, this.segmentsByUser));
  }

  /**
  * @desc Generate a CustomEvent to step
  */
  _goNextStep(currentStepKey) {
    this.currentStep = currentStepKey;
    this.setSteps();
    this.onAnyStepCollapsedChanged();
    this._resetsStepsOnError();
    this._scrollBottom(currentStepKey, 'next');
  }

  /**
   * @desc Reset steps data on er
   */
  _resetsStepsOnError() {
    if (!this.flagBackStepAtModals) {
      this.maxSteps = 5;
      this.hideSelectedSteps([3, 4, 5]);
      this._fireGenericDispatchEvent('descollapsed-step-one', false);
      this.flagBackStepAtModals = true;
    }
  }

  /**
   * @desc Return date of transaction
  */
  dataDateTransaction() {
    let date = this.transactionClaim.operationDate;
    this.datePostService = date.substring(0, 10);
    this.dateAndTime = moment(date).format('DD MMMM YYYY, HH:mm');
    this._fireGenericDispatchEvent('send-date-and-time', `${this.dateAndTime} h`);
  }

  /**
   * @desc Get establishmentName and send from show it
  */
  dataEstablishmentName() {
    let concept = this.transactionClaim.establishmentName;
    this._fireGenericDispatchEvent('send-concept', concept);
  }

  /**
   * @desc Get amounts from show in the flow
  */
  dataReturnAmount() {
    let claimAmount = this.transactionClaim.returnAmount;
    const amount = (this.productType === 'CARDS') ? `-${claimAmount}` : claimAmount;
    this.returnAmountOffer = this._parseAmount(claimAmount);
    let cardOffer = {
      suggestedAmount: {
        amount,
        currency: '$'
      },
    };
    this._fireGenericDispatchEvent('send-data-amount', cardOffer);
  }

  /**
   * @desc Get the resolution date for clarification movement
  */
  _getClarificationResolutionDate() {
    const directDebitResolutionDate = !(this.responsePatchSuccessData?.estimatedResolutionDate) ? this._getResolutionDateDirectDebit() : moment(this.responsePatchSuccessData?.estimatedResolutionDate);
    const resolutionDate = this.isDomiciliation ? directDebitResolutionDate : moment().add(this._resolutionDateEstimatedDays, 'days');
    return resolutionDate.format(this._resolutionDateFormat);
  }

  /**
   * @desc Get the resolution date for direct debit clarification movement
   * @returns  Resolution date for direct debit
   */
  _getResolutionDateDirectDebit() {
    const sunday = 0;
    const saturday = 6;
    let daysRemaining = this._resolutionDateEstimatedDaysDirectDebits;
    const newDate = moment();
    while (daysRemaining > 0) {
      newDate.add(1, 'days');
      if (newDate.day() !== sunday && newDate.day() !== saturday) {
        daysRemaining--;
      }
    }
    return newDate;
  }

  /**
   * @desc Validate if response code is server error
   * @param {object} status
   */
  _isServerResponseError(response) {
    return response?.status === this.responseServerErrorCode;
  }

  /**
   * @desc Validation to which error show
  */
  validateError() {
    let payload = {
      level1: this.cardsOrAccountsTag,
      level2: this.detailTag,
      level4: this.ANALYTICS_CONSTANTS.ERROR_LOAD_TICKET
    };
    if (
      this._isServerResponseError(this.errorResponsePost) ||
      this._isServerResponseError(this.errorBlockCard) ||
      this._isServerResponseError(this.errorResponsePatch) ||
      this._isServerResponseError(this.errorBlockPayment) ||
      this._isServerResponseError(this._errorBlockDirectDebit)
    ) {
      this._timeErrorModal();
      let errorPost = this.get('status', this.errorResponsePost) === this.responseServerErrorCode ? false : true;
      if (!errorPost) {
        this._fireGenericDispatchEvent('page-view-error', payload);
      }
    } else {
      this._errorFunction();
    }
  }

  /**
   * @desc Display to time error modal
  */
  _timeErrorModal() {
    const clarificationsManagementCareTimeErrorModal = {
      code: 'ERROR-CLARIFICATIONS-MANAGEMENT-THREE-TIMES',
      primaryButtonClass: 'primary',
      selectedConfig: {
        openMaximized: true,
        className: 'blue-header',
        heroImage: './images/error_TYC.svg',
        title: this.t('clarifications-management-header-text'),
        acceptBtLabel: this.t('clarifications-management-error-modal-time-secondary-btn-three-times'),
        cancelBtLabel: this.t('clarifications-management-error-modal-time-primary-btn-three-times'),
        template: {
          type: 'paragraphs',
          values: [
            {
              text: this.t('clarifications-management-error-modal-time-title'),
              class: 'font-size-xl strong margin-hr'
            },
            {
              text: this.t('clarifications-management-error-modal-time-description'),
              class: 'font-size-xl'
            },
          ]
        }
      }
    };
    if (this.errorCount < 3) {
      clarificationsManagementCareTimeErrorModal.code = 'ERROR-CLARIFICATIONS-MANAGEMENT-INFO-NO-AVAILABLE';
      clarificationsManagementCareTimeErrorModal.selectedConfig.acceptBtLabel = 'clarifications-management-error-modal-time-primary-btn';
      clarificationsManagementCareTimeErrorModal.selectedConfig.cancelBtLabel = 'clarifications-management-error-modal-time-secondary-btn';
      clarificationsManagementCareTimeErrorModal.selectedConfig.template.values[1].text = 'clarifications-management-error-modal-time-description';
      this.errorCount++;
    }
    this._fireGenericDispatchEvent('close-veil-spinner');
    this._fireGenericDispatchEventModals(clarificationsManagementCareTimeErrorModal);
  }

  /**
   * @desc Function to error out and in line
   */
  _errorFunction() {
    this.flagBackStepAtModals = false;
    this.set('timeBbvaPhone', this._getHour());
    if (this.timeBbvaPhone >= '08:00' && this.timeBbvaPhone <= '23:00') {
      if (this.errorResponsePost || this.errorResponsePatch || this.errorPostPetition || this.errorBlockCard || this.errorBlockPayment || this._errorBlockDirectDebit) {
        this._fireGenericDispatchEvent('close-veil-spinner');
        this._errorModalServices(false);
      }
    } else {
      this._fireGenericDispatchEvent('close-veil-spinner');
      this._errorModalServices(true);
    }
  }

  _errorModalServices(outOfLine) {
    const clarificationsManagementErrorResponse = {
      code: outOfLine ? `ERROR-CLARIFICATIONS-MANAGEMENT-OUT-OF-LINE-${this.clarificationsList}` : `ERROR-CLARIFICATIONS-MANAGEMENT-${this.clarificationsList}`,
      primaryButtonClass: 'primary',
      selectedConfig: {
        openMaximized: true,
        className: 'blue-header',
        heroImage: './images/error_TYC.svg',
        title: this.t('clarifications-management-header-text'),
        acceptBtLabel: this.t('clarifications-management-button-modal-primary-btn'),
        cancelBtLabel: this.t('clarifications-management-button-modal-secondary-btn'),
        template: {
          type: 'paragraphs',
          values: [
            {
              text: this.t('clarifications-management-error-modal-text')
            },
            {
              icon: 'coronita:info',
              message: outOfLine ?  `${this.t('clarifications-management-out-of-hours-text')} ${this.phoneNumbers?.lineParsedNumber}` : this.t('clarifications-management-attention-hours-text'),
              type: 'info'
            }
          ]
        }
      }
    };
    this._fireGenericDispatchEvent('error-clarification-init-analytic', {
      level1: this.cardsOrAccountsTag,
      level2: this.detailTag,
    });
    this._fireGenericDispatchEventModals(clarificationsManagementErrorResponse);
  }

  /**
   * @desc Redirect to movement overview. Back step native button
   */
  handleNativeBackButton(backNavigation) {
    const isClarificationsManagement = backNavigation?.value?.cancelledNavigation?.currentPage === 'clarificationsManagementCarePage';
    if (isClarificationsManagement) {
      this.exitPage();
    }
  }

  /**
   * @desc Obtain account amount from the service and quit the minus
  */
  _getReturnAmount() {
    let claimAmount = this.transactionClaim.returnAmount;
    if (this.productType === 'ACCOUNTS') {
      let positiveAmount = claimAmount.toString();
      let numberStringPositive = positiveAmount.substring(1);
      this.returnAmountService = parseFloat(numberStringPositive, 10);
      return this.returnAmountService;
    }
  }

  /**
   * @desc Obatain accounts or cards data
  */
  getCardOrAccountData() {
    const { accounts, cards, cardsValid } = this.productTypeTexts;
    let isCredit = false;
    if (this.productType === accounts) {
      const data = this.isDomiciliation ? (this.transactionClaim.cardNumber).substring(1) : this.transactionClaim.reference;
      this._getCardNumberTransaction(data);
    } else if (this.productType === cards) {
      isCredit = true;
      this._getCardNumberData(this.transactionClaim.cardNumber);
    }
    const cardStatus = (isCredit) ? this.creditCardNumber?.status?.name : this.debitCardNumber[0]?.status?.name;
    this._previouslyBlockedCard = (cardStatus !== cardsValid);
    if (this._domiciliationWithoutCard) {
      this._previouslyBlockedCard = false;
    }
  }

  /**
   * @desc Cut the reference number form the accounts and debit card
  */
  _getCardNumberTransaction(relatedCard) {
    let refArray;
    let referenceNumber;
    let referenceCardNumber;
    if (!(relatedCard.includes(' ')) || this.isDomiciliation) {
      referenceNumber = relatedCard;
    } else {
      refArray = relatedCard.split(' ');
      referenceNumber = refArray[refArray.length - 6];
    }
    referenceCardNumber = referenceNumber.includes('*') ? referenceNumber.substring(6) : referenceNumber;
    this._getRelatedContractToAccount(referenceCardNumber);
  }

  /**
   * @desc Obtain account data and debit card asociated at this account with the last 4 digits of the card/account number. The constant digitsForCardAccount is used to indicate the number of digits to cut
  */
  _getRelatedContractToAccount(account) {
    const products = this._cardsFinancialData();
    const digitsForCardAccount = 4;
    this.debitCardNumber = products.filter(debitCard => debitCard.number.slice(debitCard.number.length - digitsForCardAccount) === account);
    if (this.isDomiciliation) {
      this._domiciliationAccount = this.debitCardNumber[0];
      this.debitCardNumber = products.filter(card => card?.relatedContracts?.contractId === this.debitCardNumber[0].number);
      this._domiciliationWithoutCard = !(this.debitCardNumber.length > 0);
    }
  }

  /**
   * @desc Obtain credit card asociated at this transaction
  */
  _getCardNumberData(cardNumberId) {
    let cards =  this._cardsFinancialData();
    let findCard = cardNumberId.substring(1);
    let cardType = cards.filter(card => card.productType !== 'ACCOUNT');
    const findCardNumber = (allCards, cardTarget) => {
      return allCards?.find(currentCard => currentCard.number?.slice(currentCard.number.length - findCard.length) === cardTarget);
    };
    Object.defineProperty(this, 'creditCardNumber', {value: findCardNumber(cardType, findCard)});
  }

  /**
   * @desc Gets financial data, prioritizing cached cards or combining accounts and cards if unavailable.
  */
  _cardsFinancialData() {
    if (this.get('cards', this.globalCacheStorage.dashboard)) {
      this.set('financialData', this.get('cards', this.globalCacheStorage.dashboard));
      return this.financialData;
    } else {
      this.set('financialData', this.get('contracts', this.globalFinancialData.data));
      const clarificationDataAccount = this.financialData.filter(data => data.productType === 'ACCOUNT');
      const clarificationDataCards = this.financialData.filter(data => data.productType === 'CARD');
      return clarificationDataAccount.concat(clarificationDataCards);
    }
  }

  _cardType(card) {
    if (this.get('id', card.cardType)) {
      return this.get('id', card.cardType);
    } else {
      return this.get('id', card.subProductType);
    }
  }


  /**
   * @desc Function get and cut the reasonId
  */
  _getReasonId(evt) {
    this.reasonId = evt.substring(1);
  }

  /**
  * @desc Open previous step
  */
  openStep(step) {
    const stepToNavigate = this._steps[step.currentStep];
    if (stepToNavigate) {
      stepToNavigate.collapsed = false;
      this.toggleCollapsedView(stepToNavigate);
      this._activateSteps(stepToNavigate);
    }
    this.handleHideSteps(step.currentStep);
    this.onAnyStepCollapsedChanged(false);
  }

  /**
   * @desc handles hiding steps
   */
  handleHideSteps(currentStep) {
    if (currentStep === 2 || currentStep === 3) {
      this._fireGenericDispatchEvent('set-checkbox-checked', false);
    }
    if (currentStep === 2) {
      this.maxSteps = 5;
      this._summaryExecute = false;
      this.hideSelectedSteps([3, 4, 5]);
    } else if (currentStep === 3) {
      this.hideSelectedSteps([4, 5]);
    } else if (currentStep === 4) {
      this._fireGenericDispatchEvent('block-card', true);
    }
    if (this._summaryExecute) {
      this._fireGenericDispatchEvent('set-checkbox-checked', true);
    }
    this._scrollBottom(currentStep, 'handle');
  }

  _blockCardBody(product) {
    let body = {
      name: product.title ? this.get('name', product.title) : this.get('name', product.product),
      imgSrc: product.images ? this.get('url', product.images[0]) : this.get('url', product.detail.images[0]),
      currency: product.disposedBalance ? this.get('currency', product.disposedBalance.currentBalances[0]) : this.get('currency', product.detail.specificAmounts[0].amounts[0]),
      amount: product.disposedBalance ? this.get('amount', product.disposedBalance.currentBalances[0]) : this.get('amount', product.detail.specificAmounts[0].amounts[0]),
      cardType: this.get('cardType', product) || this.get('subProductType', product)
    };
    return body;
  }
  /**
  * @desc Show card and information to block in the step
  */
  _blockCardStep() {
    let product = {};
    product = this.debitCardNumber.length > 0 ? this.debitCardNumber[0] : this.creditCardNumber;
    this.sendCardToSuccess = this._blockCardBody(product);
    let blockCard = {
      full: {
        name: this.sendCardToSuccess.name,
        imgSrc: this.sendCardToSuccess.imgSrc,
        currency: this.sendCardToSuccess.currency,
        description: {
          value: product.number,
          masked: true
        },
        nameTopImage: true,
        primaryAmount: {
          amount: this.sendCardToSuccess.amount,
          currency: this.sendCardToSuccess.currency,
          label: 'saldo disponible'
        },
        cardType: this.sendCardToSuccess.cardType,
        relatedContracts: product.relatedContracts,
        nameRightImage: false
      },
      collapsed: {
        name: this.sendCardToSuccess.name,
        description: {
          value: product.number,
          masked: true
        },
        currencies: this.sendCardToSuccess.currency,
        nameRightImage: false
      }
    };
    const nameProduct = this.get('name', product.title) ? this.get('name', product.title) : this.get('name', product.product);
    if (nameProduct.includes('DIGITAL')) {
      this.listBlockInfo.push(this.t('clarifications-management-request-block-digital-card'),
        this.t('clarifications-management-request-digital-card'),
        this.t('clarifications-management-request-digital-card-conditions'));
    } else {
      this.listBlockInfo.push(this.t('clarifications-management-request-block-card'),
        this.t('clarifications-management-request-card'),
        this.t('clarifications-management-request-card-conditions'));
    }
    this._fireGenericDispatchEvent('block-card-step-description', this.t('clarifications-management-block-card-conditions-step'));
    this._fireGenericDispatchEvent('product-blocked', blockCard);
    this._fireGenericDispatchEvent('list-product-description', this.listBlockInfo);
  }

  /**
  * @desc Show information of payment block in the step
  */
  _blockRecurringChargeStep() {
    this._fireGenericDispatchEvent('block-payment-step-description', this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].blockPaymentStep?.description);
    this._fireGenericDispatchEvent('block-transactions-list', [ { title: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`]?.blockPaymentStep?.collapsedLabel, name: this.transactionClaim.establishmentName } ]);
  }
  /**
  * @desc Validate error validate
  */
  _validateErrorData() {
    let error = this.get('id', this.responsePostSuccessData) === '00000000' && this.get('status.id', this.responsePostSuccessData) === 'REJECTED' ? true : false;
    return error;
  }

  /**
  * @desc Validate code of block to hide or show steps
  * @param {string} blockData Blocking type id
  */
  _validateBlock(blockData) {
    this.blockServicesFlag = blockData;
    this._handleSendAnalyticsSteps(blockData);
    if (this._previouslyBlockedCard) {
      this.hideSelectedSteps([ 5 ]);
    }
    if (blockData === '01') {
      this._blockCardStep();
      this.hideSelectedSteps([ 4 ]);
      this.set('process', this.ANALYTICS_CONSTANTS.BLOCKCARD);
    } else if (blockData === '02' || this.isDomiciliation) {
      this._blockRecurringChargeStep();
      this.hideSelectedSteps([ 5 ]);
      let processAnalyticValue = this.isDomiciliation ? this.ANALYTICS_CONSTANTS.NO_AUTORIZED : this.ANALYTICS_CONSTANTS.RECURRENT_PAYMENT;
      this.set('process', processAnalyticValue);
    } else if (blockData === '04') {
      this._blockRecurringChargeStep();
      this._blockCardStep();
      this.set('process', this.ANALYTICS_CONSTANTS.RECURRENT_AND_CARD);
    } else if (blockData === '10') {
      this.hideSelectedSteps([4, 5]);
      this.set('process', this.ANALYTICS_CONSTANTS.IMMEDIATE_PAYMENT);
    } else if (this._validateErrorData()) {
      this.set('errorResponsePost.status', 500);
      this.validateError();
    } else {
      this.validateError();
    }
    this._viewStepAgainstRE();
  }

  /**
   * @desc Handle send of analytics for steps in clarifications flow
   * @param {string} blockData Blocking type id
   */
  _handleSendAnalyticsSteps(blockData) {
    const blockServiceFlagOptionsAnalytics = ['02', '04', '01'];
    const blockServiceFlagOptions = ['02', '04'];
    let payload = {
      typeAtention: this.careAnalytics?.step,
      amount: this.transactionClaim.returnAmount,
      currency: this.transactionClaim.localCurrency,
      primaryCategory: this.cardsOrAccountsTag,
      level1: this.cardsOrAccountsTag,
      level2: this.detailTag,
      productSubType: this.subTypeTag,
      productName: this.productNameTag,
    };
    const level4 = blockServiceFlagOptions.includes(blockData) ? this.ANALYTICS_CONSTANTS.RECURRENT_PAYMENT_BLOCK : this.ANALYTICS_CONSTANTS.BLOCK_CARDS;
    if (this.isTheftLossAgainst && blockServiceFlagOptionsAnalytics.includes(blockData)) {
      payload = {...payload, level4};
      this._fireGenericDispatchEvent((blockServiceFlagOptions.includes(blockData)) ? 'block-recurrent-analytics' : 'block-card-analytics', payload);
    } else if (!this.isTheftLossAgainst) {
      this._fireGenericDispatchEvent('fire-analytics-attention-type', {...payload, level4: this.ANALYTICS_CONSTANTS.ATTENTION_TYPE});
    }
  }

  /**
   * @des Validate when isTheftLossAgainst is true
   * @param {string} claimStatusDescription Description of validate automatic refound response
   */
  _validateTheftLossAgainst(claimStatusDescription) {
    if (this._previouslyBlockedCard) {
      this._handleBlockedCardTheftModal(claimStatusDescription);
    } else {
      this._handleAgainstTheftModal(claimStatusDescription);
    }
  }

  /**
   * @desc Handle type of modal when previously blocked card for theft and loss flow
   * @param {string} textService Description of validate automatic refound response
   */
  _handleBlockedCardTheftModal(textService) {
    if (textService.includes('transcurran 48hrs')) {
      this.identifierModals = 'MHRSTL';
      this.eclModalTypeTheftLoss();
    } else {
      this.titleCaseOnline = this.t('clarifications-management-present-card');
      this.identifierModals = 'MCN';
      this._eclModalNipBlockedCard();
    }
  }

  /**
   * @desc Handle type of modal when against for theft and loss flow
   * @param {string} textService Description of validate automatic refound response
   */
  _handleAgainstTheftModal(textService) {
    if (textService.includes('identificó que el cargo')) {
      this.identifierModals = 'MCNTL';
      this.eclModalTypeTheftLoss();
    } else if (textService.includes('información confidencial')) {
      this.identifierModals = 'MCVTL';
      this.eclModalTypeTheftLoss();
    } else if (textService.includes('transcurran 48hrs')) {
      this.identifierModals = 'MHRSTL';
      this.eclModalTypeTheftLoss();
    } else if (textService.includes('NIP')) {
      this.titleCaseOnline = this.t('clarifications-management-present-card');
      this.identifierModals = 'MCN';
      this._eclModalNipBlockedCard();
    }
  }

  /**
   * @desc Manage visibility for card block step in theft and loss flow
   * @param {string} statusName Status of the operation validate automatic refound
   * @param {string} statusId Id of status of operation validate automatic refound
   * @param {string} idTypeOperation Id of selected radio button validate automatic refound
   * @param {string} claimStatusDescription Description of the operation validate automatic refound
   * @void
   */
  _stepThreeView(statusName, statusId, idTypeOperation, claimStatusDescription) {
    this.isTheftLossAgainst = ((statusId === 'REJECTED' && statusName === 'EN CONTRA' && (idTypeOperation === this.t('clarifications-management-second-radio-button') || idTypeOperation === this.t('clarifications-management-four-radio-button'))));
    if (!this.isTheftLossAgainst && this._previouslyBlockedCard) {
      this.identifierModals = 'MHRSTL';
      this.eclModalTypeTheftLoss();
    }
    if (!this.isTheftLossAgainst) {
      this.flagStepView = true;
      this._fireGenericDispatchEvent('step-three-view', false);
      this._fireGenericDispatchEvent('descollapsed-step-attention', false);
      this._fireGenericDispatchEvent('set-active-step', true);
    } else {
      this._validateTheftLossAgainst(claimStatusDescription);
    }
  }

  /**
   * @desc Function that recives the response of the validate automatic refund, fire the flow depending the response and its indicators
  */
  responsePost(response) {
    const validateBlockType = response.operations[0]?.claimReason?.contract?.blockType?.id;
    if (this.isTransit && this._handleTransitCardBlockFlag(validateBlockType)) {
      this._dateTimeBbvaPhone('2');
      return;
    }
    if (this.isDomiciliation && (response.status.name).includes(this._previousClaimDirectDebitText)) {
      this._previousClaimDirectDebitFlag = true;
      this._validateStatusNameClarification(response.requiresAssistance, response.status.name);
      return;
    }
    if ((this.responseValidateBlockTypes.allBlockTypes).includes(validateBlockType)) {
      this._fireGenericDispatchEvent('close-veil-spinner');
      this._stepThreeView(response.status.name, response.status.id, response.operations[0].detail, response.operations[0].claimReason.contract.transactions[0].claimStatus.description);
      this._typeClarificationManagement(response.requiresAssistance, response.status.id, response.status.name, response.operations[0].claimReason.contract.transactions[0].claimStatus.description);
      this._validateBlock(response.operations[0].claimReason.contract.blockType.id);
      this._setDescriptionSecondStepCARE();
      if (!this._previouslyBlockedCard) {
        this._goNextStep(this.currentStepInstructions);
      }
    } else if (!validateBlockType) {
      this._fireGenericDispatchEvent('close-veil-spinner');
      this._typeClarificationManagement(response.requiresAssistance, response.status.id, response.status.name, response.operations[0]?.claimReason?.contract?.transactions[0]?.claimStatus?.description);
    } else {
      this._fireGenericDispatchEvent('close-veil-spinner');
      this.validateError();
    }
  }
  /**
   * @desc Detect change on radio buttons and send next step or line bbva
  * @param {Object} evt Event payload
  */
  setStepChangeRadioButtons(evt) {
    const eventTypeOptions = ['01', '02', '04'];
    this._getReasonId(evt.type);
    if (this._handleFeaturesWithFlags(evt.type)) {
      this._dateTimeBbvaPhone(evt.type);
      return;
    }
    this.buttonDetail = { detail: evt.text};
    if (this.isDomiciliation) {
      this._stepChangeRadioButtonsDomi(evt);
    } else if (eventTypeOptions.includes(evt.type)) {
      this._validateDataTransaction(evt);
    }  else {
      this._dateTimeBbvaPhone(evt.type);
    }
  }
  /**
   * @desc Handle features using flags from app-settings for manage flows
   * @param {string} type Id of radio button selected
   * @returns Boolean for indicate if modal must open
   */
  _handleFeaturesWithFlags(type) {
    const {  value: unrecognizedFlag } = this.featureFlagCollection['glomo.clarifications.unrecognizedCharget'];
    const {  value: theftLossFlag } = this.featureFlagCollection['glomo.clarifications.theftAndLoss'];
    const unrecognizedIds = [ '01' ];
    const theftAndLossIds = ['02', '04'];
    return ((unrecognizedIds.includes(type) && !unrecognizedFlag) || (theftAndLossIds.includes(type) && !theftLossFlag));
  }
  /**
   * @desc Handle features using flags from app-settings for manage flows
   * @param {string} type Blocktype that comes from validate service response
   * @returns Boolean to indicate if must to go to bbva line
   */
  _handleTransitCardBlockFlag(blockType) {
    const invalidBlockTypes = ['01', '04'];
    const {  value: transitCardBlockFlag } = this.featureFlagCollection['glomo.clarifications.blockTransitMovements'];
    return (!transitCardBlockFlag && invalidBlockTypes.includes(blockType));
  }

  /**
   * @desc Manage flow depending if movement is domiciliation
   */
  _stepChangeRadioButtonsDomi(evt) {
    this._checkValidHoursDirectDebits();
    if (evt.type !== this.reportingReasonTexts.noAuth || !this.directDebitClaimsAvailableHours?.available) {
      this._dateTimeBbvaPhone(evt.type);
      return;
    }
    this._validateDataTransaction(evt);
  }

  /**
   * @desc Check if the hours are valid for direct debits
   */
  _checkValidHoursDirectDebits() {
    const currentHour = this._getHour();
    this.directDebitClaimsAvailableHours.available = (currentHour >= this.directDebitClaimsAvailableHours?.bottom && currentHour <= this.directDebitClaimsAvailableHours?.top);
  }

  /**
   * @desc Check if transaction has valid data
   */
  _validateDataTransaction(evt) {
    if (this.debitCardNumber.length > 0 || this.get('cardId', this.creditCardNumber) || this.get('id', this.creditCardNumber) || this._domiciliationWithoutCard) {
      this.requestPostData();
      this.existingContent = true;
      this._fireGenericDispatchEvent('open-veil-spinner');
      if (!this.appStartedFired) {
        this._radioAnalitics(evt.type);
      }
    } else {
      this.errorPostPetition = true;
      this._errorFunction();
    }
  }

  /**
   * @desc Summary view text cases successful credit or aclaration start
  */
  _sendDataFees(type, requiresAssistance, statusId, statusName) {
    this._fireGenericDispatchEvent('handle-show-fees-message', '');
    if ((this.radioButtonSummaryTitle = type) === 'true' || this.isDomiciliation) {
      this.set('radioButtonSummarySubtitle', this.t('clarifications-management-description-payment'));
      this._fireGenericDispatchEvent('radio-button-selected-payment', this.radioButtonSummarySubtitle);
      this._sendIconHelp(type);
      this._fireGenericDispatchEvent('handle-show-fees-message', ' ');
    } else if ((this.radioButtonSummaryTitle = type) === 'false' && statusId === 'APPROVED') {
      (this.radioButtonSummarySubtitle = this.isTransit ? 'clarifications-management-description-clarification-pending' : 'clarifications-management-description-clarification');
      this._fireGenericDispatchEvent('radio-button-selected-exchange-rate', this.radioButtonSummarySubtitle);
      this._sendIconHelp(type);
    } else if ((this.radioButtonSummaryTitle = type) === 'false' && (requiresAssistance === false && statusId === 'REJECTED' && statusName === 'EN CONTRA' || statusName === 'ALTA DE ACLARACION')) {
      (this.radioButtonSummarySubtitle = 'clarifications-management-description-empty');
      this._fireGenericDispatchEvent('radio-button-selected-empty', this.radioButtonSummarySubtitle);
    }
  }

  /**
   * @desc Send icon help from summary view
  */
  _sendIconHelp(type) {
    if (type === 'true' || this.isDomiciliation) {
      this.iconHelpClarification = false;
    } else if (type === 'false') {
      this.iconHelpClarification = true;
    }
    this._fireGenericDispatchEvent('send-icon-help', this.iconHelpClarification);
  }

  /**
   * @desc Send glomo alert manager from icon help from summary view
  */
  openModalSummaryIconHelp() {
    const modalSummaryIconHelp = {
      code: 'CLARIFICATIONS-MANAGEMENT-SUMMARY-ICON-HELP',
      selectedConfig: {
        openMaximized: true,
        primaryButtonClass: 'primary',
        className: 'header--white faqsPointsRedeem',
        title: this.isTransit ? this.t('clarifications-management-header-text-summary-icon-help-pending') : this.t('clarifications-management-header-text-summary-icon-help'),
        acceptBtLabel: this.t('clarifications-management-modal-info-btn'),
        template: {
          type: 'paragraphs',
          values: [
            {
              icon: 'coronita:help',
              iconClass: 'icon-size-24',
              class: 'info'
            },
            {
              text: this.isTransit ? this.t('clarifications-management-first-text-alert-manager-case-number-pending') : this.t('clarifications-management-first-text-alert-manager-case-number'),
              class: 'spacing--s title-grey'
            },
            {
              text: this.isTransit ? '' : this.t('clarifications-management-second-text-alert-manager-case-number'),
              class: 'spacing--s title-grey'
            },
          ]
        }
      }
    };
    let payload = {
      level1: this.cardsOrAccountsTag,
      level2: this.detailTag,
      level4: this.ANALYTICS_CONSTANTS.PROVISIONAL_REFUND,
    };
    this._fireGenericDispatchEventModals(modalSummaryIconHelp);
    this._fireGenericDispatchEvent('page-view-provisional', payload);
  }

  /**
   * @desc dispatch event with modal config
   */
  _fireGenericDispatchEventModals(detail) {
    this.dispatchEvent(new CustomEvent('send-modals-config', {
      bubbles: true,
      composed: true,
      detail: detail,
    }));
  }

  /**
   * @desc Send second step depending the first service
   * @param {String} statusName
   * @param {String} statusId
   */
  _validateClarificationStatus(statusName, statusId) {
    const statusNameOptions = ['EN CONTRA', 'ALTA DE ACLARACION'];
    const statusNameSingle = [ 'A FAVOR' ];
    const statusIdSingle = [ 'APPROVED' ];
    if (statusNameOptions.includes(statusName)) {
      this.secondStepDescription = false;
      this.setDataStepRadioButtonsSecondStepCARE();
    } else if (statusIdSingle.includes(statusId) && statusNameSingle.includes(statusName)) {
      this.secondStepDescription = true;
      this.setDataStepRadioButtons();
    }
  }

  /**
   * @desc validate status name to show modal
   * @param {String} requiresAssistance
   * @param {String} statusName
   */
  _validateStatusNameClarification(requiresAssistance, statusName) {
    this.flagBackStepAtModals = false;
    if (statusName.includes('FOLIO YA EXISTE') || statusName.includes('Seguros Bancomer') || (this._previousClaimDirectDebitFlag)) {
      this._setBbvaPhoneModalTextPreviousClaim(requiresAssistance, statusName);
      this._dateTimeBbvaPhone(statusName);
    } else if (statusName.includes('90 días')) {
      this._showModalTimeExpired();
    } else {
      this._setBbvaPhoneModalText(this.reasonId);
      this._setBbvaOutOfLine(this.reasonId);
      this._dateTimeBbvaPhone(this.reasonId);
    }
  }

  /**
   * validate clarifications name to show modal
   * @param {String} requiresAssistance
   * @param {String} statusId
   * @param {String} statusName
   * @param {String} claimStatusDescription
   */
  _typeClarificationManagement(requiresAssistance, statusId, statusName, claimStatusDescription) {
    let payload = {
      typeAtention: this.careAnalytics?.step,
      amount: this.transactionClaim?.returnAmount,
      currency: this.transactionClaim?.localCurrency,
      primaryCategory: this.cardsOrAccountsTag,
      level1: this.cardsOrAccountsTag,
      level2: this.detailTag,
      productSubType: this.subTypeTag,
      productName: this.productNameTag,
    };
    if (!requiresAssistance || this.isTheftLossAgainst) {
      this._validateClarificationStatus(statusName, statusId, payload);
    } else {
      this.sendModalAgainstOnline(requiresAssistance, statusId, statusName, claimStatusDescription);
    }
  }

  /**
   * @desc Send modal from cases against online depend the legend of the service validate
   */
  sendModalAgainstOnline(requiresAssistance, statusId, statusName, claimStatusDescription) {
    let textService = claimStatusDescription;
    this.flagBackStepAtModals = false;
    if (statusId === 'REJECTED' && statusName === 'EN CONTRA') {
      if (textService.includes('NIP')) {
        this.titleCaseOnline = this.t('clarifications-management-present-card');
        this.identifierModals = 'MCN';
      } else if (textService.includes('CVV2 por canale') || textService.includes('CVV2 dinámico')) {
        this.titleCaseOnline = this.t('clarifications-management-digital-card');
        this.identifierModals = 'MCV';
      } else if (textService.includes('Tarjeta no present') || textService.includes('información con') || textService.includes('canales digital')) {
        this.titleCaseOnline = this.t('clarifications-management-mobile-token');
        this.identifierModals = 'MTM';
      }
    }
    if (this.identifierModals) {
      this.eclModalType();
    } else {
      this._validateStatusNameClarification(requiresAssistance, statusName);
    }
  }

  /**
   * @desc Summary view title text
  */
  _summaryViewTitle(type) {
    let electionType = type === 'true' ? this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].summaryView?.payment : this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].summaryView?.clarification;
    this._fireGenericDispatchEvent('election-type', electionType);
  }

  /**
   * @desc Validate status of claim
  */
  _validateClaimStatus() {
    if (this.bbvaPhoneTextClaimLinePhone.includes('ya fue abonado')) {
      this._caseNumberValidate();
      this.set('modalFlag', true);
    }
    if (this.bbvaPhoneTextClaimLinePhone.includes('Seguros')) {
      this._insuranceValidate();
      this.set('modalFlag', true);
    }
  }


  /**
   * @desc Check if the user is in time of line BBVA or out of time and send a respective modal
  */
  _dateTimeBbvaPhone(evt) {
    const eventOptions = ['1', '2', '4'];
    this.flagBackStepAtModals = false;
    let timeFlag = false;
    this.set('timeBbvaPhone', this._getHour());
    this._setBbvaPhoneModalText(evt);
    this._setBbvaOutOfLine(evt);
    this._validateClaimStatus();
    let payload = {
      level1: this.cardsOrAccountsTag,
      level2: this.detailTag,
    };
    if (this.timeBbvaPhone >= '08:00' && this.timeBbvaPhone <= '23:00' && !this.modalFlag) {
      timeFlag = true;
    } else if (!this.modalFlag) {
      timeFlag = false;
      this._fireGenericDispatchEvent('page-view-out', payload);
    }
    this._showExeptionModals(timeFlag, evt, eventOptions);
  }

  /**
   * @desc Determinate what modal will be showed when is necesary to call to bbva line
   * @param {Boolean} timeFlag Indicates if bbva line is available
   * @param {String} evt Indicates selected option
   * @param {String} eventOptions Indicates options
   */
  _showExeptionModals(timeFlag, evt, eventOptions) {
    const { stolen, commerceProblems } = this.reportingReasonTexts;
    if (this._handleFeaturesWithFlags(evt)) {
      this._showCommerceModal(timeFlag, evt);
      return;
    }
    if (eventOptions.includes(evt) || (this.isDomiciliation && !this._previousClaimDirectDebitFlag && (evt === stolen || !this.transactionClaim?.movementNumber || !this.directDebitClaimsAvailableHours?.available))) {
      this._fireGenericDispatchEvent('close-veil-spinner');
      this._showClarificationPhoneModal(timeFlag);
    } else if (evt === commerceProblems) {
      this._showCommerceModal(timeFlag);
    }
  }

  /**
  * @desc Send modal of case number in line and out of line
  */
  _caseNumberValidate() {
    this._fireGenericDispatchEvent('close-veil-spinner');
    let payload = {
      level1: this.cardsOrAccountsTag,
      level2: this.detailTag,
    };
    if (this.timeBbvaPhone >= '08:00' && this.timeBbvaPhone <= '23:00') {
      this.showCaseNumberModal(true);
      this._fireGenericDispatchEvent('page-view-call', payload);
    } else {
      this.showCaseNumberModal(false);
      this._fireGenericDispatchEvent('page-view-out', payload);
    }
  }

  /**
   * @desc Validate if the card exist for the modals
  */
  validateCardExist(payload) {
    let product;
    this.sendCardToSuccess = payload;
    if (this.debitCardNumber.length > 0) {
      product = Object.assign({}, this.debitCardNumber[0]);
    } else if (this.get('number', this.creditCardNumber)) {
      product = this.creditCardNumber;
    } else if (this._domiciliationWithoutCard) {
      product = this._domiciliationAccount;
    } else {
      product = ' ';
    }
    return product;
  }

  /**
   * @desc Show modal when is an extemporaneous movement
  */
  _showModalTimeExpired() {
    const clarificationsManagementCaseNumber = {
      code: 'CLARIFICATIONS-MANAGEMENT-TIME-EXPIRED',
      primaryButtonClass: 'primary',
      selectedConfig: {
        openMaximized: true,
        className: 'blue-header',
        heroImage: './images/error_TYC.svg',
        title: this.t('clarifications-management-header-text'),
        acceptBtLabel: this.t('clarifications-management-button-exit'),
        template: {
          type: 'paragraphs',
          values: [
            {
              text: 'clarifications-management-modal-time-expired-title',
              class: 'font-size-xl strong margin-hr'
            },
            {
              text: 'clarifications-management-modal-time-expired-text',
              class: 'font-size-xl'
            },
          ]
        }
      }
    };
    this._fireGenericDispatchEventModals(clarificationsManagementCaseNumber);
  }

  /**
   * @desc Modal for case number
  */
  showCaseNumberModal(timeFlag) {
    const product = this.validateCardExist();
    const clarificationsManagementCaseNumber = {
      code: timeFlag ? 'CLARIFICATIONS-MANAGEMENT-CASE-NUMBER' : 'CLARIFICATIONS-MANAGEMENT-CASE-NUMBER-OUT-OF-LINE',
      primaryButtonClass: 'primary',
      selectedConfig: {
        openMaximized: true,
        className: 'blue-header',
        heroImage: './images/clarifications/phone-assistance.svg',
        title: this.t('clarifications-management-header-text'),
        acceptBtLabel: timeFlag ? this.t('clarifications-management-button-modal-primary-btn') : this.t('clarifications-management-icon-modal-primary-btn'),
        cancelBtLabel: timeFlag ? this.t('clarifications-management-button-modal-secondary-btn') : null,
        template: {
          type: 'paragraphs',
          values: [
            {
              text: this.bbvaPhoneTextClaimLinePhone,
              class: 'spacing',
            },
            {
              text: this.get('name', product.title) ? this.get('name', product.title) : this.get('name', product.product),
              class: 'spacing--xs grey'
            },
            {
              musk: {
                value: this.get('number', product),
                chars: 4,
                simbol: '•',
                class: 'spacing'
              }
            },
            {
              text: ' ',
              divider: true,
              class: 'spacing'
            },
            {
              text: this.t('clarifications-management-success-modal-movement'),
              class: 'strong',
            },
            {
              text: this.transactionClaim.establishmentName,
              class: 'grey'
            },
            {
              text: `$${this.returnAmountOffer}`,
              class: 'spacing'
            },
            {
              icon: 'coronita:info',
              message: timeFlag ? this.bbvaAttentionHours : this.bbvaAttentionOutOfHours,
              type: 'info'
            }
          ]
        }
      }
    };
    this._fireGenericDispatchEventModals(clarificationsManagementCaseNumber);
  }

  /**
   * @desc Open phone modal when is a fraud
  */
  _showClarificationPhoneModal(timeFlag) {
    const product = this.validateCardExist();
    let productName;
    let cancelBtLabel = timeFlag ? this.t('clarifications-management-button-modal-secondary-btn') : null;
    cancelBtLabel = (this.isDomiciliation) ? this.t('clarifications-management-success-page-operations-secondary-btn-go-movements') : cancelBtLabel;
    if (!this.isDomiciliation) {
      productName = this.get('name', product.title) ? this.get('name', product.title) : this.get('name', product.product);
    } else {
      productName = this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].successScreen?.account();
    }
    const clarificationsManagement = {
      code: timeFlag ? 'CLARIFICATIONS-MANAGEMENT' : 'ERROR-CLARIFICATIONS-MANAGEMENT-OUT-OF-LINE',
      primaryButtonClass: 'primary',
      selectedConfig: {
        openMaximized: true,
        className: 'blue-header',
        heroImage: './images/clarifications/phone-assistance.svg',
        title: this.t('clarifications-management-header-text'),
        acceptBtLabel: timeFlag ? this.t('clarifications-management-button-modal-primary-btn') : this.t('clarifications-management-success-page-operations-secondary-btn-go-clarifications'),
        cancelBtLabel,
        template: {
          type: 'paragraphs',
          values: [
            {
              text: this.bbvaPhoneTextInLine,
              class: 'spacing'
            },
            {
              text: productName,
              class: 'grey'
            },
            {
              musk: {
                value: this.get('number', product),
                chars: 4,
                simbol: '•',
                class: 'spacing'
              },
            },
            {
              text: ' ',
              class: 'spacing'
            },
            {
              text: ' ',
              divider: true,
              class: 'spacing'
            },
            {
              text: this.t('clarifications-management-success-modal-movement'),
              class: 'strong spacing',
            },
            {
              text: this.transactionClaim.establishmentName,
              class: 'grey'
            },
            {
              text: (this.isDomiciliation) ? `- $${this.returnAmountOffer.substring(1)}` : `$${this.returnAmountOffer}`,
              class: 'spacing'
            },
            {
              text: this.t('clarifications-management-type'),
              class: 'spacing--s grey'
            },
            {
              text: this.clarificationType,
              class: `spacing ${(this.isDomiciliation) ? 'strong' : 'icon-info-open-modal'}`
            },
            {
              text: this.t('clarifications-management-success-modal-info-bbva'),
              class: 'spacing-s'
            },
            {
              icon: 'coronita:info',
              message: timeFlag ? this.bbvaAttentionHours : this.bbvaAttentionOutOfHours,
              type: 'info'
            }
          ]
        }
      }
    };
    this._fireGenericDispatchEventModals(clarificationsManagement);
  }


  /**
   * @desc Open commerce modal
  */
  _showCommerceModal(timeFlag, params = {}) {
    this.flagBackStepAtModals = false;
    if (this.reasonId === '3' || this._handleFeaturesWithFlags(params)) {
      this.flagBackStepAtModals = true;
    }
    const product = this.validateCardExist();
    const commerceModalTypeSection = this._getCommerceModalTypeSection(params);
    const clarificationsManagementCommerce = {
      code: timeFlag ? 'CLARIFICATIONS-MANAGEMENT-COMMERCE' : 'CLARIFICATIONS-MANAGEMENT-COMMERCE-OUT-OF-LINE',
      primaryButtonClass: 'primary',
      selectedConfig: {
        openMaximized: true,
        className: 'blue-header clarifications-management-icon-modal',
        heroImage: './images/clarifications/phone-assistance.svg',
        title: this.t('clarifications-management-header-text'),
        acceptBtLabel: timeFlag ? this.t('clarifications-management-button-modal-primary-btn') : this.t('clarifications-management-icon-modal-primary-btn'),
        cancelBtLabel: timeFlag ? this.t('clarifications-management-button-modal-secondary-btn') : null,
        template: {
          type: 'paragraphs',
          values: [
            {
              text: this.bbvaPhoneTextInLine,
              class: 'spacing'
            },
            {
              text: this.get('name', product.title) ? this.get('name', product.title) : this.get('name', product.product),
              class: 'spacing--xs grey'
            },
            {
              musk: {
                value: this.get('number', product),
                chars: 4,
                simbol: '•',
                class: 'spacing'
              }
            },
            {
              text: ' ',
              divider: true,
              class: 'spacing'
            },
            {
              text: this.t('clarifications-management-success-modal-movement'),
              class: 'strong',
            },
            {
              text: this.transactionClaim.establishmentName,
              class: 'grey'
            },
            {
              text: `$${this.returnAmountOffer}`,
              class: 'spacing'
            },
            ...commerceModalTypeSection,
            {
              icon: 'coronita:info',
              message: timeFlag ? this.bbvaAttentionHours : this.bbvaAttentionOutOfHours,
              type: 'info'
            }
          ]
        }
      }
    };
    if (params && this.get('isSecondModal', params) && params.isSecondModal === true) {
      clarificationsManagementCommerce.time = 200;
    }
    this._fireGenericDispatchEventModals(clarificationsManagementCommerce);
  }


  /**
  * @desc Send modal of insurance in line and out of line
  */
  _insuranceValidate() {
    this._fireGenericDispatchEvent('close-veil-spinner');
    let payload = {
      level1: this.cardsOrAccountsTag,
      level2: this.detailTag,
    };
    if (this.timeBbvaPhone >= '08:00' && this.timeBbvaPhone <= '18:30') {
      this.showModalInsurance(true);
      this._fireGenericDispatchEvent('page-view-call', payload);
    } else {
      this.showModalInsurance(false);
      this._fireGenericDispatchEvent('page-view-out', payload);
    }
  }

  /**
   * @desc Return objects depending on featureFlagCollection value
  */
  _getCommerceModalTypeSection(evt) {
    return (this._handleFeaturesWithFlags(evt) && this.reasonId !== this.reasonIdProblemCommerce) ? [] : [{
      text: this.t('clarifications-management-type'),
      class: 'spacing--s grey'
    },
    {
      text: this.clarificationType,
      class: 'icon-info-open-modal',
      iconEvent: 'coronita:help',
      eventName: 'send-icon-help-from-modal'
    }
    ];
  }

  /**
   * @desc Open insurance modal
  */
  showModalInsurance(timeFlag) {
    const product = this.validateCardExist();
    const clarificationsManagementInsurance = {
      code: timeFlag ? 'CLARIFICATIONS-MANAGEMENT-INSURANCE' : 'CLARIFICATIONS-MANAGEMENT-INSURANCE-OUT-OF-LINE',
      primaryButtonClass: 'primary',
      selectedConfig: {
        openMaximized: true,
        className: 'blue-header',
        heroImage: './images/clarifications/phone-assistance.svg',
        title: this.t('clarifications-management-header-text'),
        acceptBtLabel: timeFlag ? this.t('clarifications-management-button-modal-insurance-primary-btn') : this.t('clarifications-management-icon-modal-primary-btn'),
        cancelBtLabel: timeFlag ? this.t('clarifications-management-button-modal-secondary-btn') : null,
        template: {
          type: 'paragraphs',
          values: [
            {
              text: this.bbvaPhoneTextClaimLinePhone,
              class: 'spacing'
            },
            {
              text: this.get('name', product.title) ? this.get('name', product.title) : this.get('name', product.product),
              class: 'spacing--xs grey'
            },
            {
              musk: {
                value: this.get('number', product),
                chars: 4,
                simbol: '•',
                class: 'spacing'
              }
            },
            {
              text: ' ',
              divider: true,
              class: 'spacing'
            },
            {
              text: this.t('clarifications-management-success-modal-movement'),
              class: 'strong',
            },
            {
              text: this.transactionClaim.establishmentName,
              class: 'grey'
            },
            {
              text: `$${this.returnAmountOffer}`,
              class: 'spacing'
            },
            {
              icon: 'coronita:info',
              message: timeFlag ? this.bbvaAttentionHours : this.bbvaAttentionOutOfHours,
              type: 'info'
            }
          ]
        }
      }
    };
    this._fireGenericDispatchEventModals(clarificationsManagementInsurance);
  }

  /**
  * @desc Validate data to show in the summary view
  */
  _validateDataSummary() {
    this._summaryExecute = true;
    if (!this.isTheftLossAgainst) {
      let amount = this.returnAmountService ? this.returnAmountService : this.transactionClaim?.returnAmount;
      this._sendDataFees(this.radioButtonSelected, this.responsePostSuccessData?.requiresAssistance, this.responsePostSuccessData?.status.id, this.responsePostSuccessData?.status.name);
      this._amountData(amount);
      this._summaryViewTitle(this.radioButtonSelected);
    }
    this._launchStepThreeAnalytic();
  }

  /**
   * @desc Send analytic for step three
   */
  _launchStepThreeAnalytic() {
    if (this.isTheftLossAgainst) {
      this.set('typology', this.ANALYTICS_CONSTANTS.AGAINST_MOVEMENT);
    }
    let payload = {
      clarificationType: this.typology,
      typeAtention: this.careAnalytics?.step,
      amount: this.transactionClaim?.returnAmount,
      currency: this.transactionClaim?.localCurrency,
      primaryCategory: this.cardsOrAccountsTag,
      level1: this.cardsOrAccountsTag,
      level2: this.detailTag,
      productSubType: this.subTypeTag,
      productName: this.productNameTag,
    };
    this._fireGenericDispatchEvent('fire-analytics-reporting-reason', payload);
  }

  /**
  * @desc Validate if is an block payment and show the step ans then the summary view
  */
  validateBlockPaymentStep() {
    let payload = {
      level1: this.cardsOrAccountsTag,
      level2: this.detailTag
    };
    if ((this.responseValidateBlockTypes.blockRecurrentPayment).includes(this.blockServicesFlag)) {
      this._goNextStep(this.blockChargeStep);
      this._validateDataSummary();
    } else {
      this._fireGenericDispatchEvent('block-card', false);
      this._fireGenericDispatchEvent('descollapsed-step-block-card', false);
      this._fireGenericDispatchEvent('active-block-card-step', true);
      this._goNextStep(this.blockChargeStep);
      this._fireGenericDispatchEvent('block-card-analytics', payload);
    }
  }
  /**
  * @desc Validate if is an block card and show the step ans then the summary view
  */
  validateBlockCardStep() {
    this._goNextStep(this.blockCardStep);
    this._validateDataSummary();
  }
  /**
  * @desc Validate elements to be shown if validate services response are true for Against Theft and Loss
  */
  _viewStepAgainstRE() {
    if (this.flagStepView) {
      return;
    }
    if (this.blockServicesFlag === '01') {
      this._goNextStep(3);
      this._fireGenericDispatchEvent('block-card', this._previouslyBlockedCard);
      this._fireGenericDispatchEvent('descollapsed-step-block-card', false);
      this._fireGenericDispatchEvent('active-block-card-step', true);
    } else {
      this._goNextStep(3);
      this._fireGenericDispatchEvent('block-recurring-transaction', false);
      this._fireGenericDispatchEvent('descollapsed-step-payment', false);
      this._fireGenericDispatchEvent('active-block-payment-step', true);
    }
  }
  /**
  * @desc Validate which elements are going to be shown depending on blockServicesFlag and prevouslyBlockedCard Value
  */
  _viewStepCorrect() {
    if (this.blockServicesFlag === '01') {
      this._fireGenericDispatchEvent('block-card', this._previouslyBlockedCard);
      this._fireGenericDispatchEvent('descollapsed-step-block-card', false);
      this._fireGenericDispatchEvent('active-block-card-step', true);
    } else {
      this._fireGenericDispatchEvent('block-recurring-transaction', false);
      this._fireGenericDispatchEvent('descollapsed-step-payment', false);
      this._fireGenericDispatchEvent('active-block-payment-step', true);
    }
  }

  /**
  * @desc Set radiobutton to show, launch _goNextStep and amount on summary view
  */
  setStepClarificationsType(evt) {
    this.radioButtonSelected = evt ? this.radioButtonSelected = evt.type : this.radioButtonSelected;
    let regularExpresion = /^0[1,2,4,8]/;
    if (this._previouslyBlockedCard) {
      this._goNextStep(this.currentStepClarificationsType);
      this._validateDataSummary();
    } else if (this.blockServicesFlag.match(regularExpresion)) {
      this._viewStepCorrect();
      this._fireBlocksTag();
      this._goNextStep(this.currentStepClarificationsType);
    } else if (this.blockServicesFlag === '10') {
      this._goNextStep(this.currentStepClarificationsType);
      this._validateDataSummary();
    } else {
      this.validateError();
    }
  }

  /**
   * @desc Success provisional pay modal and close the spinner
  */
  _confirmFlowSuccess() {
    this.transactionClaim.productId = this.debitCardNumber.length > 0 ? this.debitCardNumber[0].id : (this.get('cardId', this.creditCardNumber) || this.get('id', this.creditCardNumber));
    this._fireGenericDispatchEvent('close-veil-spinner');
    this._fireGenericDispatchEvent('success-transaction-screen');
    this._fireGenericDispatchEvent('set-transaction-claim', this.transactionClaim);
    this._fireGenericDispatchEvent('set-is-domiciliation-flag', this.isDomiciliation);
  }

  /**
   * @desc Open clarification success screen and close the spinner
  */
  _confirmFlowClarificationSuccess() {
    this._fireGenericDispatchEvent('close-veil-spinner');
    this._fireGenericDispatchEvent('success-clarification-screen');
  }

  /**
   * @desc Send card to success screen
  */
  _sendCardToSuccess() {
    let product = {};
    product = this._domiciliationWithoutCard ? this._domiciliationAccount : this.debitCardNumber.length > 0 ? this.debitCardNumber[0] : this.creditCardNumber;
    Object.assign(product, {customerConfirmation: this.responsePatchSuccessData.customerConfirmation});
    this._fireGenericDispatchEvent('send-global-cache-to-success-screen', product);
  }

  /**
   * @desc Response patch
  */
  responsePatch(response) {
    let flagPatch = (response.status.id === 'IN_RETURN' && response.status.name.includes('Error de conexión'));
    const operations = response?.operations?.[0];
    const { ticketNumber } = operations || {};
    const lackTicketNumber = !ticketNumber || ticketNumber === '' || ticketNumber === this._noUpdateFolio;
    if (this.isDomiciliation && lackTicketNumber) {
      this.validateError();
      return;
    }
    this._sendCardToSuccess();
    this._sendMessageSecondary();
    if (response.customerConfirmation) {
      if (!flagPatch) {
        this._infoBoxSuccessScreen(this.responsePostSuccessData.requiresAssistance, this.responsePostSuccessData.status.id, this.responsePatchSuccessData.status.id, this.responsePatchSuccessData.status.name, this.responsePatchSuccessData.customerConfirmation);
        this._validateDataBlockFromSuccess();
        this._confirmFlowSuccess();
        this._responseData(response);
      } else {
        this.validateError();
      }
    } else {
      if (!flagPatch) {
        this._provisionalPay(this.responsePostSuccessData.status.id, this.responsePatchSuccessData.status.id, this.responsePatchSuccessData.status.name, this.responsePatchSuccessData.customerConfirmation);
        this._validateDataBlockFromClarificationSuccess();
        this._confirmFlowClarificationSuccess();
        this._responseDataClarifications(response);
      } else {
        this.validateError();
      }
    }
    this._setTicketsTemplates(response);
    if (!flagPatch) {
      this._fireGenericDispatchEvent('rating-clarifications-channel', {
        view: 'clarifications',
        value: true
      });
    }
  }

  /**
   * @desc Succes data Block Card or Payment Block
   */
  _successBlocCardAndPayment() {
    this._sendCardToSuccess();
    this._validateCardLockSuccess();
    this._confirmFlowClarificationSuccess();
    this._responseDataClarifications(this.responsePostSuccessData);
  }

  /**
   * @desc Request from the block card service
  */
  _putBlockCard() {
    const payload = {
      params: {
        cardId: this.debitCardNumber.length > 0 ? this.debitCardNumber[0].id : (this.get('cardId', this.creditCardNumber) || this.get('id', this.creditCardNumber)),
        blockId: (this.reasonId === '2') ? 'STOLEN' : 'LOST'
      },
      body: {
        id: 'Al',
        name: 'TF01 ACLARACIONES FRAUDE-MG'
      }
    };
    this._fireGenericDispatchEvent('send-block-id', payload.params.blockId);
    this._fireGenericDispatchEvent('send-block-card-id', payload.params.cardId);
    this._fireGenericDispatchEvent('send-request-block-card', payload);
    this.fireBlockCardServiceFlag = true;
  }

  /**
   * @desc Return the service provider for the block payment service
  */
  _getServiceProvider() {
    let parseService = this.responsePostSuccessData.operations[0].claimReason.contract.blockType.name;
    let serviceProviderId = parseService.split(',');
    let sendProviderId = serviceProviderId[1].substring(3);
    return sendProviderId;
  }

  /**
   * @desc Get the establishmentName and cut 29 positions
  */
  _getEstablishmentName() {
    let establishmentName = this.transactionClaim.establishmentName;
    let establishmentNameToService = establishmentName.substring(0, 29);
    return establishmentNameToService;
  }
  /**
   * @desc Request from the block payment service
  */
  _postBlockPayment() {
    const body = {
      contract: {
        id: this.responsePostSuccessData.operations[0].subproductRefund.number
      },
      blockType: {
        id: 'AFFILIATION'
      },
      serviceProvider: {
        id: this._getServiceProvider()
      },
      charge: {
        totalAmount: {
          amount: this.returnAmountService ? this.returnAmountService : this.transactionClaim.returnAmount,
          currency: this.transactionClaim.localCurrency
        },
        description: this._getEstablishmentName()
      },
      operationDate: this.datePostService
    };
    this._fireGenericDispatchEvent('send-request-block-payment', body);
    this.fireBlockRecurringPaymentFlag = true;
  }

  /**
   * @desc Success block payment
  */
  successBlockPayment(response) {
    this.successBlockPaymentData = response;
    this._fireGenericDispatchEvent('open-veil-spinner');
    if (this.blockServicesFlag === '02') {
      this._requestPatchData(this.radioButtonSelected);
    } else {
      this._putBlockCard();
    }
  }

  /**
   * @desc Validate error block payment
  */
  validateErrorBlockPayment(response) {
    this.errorBlockPayment = response;
    this.validateError();
  }

  /**
   * @desc Observe radio button selected to show success screen and fire the block card service
  */
  successScreenClarifications() {
    this._fireGenericDispatchEvent('open-veil-spinner');
    const blockFunc = {
      '01': this._putBlockCard,
      '02': this._postBlockPayment,
      '04': this._postBlockPayment,
      '08': this._postBlockDomi
    };
    if (this._previouslyBlockedCard) {
      this._requestPatchData(this.radioButtonSelected);
      return;
    }
    if (blockFunc[this.blockServicesFlag]) {
      (blockFunc[this.blockServicesFlag]).call(this);
      return;
    }
    this._requestPatchData(this.radioButtonSelected);
  }

  /**
   * @desc Init the flow for deactivate a direct debit transaction
   */
  _postBlockDomi() {
    this._fireGenericDispatchEvent('get-direct-debits');
  }

  /**
   * @desc Handler for get direct debits service. numberOfDigitsForEliminate indicate the number of digits for eliminate at card/account number because string starts with musk symbol and numberOfDigitsForGetDirectDebitId indicate the number of digits to cut the stable establishment name for get the direct debit id
   * @param {object} response Store the response of the get direct debit service
   */
  getDirectDebitsHandlerSuccess(response) {
    const {cardNumber, establishmentName} = this.transactionClaim;
    const numberOfDigitsForEliminate = 1;
    const numberOfDigitsForGetDirectDebitId = -5;
    const currentDomiciliation = response.find(({relatedContract, service}) => (relatedContract.number).includes((cardNumber).substring(numberOfDigitsForEliminate)) && (establishmentName.slice(numberOfDigitsForGetDirectDebitId) === service.id));
    const domiId = currentDomiciliation?.id;
    if (!domiId) {
      this._errorGetDirectDebit = response;
      this.validateError();
      return;
    }
    this._fireGenericDispatchEvent('patch-direct-debits-deactivate', {body: this._payloadBlockDirectDebit, directDebitId: domiId});
  }

  /**
   * @desc Handler for get direct debits service error
   * @param {object} response Store the error response of the get direct debit service
   */
  getDirectDebitsHandlerError(response) {
    this._errorGetDirectDebit = response;
    this.validateError();
  }

  /**
   * @desc Handler for patch direct debits service
   * @param {object} response Store the response of the patch direct debit service
   */
  patchDirectDebitsDeactivateHandlerSuccess(response) {
    this.successBlockDomiData = response;
    this._requestPatchData(this.radioButtonSelected);
  }

  /**
   * @desc Handler for patch direct debits service error
   * @param {object} response Store the error response of the patch direct debit service
   */
  patchDirectDebitsDeactivateHandlerError(response) {
    this._errorBlockDirectDebit = response;
    this.validateError();
  }

  /**
   * @desc Set modal to inform the block domi
  */
  _modalBlockDomi() {
    const clarificationsManagementModalBlockPayment = {
      code: 'BLOCK-PAYMENT',
      selectedConfig: {
        openMaximized: true,
        primaryButtonClass: 'primary',
        className: 'header--white faqsPointsRedeem',
        title: this.t('clarifications-management-success-page-block-domi-title'),
        acceptBtLabel: this.t('clarifications-management-modal-info-btn'),
        template: {
          type: 'paragraphs',
          values: [
            {
              icon: 'coronita:help',
              iconClass: 'icon-size-24',
              class: 'info'
            },
            {
              text: this.t('clarifications-management-modal-block-domi-first-text'),
              class: 'spacing--s title-grey'
            },
            {
              text: this.t('clarifications-management-modal-block-domi-second-text'),
              class: 'spacing--s title-grey'
            },
          ]
        }
      }
    };
    this._fireGenericDispatchEventModals(clarificationsManagementModalBlockPayment);
  }

  /**
   * @desc Set amount of aclaration in summary view
  */
  _amountData(amount) {
    this._fireGenericDispatchEvent('send-amount-data', {
      amount: {
        amount: amount,
        currency: '$'
      },
      fees: [
        {
          feeType: {
            id: 'CLARIFICATION MANAGEMENT',
            name: 'Clarification Management'
          },
        }
      ],
    }
    );
  }

  /**
   * @desc Validations to service response and put the text in the modals
  */
  _setBbvaPhoneModalTextPreviousClaim(requiresAssistance, statusName) {
    const { validationAlreadyClarification, validationInsurance } = this.validationsClaimsServiceResponseTexts;
    if (requiresAssistance === true && (statusName.includes(validationAlreadyClarification) || this._previousClaimDirectDebitFlag)) {
      this.set('bbvaPhoneTextClaimLinePhone', this.t('clarifications-management-alert-manager-case-number-process'));
      this.bbvaAttentionHours = this.t('clarifications-management-attention-hours-text');
      this._fireGenericDispatchEvent('send-modal-case-number-bbva-phone-text', this.bbvaPhoneTextClaimLinePhone);
    } else if (requiresAssistance === true && statusName.includes(validationInsurance)) {
      this.set('bbvaPhoneTextClaimLinePhone', this.t('clarifications-management-insurance-bbva-modal'));
      this.bbvaAttentionHours = this.t('clarifications-management-insurance-attention-hours');
      this._fireGenericDispatchEvent('send-modal-insurance-bbva-phone-text', this.bbvaPhoneTextClaimLinePhone);
    }
  }

  /**
   * @desc Validations from BBVA line text from the modals
   * @param {string} type Blocking type
   */
  _setBbvaPhoneModalText(type) {
    if (!this.transactionClaim || Object.keys(this.directDebitClaimsAvailableHours).length === 0) {
      return;
    }
    if (this.isDomiciliation && (!this.transactionClaim.transactionNumber || !this.directDebitClaimsAvailableHours?.available)) {
      type = '1';
    }
    const bbvaModalValidations = {
      '1': {
        bbvaPhoneTextInLine: (this.isDomiciliation) ? this.t('clarifications-management-stolen-lost-card-text-pending') : this.t('clarifications-management-stolen-lost-card-text'),
        bbvaAttentionHours: this.t(`clarifications-management-attention-hours-text${this.isDomiciliation ? '-domiciliation' : ''}`),
        clarificationType: (this.isDomiciliation) ? this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].firstStep?.radios[1]?.radio : this.t('clarifications-management-authorized-amount')
      },
      '2': {
        bbvaPhoneTextInLine: this.t('clarifications-management-stolen-lost-card-text'),
        bbvaAttentionHours: this.t('clarifications-management-attention-hours-text'),
        clarificationType: this.buttonDetail.detail,
      },
      '02': {
        bbvaPhoneTextInLine: this.t('clarifications-management-stolen-lost-card-text-pending'),
        bbvaAttentionHours: this.t(`clarifications-management-attention-hours-text${this.isDomiciliation ? '-domiciliation' : ''}`),
        clarificationType: this.buttonDetail.detail
      },
      '03': {
        bbvaPhoneTextInLine: this.t('clarifications-management-clarification-text'),
        bbvaAttentionHours: this.t('clarifications-management-attention-hours-text'),
        clarificationType: this.t('clarifications-management-clarification-type-clarification-problem')
      },
      '4': {
        bbvaPhoneTextInLine: this.t('clarifications-management-stolen-lost-card-text'),
        bbvaAttentionHours: this.t('clarifications-management-attention-hours-text'),
        clarificationType: this.buttonDetail.detail
      },
      '04': {
        bbvaPhoneTextInLine: this.t('clarifications-management-stolen-lost-card-text'),
        bbvaAttentionHours: this.t('clarifications-management-attention-hours-text'),
        clarificationType: this.buttonDetail.detail
      }
    };
    let validType = bbvaModalValidations[type];
    if (validType) {
      this.bbvaPhoneTextInLine = bbvaModalValidations[type]?.bbvaPhoneTextInLine;
      this.bbvaAttentionHours = bbvaModalValidations[type]?.bbvaAttentionHours;
      this.clarificationType = bbvaModalValidations[type]?.clarificationType;
    }
  }

  /**
   * @desc Obtain contractId or number
  */
  _requestRelatedContracts() {
    return this.debitCardNumber[0].relatedContracts[0].number ? this.debitCardNumber[0].relatedContracts[0].number : this.debitCardNumber[0].relatedContracts[0].contractId;
  }

  /**
   * @desc validate product type return object with request data
   * @returns {Object}
  */
  _validatePetitionPostProductType() {
    let body = {};
    if (this.productType === 'ACCOUNTS') {
      body.contractId = '00000000000000000000';
      body.contractType = 'ACCOUNT';
      body.number = this._domiciliationWithoutCard ? this._domiciliationAccount?.number : this._requestRelatedContracts();
      body.numberType = 'CCC';
      body.transactionsName = 'BIENES Y SERVICIOS ( COMPRAS )';
      body.localAmount = this._getReturnAmount();
      body.cardAgreement = null;
      body.accountType = this.segmentUser || 'S1';
    } else if (this.productType === 'CARDS') {
      body.contractId = this.get('contractId', this.transactionClaim);
      body.contractType = 'CARD';
      body.number = this.get('number', this.creditCardNumber);
      body.numberType = 'PAN';
      body.transactionsName = this.get('internalCodeName', this.transactionClaim);
      body.localAmount = this.get('returnAmount', this.transactionClaim);
      body.cardAgreement = this.segmentUser || 'S1';
      body.accountType = null;
    }
    body = {...body, ...this._getSubProductRefundInfo()};
    return body;
  }

  /**
   * @desc Get the name/title and id of the selected product by the user (card or account).
   */
  _getSubProductRefundInfo() {
    const { accounts, cards } = this.productTypeTexts;
    let body = {};
    if (this.productType === accounts) {
      body.subproductRefundId = this._domiciliationWithoutCard ? this._domiciliationAccount?.product?.name : this.get('name', this.debitCardNumber[0].title) || this.get('name', this.debitCardNumber[0]?.product);
      body.subproductRefundNumber = this._domiciliationWithoutCard ? this._domiciliationAccount?.id : this.get('cardId', this.debitCardNumber[0]) || this.get('id', this.debitCardNumber[0]);
    } else if (this.productType === cards) {
      body.subproductRefundId = this.get('name', this.creditCardNumber.title) || this.get('name', this.creditCardNumber.product);
      body.subproductRefundNumber = this.get('cardId', this.creditCardNumber) || this.get('id', this.creditCardNumber);
    }
    return body;
  }

  /**
   * @desc Request from post service to accounts and cards data
  */
  requestPostData() {
    let bodyType = this._validatePetitionPostProductType();
    const additionalDomiData = (this.isDomiciliation) ? { movementFolio: this.transactionClaim.transactionNumber, referenceCode: this.transactionClaim?.legendCodeParsed } : {};
    const petitionConfig = {
      petitioner: {
        id: this.clientId,
        membershipDate: this.get('membershipDate', this.globalCacheStorage.customer) || this.get('membershipDate', this.globalCacheStorage[0])
      },
      reason: {
        id: this.reasonId
      },
      operations: [
        {
          detail: this.buttonDetail.detail,
          operationType: null,
          claimReason: {
            contract: {
              id: bodyType.contractId,
              contractType: bodyType.contractType,
              number: bodyType.number,
              numberType: {
                id: bodyType.numberType
              },
              transactions: [
                {
                  id: this.transactionClaim.transactionId,
                  isAvailable: true,
                  operationDate: this.datePostService,
                  concept: this.transactionClaim.establishmentName,
                  ...additionalDomiData,
                  transactionType: {
                    id: this.isDomiciliation ? this.validationsClaimsServiceResponseTexts.transactionTypeIdDirectDebit : this.transactionClaim.transactionType,
                    name: bodyType.transactionsName,
                    internalCode: {
                      id: this.transactionClaim.internalCode,
                      name: this.transactionClaim.authorizationNumber
                    }
                  },
                  localAmount: {
                    currency: this.transactionClaim.localCurrency,
                    amount: bodyType.localAmount
                  }
                }
              ],
              cardAgreement: {
                id: bodyType.cardAgreement
              },
              accountType: {
                id: bodyType.accountType
              }
            }
          },
          subproductRefund: {
            id: bodyType.subproductRefundId,
            number: bodyType.subproductRefundNumber,
            refundMode: 'CASHING'
          },
          requestedAmount: {
            currency: this.transactionClaim.localCurrency,
            amount: bodyType.localAmount
          },
          movementStatus: this.transactionClaim?.status
        }
      ]
    };
    if (petitionConfig.petitioner.id && petitionConfig.operations[0].detail && (petitionConfig.operations[0].claimReason.contract.cardAgreement.id || petitionConfig.operations[0].claimReason.contract.accountType.id)) {
      this._fireGenericDispatchEvent('send-request-to-post-service', petitionConfig);
    } else {
      this.errorPostPetition = true;
      this._errorFunction();
    }
  }

  /**
   * @desc Request patch service data
  */
  _requestPatchData(evt) {
    let params = {
      id: this.responsePostSuccessData.id,
      body: {
        customerConfirmation: evt
      }
    };
    this._fireGenericDispatchEvent('send-request-to-patch-service', params);
  }

  /**
   * @desc Send status of movement text
   * @param statusName Status name of validate automatic refound response
   */
  _setBbvaOutOfLine(statusName) {
    const { validationAlreadyClarification, validationInsurance, validationCommerceProblems} = this.validationsClaimsServiceResponseTexts;
    if (statusName?.includes(validationAlreadyClarification) || this._previousClaimDirectDebitFlag || (this.responseValidateBlockTypes.statusNameOptionsIds)?.includes(statusName) || statusName?.includes(validationCommerceProblems)) {
      this.bbvaAttentionOutOfHours = `${this.t('clarifications-management-out-of-hours-text')} ${this.phoneNumbers.lineParsedNumber}`;
    } else if (statusName?.includes(validationInsurance)) {
      this.bbvaAttentionOutOfHours = `${this.t('clarifications-management-insurance-out-of-text')} ${this.phoneNumbers.insuranceParsedNumber}`;
    }
  }

  /**
   * @desc Send the second modal from the tooltip in the other modal and check the hour
  */
  checkModal(params) {
    if (this.timeBbvaPhone >= '08:00' && this.timeBbvaPhone <= '23:00') {
      this._showCommerceModal(true, params);
    } else {
      this._showCommerceModal(false, params);
    }
  }

  /**
   * @desc Open second modal commerce
  */
  tooltipHelpModalCommerce() {
    const clarificationsManagementSwitch = {
      code: 'ICON-INFO-BUTTON',
      primaryButtonClass: 'primary',
      time: 100,
      selectedConfig: {
        onAcceptDetail: { isSecondModal: true },
        onCancelDetail: { isSecondModal: true },
        openMaximized: true,
        className: 'blue-header faqsPointsRedeem',
        title: this.t('clarifications-management-third-radio-button'),
        acceptBtLabel: this.t('clarifications-management-modal-info-btn'),
        template: {
          type: 'paragraphs',
          values: [
            {
              icon: 'coronita:help',
              iconClass: 'icon-size-24',
              class: 'info'
            },
            {
              text: this.t('clarifications-management-text-legal-tooltip-movement'),
              class: 'spacing--s grey'
            },
          ]
        }
      }
    };
    this._fireGenericDispatchEventModals(clarificationsManagementSwitch);
  }

  /**
   * @desc Open call in BBVA line
  */
  manageOperationLineBbva() {
    let objectPhone = {};
    if (this.bbvaPhoneTextClaimLinePhone.includes('Seguros Bancomer')) {
      objectPhone = {
        value: this.phoneNumbers.insuranceCompleteNumber
      };
    } else {
      objectPhone = {
        value: this.bbvaPhoneNumber.phoneNumber
      };
    }
    this._fireGenericDispatchEvent('request-phone-call', objectPhone);
  }

  /**
   * @desc Receive the success from the block card service
  */
  successResponseBlockCard(payload) {
    this.successBlockCard = payload;
    if (this.isTheftLossAgainst) {
      this._successBlocCardAndPayment();
    } else {
      this._requestPatchData(this.radioButtonSelected);
    }
  }

  /**
   * @desc Validate if the card is "VIGENTE" and fire the block card service
  */
  validateErrorBlockCard(response) {
    this.errorBlockCard = response;
    let productStatus = this.debitCardNumber.length > 0 ? this.get('name', this.debitCardNumber[0].status) : this.get('name', this.creditCardNumber.status);
    if (productStatus !== 'VIGENTE' && !this.isTheftLossAgainst) {
      this._requestPatchData(this.radioButtonSelected);
    } else {
      this.validateError();
    }
  }

  /**
   * @desc Validation to show case in the clarifications success screen info button modal
   * @param {string} evt Blocking type id
  */
  successModalInfoButton(evt) {
    const buildModalActions = {
      '1': this.openModalSummaryIconHelp,
      '2': this._modalInfoSuccessScreen,
      '3': this._modalBlockCard,
      '4': this._modalBlockPayment,
      '8': this._modalBlockDomi,
      '6': this._modalTransitMovement,
    };
    const buildModalAction = buildModalActions[evt];
    if (buildModalAction) {
      buildModalAction.call(this);
    }
  }

  /**
   * @desc Modal of the case number in the discharge of clarification
  */
  _modalInfoSuccessScreen() {
    const clarificationsManagementModalInfoSuccess = {
      code: 'INFO-SUCCESS',
      selectedConfig: {
        className: 'info faqsPointsRedeem',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: this.t('clarifications-management-modal-info-btn'),
        template: {
          type: 'paragraphs',
          values: [
            { icon: 'coronita:help' },
            { title: this.t('clarifications-management-success-modal-case-number') },
            {
              text: this.t('clarifications-management-modal-case-number'),
              class: 'spacing--s gray'
            }
          ]
        }
      }
    };
    this._fireGenericDispatchEventModals(clarificationsManagementModalInfoSuccess);
  }

  /**
   * @desc Modal to inform the block card
  */
  _modalBlockCard() {
    const clarificationsManagementModalBlockCard = {
      code: 'BLOCK-CARD',
      selectedConfig: {
        className: 'info header--white paragraphs__list',
        openMaximized: true,
        title: this.t('clarifications-management-success-page-block-card-title'),
        acceptBtLabel: this.t('clarifications-management-modal-info-btn'),
        template: {
          type: 'paragraphs',
          values: [
            { icon: 'coronita:help' },
            {
              text: this.t('clarifications-management-modal-block-card'),
              class: 'grey'
            },
            { text: ' ', class: 'spacing--xs' },
            { list: [this.t('clarifications-management-request-block-card'), this.t('clarifications-management-request-card'), this.t('clarifications-management-request-card-conditions')] },
          ]
        }
      }
    };
    let validateProduct = this.sendCardToSuccess.title ? this.get('name', this.sendCardToSuccess.title) :   this.get('name', this.sendCardToSuccess.product);
    if (validateProduct.includes('DIGITAL')) {
      clarificationsManagementModalBlockCard.selectedConfig.template.values[3].list = [this.t('clarifications-management-request-block-digital-card'), this.t('clarifications-management-request-digital-card'), this.t('clarifications-management-request-digital-card-conditions')];
    }
    this._fireGenericDispatchEventModals(clarificationsManagementModalBlockCard);
  }

  /**
   * @desc Modal to inform the block payment
  */
  _modalBlockPayment() {
    const clarificationsManagementModalBlockPayment = {
      code: 'BLOCK-PAYMENT',
      selectedConfig: {
        openMaximized: true,
        primaryButtonClass: 'primary',
        className: 'header--white faqsPointsRedeem',
        title: this.t('clarifications-management-success-page-block-payment-title'),
        acceptBtLabel: this.t('clarifications-management-modal-info-btn'),
        template: {
          type: 'paragraphs',
          values: [
            {
              icon: 'coronita:help',
              iconClass: 'icon-size-24',
              class: 'spacing--s info'
            },
            {
              text: this.t('clarifications-management-modal-block-payment-first-text'),
              class: 'spacing title-grey'
            },
            {
              text: this.t('clarifications-management-modal-block-payment-second-text'),
              class: 'spacing--s title-grey'
            },
          ]
        }
      }
    };
    this._fireGenericDispatchEventModals(clarificationsManagementModalBlockPayment);
  }

  /**
   * @desc Modal that shows the detail about transit movements
  */
  _modalTransitMovement() {
    const clarificationsManagementModalInfoSuccess = {
      code: 'INFO-SUCCESS',
      selectedConfig: {
        className: 'info header--white paragraphs__list',
        openMaximized: true,
        acceptBtLabel: this.t('clarifications-management-modal-info-btn'),
        title: this.t('clarifications-management-success-modal-transit-movement-title'),
        template: {
          type: 'paragraphs',
          values: [
            { icon: 'coronita:help' },
            {
              text: this.t('clarifications-management-modal-transit-movement-message'),
              class: 'gray spacing'
            }
          ]
        }
      }
    };
    if (!this.sendCardToSuccess.customerConfirmation) {
      clarificationsManagementModalInfoSuccess.selectedConfig.template.values.push({
        text: this.t('clarifications-management-modal-transit-movement-secondary-message'),
        class: 'gray'
      });
    }
    const payload = {
      level1: this.ANALYTICS_CONSTANTS.CARDS,
      level2: this.ANALYTICS_CONSTANTS.CREDIT_TAG,
    };
    this._fireGenericDispatchEventModals(clarificationsManagementModalInfoSuccess);
    this._fireGenericDispatchEvent('fire-analytics-transit-modal', payload);
  }

  /**
   * @desc Description of second modal
  */
  _setDescriptionSecondStepCARE() {
    let radioButtonDefault = '';
    if (this.isTransit) {
      radioButtonDefault = this.t('clarifications-management-second-step-description-pending');
    } else {
      radioButtonDefault = this.secondStepDescription === false ? this.t('clarifications-management-second-step-description-CRCARE') : this.t('clarifications-management-second-step-description');
    }
    if (this.isDomiciliation) {
      radioButtonDefault = this.secondStepDescription ? this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].secondStep?.description : this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].secondStep?.descriptionNoRadio;
    }
    this._fireGenericDispatchEvent('step-description', radioButtonDefault);
  }


  /**
   * @desc First step with radio buttons
  */
  setDataRadioButtons() {
    const notAuthorizedRadioButton = {
      externalLink: false,
      config: {
        id: '0',
        radio: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].firstStep?.radios[0]?.radio,
        description: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].firstStep?.radios[0]?.description,
        disabled: false,
        type: '01',
        class: 'cells-step-radio-buttons__description-font-light first-step-not-authorized'
      }
    };

    const stolenCardRadioButton = {
      externalLink: false,
      config: {
        id: '1',
        radio: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].firstStep?.radios[1]?.radio,
        description: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].firstStep?.radios[1]?.description,
        disabled: false,
        type: '02',
        class: 'cells-step-radio-buttons__description-font-light first-step-stolen'
      },
    };

    const lostCardRadioButton = {
      externalLink: false,
      config: {
        id: '3',
        radio: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].firstStep?.radios[2]?.radio,
        description: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].firstStep?.radios[2]?.description,
        disabled: false,
        type: '04',
        class: 'cells-step-radio-buttons__description-font-light first-step-lost'
      }
    };

    const commerceProblemRadioButton = {
      externalLink: false,
      config: {

        id: '2',
        radio: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].firstStep?.radios[3]?.radio,
        description: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].firstStep?.radios[3]?.description,
        disabled: false,
        type: '03',
        class: 'cells-step-radio-buttons__description-font-light first-step-commerce-problem'
      }
    };

    const instructions = [
      notAuthorizedRadioButton,
      stolenCardRadioButton,
      lostCardRadioButton,
      commerceProblemRadioButton
    ];

    const instruccionDomis = [
      {
        externalLink: false,
        config: {
          id: '0',
          radio: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].firstStep?.radios[0]?.radio,
          description: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].firstStep?.radios[0]?.description,
          disabled: false,
          type: '01',
          class: 'cells-step-radio-buttons__description-font-light first-step-not-authorized'
        }
      },
      {
        externalLink: false,
        config: {
          id: '1',
          radio: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].firstStep?.radios[1]?.radio,
          description: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].firstStep?.radios[1]?.description,
          disabled: false,
          type: '02',
          class: 'cells-step-radio-buttons__description-font-light'
        }
      },
    ];
    this._fireGenericDispatchEvent('set-radio-buttons', (this.isDomiciliation) ? instruccionDomis : instructions);
  }

  /**
   * @desc Second step with radio buttons
  */
  setDataStepRadioButtons() {
    const refoundRadioButton = {
      externalLink: false,
      config: {
        id: '0',
        radio: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].secondStep?.radios[0]?.radio,
        description: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].secondStep?.radios[0]?.description,
        disabled: false,
        type: 'true',
        class: 'cells-step-radio-buttons__description-font-light second-step-refound'
      }
    };

    const clarificationRadioButton = {
      externalLink: false,
      config: {
        id: '1',
        radio: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].secondStep.radios[1].radio,
        description: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].secondStep.radios[1].description,
        disabled: false,
        type: 'false',
        class: 'cells-step-radio-buttons__description-font-light second-step-clarification'
      }
    };

    const electionRadioButton = [
      refoundRadioButton,
      clarificationRadioButton
    ];

    this._fireGenericDispatchEvent('set-step-radio-buttons', electionRadioButton);
  }

  /**
   * @desc Second step with one radio button
  */
  setDataStepRadioButtonsSecondStepCARE() {
    const electionRadioButtonSecondStep = [
      {
        externalLink: false,
        config: {
          id: '0',
          radio: this.t('clarifications-management-second-step-second-radio-button'),
          description: this.t(`clarifications-management-second-step-second-description${this.isDomiciliation ? '-domiciliation' : ''}`),
          disabled: false,
          type: 'false',
          class: 'cells-step-radio-buttons-disable-radio-button'
        }
      }
    ];
    this._fireGenericDispatchEvent('set-step-radio-buttons-second-step', electionRadioButtonSecondStep);
    this._goNextStep(this.currentStepInstructions);
  }

  /**
   * @desc Convert the in to float from the success page
  */
  _getFloatAmount(intNumber) {
    const floatNumber = (intNumber).toFixed(2);
    return floatNumber;
  }

  /**
   * @desc Convert an integer to string separated by character
  */
  _parseAmount(intNumber) {
    if (isNaN(intNumber)) {
      return '';
    }
    const floatNumber = (intNumber).toFixed(2);
    return this._addSeparatorsToAmount(floatNumber);
  }

  /**
   * @desc Handle content of text in summary about provisional payment
   * @param postStatusId Status Id of validate automatic refound response
   * @param patchStatusId Status id of patch service response
   * @param patchStatusName Status name of patch service response
   * @param customerConfirmation Flag for indicate type of success
   */
  _provisionalPay(postStatusId, patchStatusId, patchStatusName, customerConfirmation) {
    const statusTexts = ['APPROVED', 'REJECTED'];
    const idTexts = ['APPROVED', 'IN_PROGRESS', 'IN_TRANSIT'];
    if (this.isDomiciliation) {
      return;
    }
    if ((patchStatusName.includes('ABONO BBVA') || patchStatusId === 'IN_TRANSIT') && customerConfirmation === false && (statusTexts.includes(postStatusId)) && (idTexts.includes(patchStatusId))) {
      this.provisionalPayment = {
        key: this.isTransit ? 'clarifications-management-success-modal-provisional-subscription-transit' : 'clarifications-management-success-modal-provisional-subscription',
        value: `$${this._getFloatAmount(this.responsePatchSuccessData.operations[0].requestedAmount.amount)}`,
        icon: 'coronita:help',
        id: 1,
        iconSize: '24 info-without-head-two-rows',
        class: 'spacing-s tooltip-fixed-position'
      };
    }
    this._applyProvisionalPayment = true;
  }
  /**
   * @desc Show info box in success screen
  */
  _infoBoxSuccessScreen(requiresAssistance, postStatusId, patchStatusId, patchStatusName, customerConfirmation) {
    if ((requiresAssistance === false && postStatusId === 'APPROVED') && (patchStatusId === 'IN_RETURN' && patchStatusName.includes('la solución quedará en 24 horas') && customerConfirmation === true)) {
      this.infoSuccessScreen = {
        key: 'clarifications-management-success-page-authorized-pay-title',
        value: 'clarifications-management-success-page-authorized-pay',
        class: 'spacing-s'
      };
    }
  }

  /**
   * @desc Send message secondary from the success screen
  */
  _sendMessageSecondary() {
    let card = this._domiciliationWithoutCard ? this._domiciliationAccount : this.debitCardNumber.length > 0 ? this.debitCardNumber[0] : this.creditCardNumber;
    let cardName = card.title ? card.title.name : card.product.name;
    if (cardName.includes('DIGITAL')) {
      this.sendMessageSecondary = {
        type: 'info',
        message: 'clarifications-management-success-digital-message-secondary',
        icon: 'coronita:info'
      };
    } else {
      this.sendMessageSecondary = {
        type: 'info',
        message: 'clarifications-management-success-page-block-card-info-box',
        icon: 'coronita:info'
      };
    }
  }

  /**
   * @desc Information to show in the success payment when get block card, block payment, both or none
  */
  _validateDataBlockFromSuccess() {
    let product = this.validateCardExist();
    this.additionalInfo = [
      {
        key: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].successScreen?.account(),
        musk: {
          value: this.isDomiciliation ? this.responsePatchSuccessData?.operations[0]?.claimReason?.contract?.id : this.responsePatchSuccessData?.operations[0]?.claimReason?.contract?.number,
          chars: 4,
          simbol: '•'
        },
        class: 'spacing-s'
      },
      this._getMovementType(),
      {
        key: 'clarifications-management-success-modal-reason-clarification',
        value: this.responsePatchSuccessData.reason.name,
        class: 'spacing-s'
      },
      this.infoSuccessScreen
    ];
    const blockCardSection = this._getBlockCardSection(product);
    switch (this.blockServicesFlag) {
      case '01':
        this.additionalInfo.push(
          {
            middleSeparator: true
          },
          ... blockCardSection,
          {
            key: 'clarifications-management-success-page-block-card-date-and-hour',
            value: this.getDateAndTime(),
            class: 'spacing -s'
          },
          {
            messageSecondary: this.sendMessageSecondary
          }
        );
        break;
      case '02':
        this.additionalInfo.push(
          {
            middleSeparator: true
          },
          {
            value: 'clarifications-management-success-page-block-payment-title',
            class: 'spacing-s bold tooltip-fixed-position',
            icon: 'coronita:help',
            id: 4,
            iconSize: '24 info-without-head-two',
          },
          {
            key: 'clarifications-management-success-page-block-payment-concept',
            value: this.successBlockPaymentData?.charge?.description,
            class: 'spacing-s'
          },
        );
        break;
      case '04':
        this.additionalInfo.push(
          {
            middleSeparator: true
          },
          {
            value: 'clarifications-management-success-page-block-payment-title',
            class: 'spacing-s bold tooltip-fixed-position',
            icon: 'coronita:help',
            id: 4,
            iconSize: '24 info-without-head-two',
          },
          {
            key: 'clarifications-management-success-page-block-payment-concept',
            value: this.successBlockPaymentData?.charge?.description,
            class: 'spacing-s'
          },
          {
            middleSeparator: true
          },
          ... blockCardSection,
          {
            key: 'clarifications-management-success-page-block-card-date-and-hour',
            value: this.getDateAndTime(),
            class: 'spacing-s'
          },
          {
            messageSecondary: this.sendMessageSecondary
          }
        );
        break;
      case '08':
        this.additionalInfo.push(
          {
            middleSeparator: true
          },
          {
            value: 'clarifications-management-success-page-block-domi-title',
            class: 'spacing-s bold',
            id: 5,
          },
          {
            key: this.t('clarifications-management-success-page-block-card-date-and-hour'),
            value: this.getDateAndTime(),
            class: 'spacing-s'
          },
          {
            key: 'clarifications-management-success-page-block-domi-concept',
            value: this.responsePatchSuccessData?.operations[0].claimReason.contract.transactions[0].concept,
            class: 'spacing-s'
          },
        );
        break;
    }
    this._sendTextBbvaToSuccessScreen();
    const validBlock = [ '01' ];
    const secondaryMessage = {
      class: 'spacing-l',
      message: {
        header: this.isTransit ? '' : this.t('clarifications-management-success-page-value-experience-title'),
        type: 'info',
        text: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].successScreen?.infoBox?.content(),
        icon: 'coronita:info'
      }
    };
    if (validBlock.includes(this.blockServicesFlag) && this.isTransit) {
      const additionalInfoLength = this.additionalInfo.length;
      this.additionalInfo.splice((additionalInfoLength - 1), 0, secondaryMessage);
      return;
    }

    this.additionalInfo.push(secondaryMessage);
  }

  /**
  * @desc Returns specific object data depending on transit bool value
  * @returns Object that contains movement data
  */

  _getMovementType() {
    return {
      id: 6,
      key: this.isTransit ? 'clarifications-management-success-page-top-info-text-pending' : 'clarifications-management-success-page-top-info-text',
      icon: this.isTransit ? 'coronita:help' : '',
      iconSize: this.isTransit ? '24 info-without-head-two-rows' : '',
      class: this.isTransit ? 'spacing-s tooltip-fixed-position' : '',
      value: this.responsePatchSuccessData.operations[0].claimReason.contract.transactions[0].concept};
  }
  /**
   * @desc Send text BBVA in the success screen
  */
  _sendTextBbvaToSuccessScreen() {
    let regularExpresion = /^0[1,4]/;
    if (this.blockServicesFlag.match(regularExpresion)) {
      this.additionalInfo.splice(this.additionalInfo.length - 1, 0,
        {
          value: 'clarifications-management-success-modal-info-bbva',
          class: 'spacing-s'
        },
      );
    } else {
      this.additionalInfo.push(
        {
          value: 'clarifications-management-success-modal-info-bbva',
          class: 'spacing-s'
        },
      );
    }
  }

  /**
   * @desc Send text email
  */
  _sendTextEmail() {
    if (this.userEmail) {
      const email = this.userEmail.split('*').join('');
      this.additionalInfo.push(
        {
          key: 'clarifications-management-success-modal-email-text',
          value: `•${email}`,
          class: 'spacing-l bold'
        },
      );
    }
  }

  /**
   * Retrieves the user's email address with asterisks removed and prepended with a bullet point.
   * @returns {string} The formatted email address.
   */
  _getEmail() {
    const lowerCaseEmail = this.userEmail.toLowerCase();
    return `•${lowerCaseEmail.replace(/\*/g, '')}`;
  }

  /**
   * @desc Information to show in the success clarification when get block card, block payment, both or none
  */
  _validateDataBlockFromClarificationSuccess() {
    const product = this.validateCardExist();
    this.additionalInfo = [
      {
        key: `clarifications-management-success-modal-amount${this.isDomiciliation ? '-init' : ''}`,
        value: `$${this._parseAmount(this.responsePatchSuccessData.operations[0].requestedAmount?.amount)}`,
        class: 'spacing-s'
      },
      this.provisionalPayment,
      {
        key: 'clarifications-management-success-modal-case-number',
        value: this.isTransit ? this.responsePatchSuccessData.operations[0].claimReason.contract.transactions[0].transactionClaim.id : this.responsePatchSuccessData.operations[0].ticketNumber,
        icon: 'coronita:help',
        id: 2,
        iconSize: '24 info-without-head-two-rows',
        class: 'spacing-s tooltip-fixed-position'
      },
      {
        key: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].successScreen?.account(),
        musk: {
          value: this.isDomiciliation ? this.responsePatchSuccessData?.operations[0]?.claimReason?.contract?.id : this.responsePatchSuccessData?.operations[0]?.claimReason?.contract?.number,
          chars: 4,
          simbol: '•',
          class: 'spacing-s',
        },
      },
      this._getMovementType(),
      {
        key: 'clarifications-management-success-modal-reason-clarification',
        value: this.responsePatchSuccessData.reason.name,
        class: 'spacing-s'
      },
      {
        class: 'spacing-l',
        message: {
          type: 'info',
          text: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].successScreen?.infoBox?.content(),
          icon: 'coronita:info'
        },
      },
      {
        key: this.isTransit ? 'clarifications-management-transit-limit-confirm-date' : 'clarifications-management-success-modal-date-resolution',
        value: this._getClarificationResolutionDate(),
        class: 'spacing-s'
      },
    ];
    const blockCardSection = this._getBlockCardSection(product);
    switch (this.blockServicesFlag) {
      case '01':
        this.additionalInfo.splice(this.additionalInfo.length - 2, 0,
          {
            middleSeparator: true
          },
          ...blockCardSection,
          {
            key: 'clarifications-management-success-page-block-card-date-and-hour',
            value: this.getDateAndTime(),
            class: 'spacing-s'
          },
          {
            messageSecondary: this.sendMessageSecondary
          }
        );
        break;
      case '02':
        this.additionalInfo.splice(this.additionalInfo.length - 2, 0,
          {
            middleSeparator: true
          },
          {
            value: 'clarifications-management-success-page-block-payment-title',
            class: 'spacing-s bold tooltip-fixed-position',
            icon: 'coronita:help',
            id: 4,
            iconSize: '24 info-without-head-two',
          },
          {
            key: 'clarifications-management-success-page-block-payment-concept',
            value: this.successBlockPaymentData?.charge?.description,
            class: 'spacing-s'
          },
        );
        break;
      case '04':
        this.additionalInfo.splice(this.additionalInfo.length - 2, 0,
          {
            middleSeparator: true
          },
          {
            value: 'clarifications-management-success-page-block-payment-title',
            class: 'spacing-s bold tooltip-fixed-position',
            icon: 'coronita:help',
            id: 4,
            iconSize: '24 info-without-head-two',
          },
          {
            key: 'clarifications-management-success-page-block-payment-concept',
            value: this.successBlockPaymentData?.charge?.description,
            class: 'spacing-s'
          },
          {
            middleSeparator: true
          },
          ...blockCardSection,
          {
            key: 'clarifications-management-success-page-block-card-date-and-hour',
            value: this.getDateAndTime(),
            class: 'spacing-s'
          },
          {
            messageSecondary: this.sendMessageSecondary
          }
        );
        break;
      case '08':
        this.additionalInfo.unshift(this.provisionalPayment);
        this.additionalInfo.splice(this.additionalInfo.length - 2, 0,
          {
            middleSeparator: true
          },
          {
            value: 'clarifications-management-success-page-block-domi-title',
            class: 'spacing-s bold',
            id: 5,
          },
          {
            key: 'clarifications-management-success-page-block-card-date-and-hour',
            value: this.getDateAndTime(),
            class: 'spacing-s'
          },
          {
            key: 'clarifications-management-success-page-block-domi-concept',
            value: this.responsePatchSuccessData.operations[0].claimReason.contract.transactions[0].concept,
            class: 'spacing-s'
          },
        );
        break;
    }
    let regularExpresion = /^0[1,4]/;
    if (this.blockServicesFlag.match(regularExpresion)) {
      this.additionalInfo.splice(this.additionalInfo.length - 3, 0,
        {
          value: 'clarifications-management-success-modal-info-bbva',
          class: 'spacing-s'
        },
      );
    } else {
      this.additionalInfo.splice(this.additionalInfo.length - 2, 0,
        {
          value: 'clarifications-management-success-modal-info-bbva',
          class: 'spacing-s'
        },
      );
    }
    if (!this.isDomiciliation) {
      this._sendTextEmail();
    }
  }

  /**
   * @desc Get section of success for block card data
   */
  _getBlockCardSection(product) {
    if (this._previouslyBlockedCard) {
      return {};
    } else {
      return [
        {
          value: 'clarifications-management-success-page-block-card-title',
          class: 'spacing-s bold tooltip-fixed-position',
          icon: 'coronita:help',
          id: 3,
          iconSize: '24 info-without-head-two',
        },
        {
          key: 'clarifications-management-success-page-block-card-case-number',
          value: this.get('reference', this.successBlockCard),
          class: 'spacing-s'
        },
        {
          key: this.get('name', product.title) || this.get('name', product.product),
          musk: {
            value: this.get('number', product),
            chars: 4,
            simbol: '•',
            class: 'spacing-s'
          },
        }
      ];
    }
  }

  /**
   * @desc Information to show successful card blocking
  */
  _validateCardLockSuccess() {
    const product = this.validateCardExist();
    this.additionalInfo = [
      {
        key: 'clarifications-management-success-modal-reason-clarification',
        value: this.isTheftLossAgainst ?  this.responsePostSuccessData?.operations[0]?.detail : this.responsePatchSuccessData?.reason?.name,
        class: 'spacing-s'
      },
      {
        middleSeparator: true
      },
      ...this._validateBlockPaymentSection(),
      {
        value: 'clarifications-management-success-page-block-card-title',
        class: 'spacing-s bold tooltip-fixed-position',
        icon: 'coronita:help',
        id: 3,
        iconSize: '24 info-without-head-two',
      },
      {
        key: 'clarifications-management-success-page-block-card-case-number',
        value: this.get('reference', this.successBlockCard) || this.t('clarifications-management-previously-blocked-card-title'),
        class: 'spacing-s'
      },
      {
        key: this.get('name', product.title) || this.get('name', product.product),
        musk: {
          value: this.get('number', product),
          chars: 4,
          simbol: '•',
          class: 'spacing-s'
        },
      },
      {
        key: 'clarifications-management-success-page-block-card-date-and-hour',
        value: this.getDateAndTime(),
        class: 'spacing-s'
      },
      {
        value: 'clarifications-management-success-modal-info-bbva',
        class: 'spacing-s'
      },
      {
        class: 'spacing-l',
        message: {
          type: 'info',
          text: 'clarifications-management-success-modal-info-box-in-againts',
          icon: 'coronita:info'
        },
      }
    ];
  }

  /**
   * @desc Get payment block section for success tickets
   * @returns Object that contains payment block section
   */
  _validateBlockPaymentSection() {
    return this.blockServicesFlag !== '04' ? [] : [
      {
        value: 'clarifications-management-success-page-block-payment-title',
        class: 'spacing-s bold tooltip-fixed-position',
        icon: 'coronita:help',
        id: 4,
        iconSize: '24 info-without-head-two',
      },
      {
        key: 'clarifications-management-success-page-block-payment-concept',
        value: this.successBlockPaymentData?.charge?.description,
        class: 'spacing-s'
      },
      {
        middleSeparator: true
      },
    ];
  }

  /**
   * @desc Success screen of payment
  */
  _responseData(params) {
    let resultObject = {
      date: new Date(),
      title: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].title,
      origin: {
        avatar: {
          src: 'images/cards/credit_card_dollar.svg',
        },
        product: {
          name: ''
        }
      },
      amountLabel: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].amountLabel,
      chargeAmount: {
        amount: params.operations[0].requestedAmount.amount,
        currency: '$',
        localCurrency: '$',
        class: 'amount-huge-decimals'
      },
      additionalInfo: this.additionalInfo,
      operations: [
        {
          label: this.t('clarifications-management-success-page-operations-share-btn'),
          id: 'share',
          icon: 'coronita:share',
          operative: 'clarificationsBlockCardAgainst'
        }
      ],
      buttons: {
        primary: {
          text: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].successScreen?.buttons?.primary(),
          action: 'go-back'
        },
        secondary: {
          text: this.centralizedTextsSuccess[`texts-${this._getPrefixForTextsObjects()}`].successScreen?.buttons?.secondary,
          action: 'go-to-next',
          class: 'link'
        }
      },
    };
    this._sendDataToSuccesScreen(resultObject, params?.status?.id, params?.estimatedResolutionDate, params?.customerConfirmation);
    this.set('caseNumber', params.operations[0].ticketNumber);
    let payload = {
      clarificationType: this.typology,
      typeAtention: this.process,
      operationNumber: this.caseNumber,
      amount: this.transactionClaim.returnAmount,
      currency: this.transactionClaim.localCurrency,
      primaryCategory: this.cardsOrAccountsTag,
      level1: this.cardsOrAccountsTag,
      level2: this.detailTag,
      level4: this.ANALYTICS_CONSTANTS.FCR,
      productSubType: this.subTypeTag,
      productName: this.productNameTag,
    };
    this._fireGenericDispatchEvent('tag-transacction-success', payload);
  }

  /**
   * @desc Success screen to clarification
  */
  _responseDataClarifications(response) {
    let buttonsSuccess = {};
    if (this.isTheftLossAgainst) {
      buttonsSuccess = {
        primary: {
          text: 'clarifications-management-success-modal-secondary-btn',
          action: 'exit-Page'
        },
        secondary: {
          hidden: true
        }
      };
    } else {
      buttonsSuccess = {
        primary: {
          text: 'clarifications-management-success-modal-primary-btn',
          action: 'go-to-next'
        },
        secondary: {
          text: 'clarifications-management-success-modal-secondary-btn',
          action: 'new-operation',
          class: 'link'
        }
      };
    }
    let resultObject = {
      mainIcon: {
        src: './images/success.svg',
        info: 'Operation Success'
      },
      mainTitle:
      {
        key: this._getDataClarificationMainTitle(),
        class: 'bold lg spacing'
      },
      additionalInfo: this.additionalInfo,
      operations: [
        {
          label: 'clarifications-management-success-modal-share-btn',
          id: 'share',
          icon: 'coronita:share',
          operative: 'clarificationsBlockCardAgainst'
        }
      ],
      buttons: buttonsSuccess
    };
    this._sendDataToSuccesScreen(resultObject, response?.status?.id, response?.estimatedResolutionDate, response?.customerConfirmation);
    this._setTicketsTemplates(response);
    this.set('caseNumber', response?.operations[0]?.ticketNumber);
    let payload = {
      clarificationType: this.isTheftLossAgainst ? this.ANALYTICS_CONSTANTS.AGAINST_MOVEMENT : this.typology,
      typeAtention: this.careAnalytics?.step,
      operationNumber: this.isTheftLossAgainst ? this.successBlockCard?.reference : this.caseNumber,
      amount: this.transactionClaim.returnAmount,
      currency: this.transactionClaim.localCurrency,
      primaryCategory: this.cardsOrAccountsTag,
      level1: this.cardsOrAccountsTag,
      level2: this.detailTag,
      level4: this.isTheftLossAgainst ? 'bloqueo tarjeta' : 'aclaracion',
      status: this.isDomiciliation ? this.ANALYTICS_CONSTANTS.APROVED : this.ANALYTICS_CONSTANTS.REVIEW,
      productSubType: this.subTypeTag,
      productName: this.productNameTag,
    };
    this._fireGenericDispatchEvent('tag-clarification-success', payload);
  }
  /**
   * @desc Returns success ticket main title
   * @Returns String that indicates success ticket main title
  */
  _getDataClarificationMainTitle() {
    return (this.isTheftLossAgainst ? 'clarifications-management-success-block-card-title' : (this.isTransit ? 'clarifications-management-transit-main-title' : 'clarifications-management-success-modal-title'));
  }
  /**
   * @desc Get date and time of device
  */
  getDateAndTime() {
    let time = moment().format('HH:mm');
    let date = moment().format('DD MMMM YYYY');
    return `${date}, ${time} h`;
  }

  /**
   * @desc Get exact time to know if in hours of BBVA line
  */
  _getHour() {
    let hour = moment().format('HH:mm');
    this.set('hourTime', hour);
    return hour;
  }

  /**
   * @desc Set data of succes screen in component
   * @param {Object} resultObject
   * @param {String} statusInfo
   * @param {String} dateInfo
   * @param {Boolean} customerConfirmation
  */
  _sendDataToSuccesScreen(resultObject, statusInfo, dateInfo, customerConfirmation) {
    if (this.isTransit) {
      this._fireGenericDispatchEvent('send-global-data-to-success-screen-core', 'core');
      this._fireGenericDispatchEvent('set-header-classname', 'header--core-ios');
    } else {
      this._fireGenericDispatchEvent('set-header-classname', 'header--dark-success');
    }
    resultObject = this._addFieldsToSuccessObject(resultObject, customerConfirmation);
    this._fireGenericDispatchEvent('send-global-data-to-success-screen', resultObject);
    this._fireGenericDispatchEvent('send-clarifications-list-flag', this.clarificationsList);
    this._fireGenericDispatchEvent('send-data-to-success-screen', {
      result: resultObject,
      status: statusInfo,
      date: dateInfo,
      isDebitType: null
    });
  }

  /**
   * @desc Exit Clarification Management Care Page
  */
  exitPage() {
    if (this.existingContent) {
      this.exitFromTheClarificationPage();
    } else {
      this._returnToPage();
    }
  }

  /**
   * @desc Function for return to movement detail
   */
  returnMovementDetail() {
    this._returnToPage();
  }

  /**
   * @desc Modal to exit Clarification Management Care Page
  */
  exitFromTheClarificationPage() {
    const alertLeaveOperativeMock = {
      code: 'LEAVE-OPERATIVE',
      selectedConfig: {
        className: 'error',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'clarifications-management-button-exit',
        cancelBtLabel: 'clarifications-management-button-continue',
        template: {
          type: 'paragraphs',
          values: [
            { icon: 'coronita:alert' },
            { text: 'alert-EXIT-clarificationsManagement-message' }
          ]
        }
      }
    };
    this._fireGenericDispatchEventModals(alertLeaveOperativeMock);
  }

  /**
   * @desc Function to back dasboard with native button
  */
  cancelledBackNavigation(backNavigation) {
    if (backNavigation && ((backNavigation.value || {}).cancelledNavigation || {}).currentPage === this.pageName) {
      if (this.pageName.includes('Success')) {
        window.cells.Router.navigationStack.navStack.splice(2);
      }
      this._fireGenericDispatchEvent('back-navigation-pressed-dashboard');
    }
  }

  /**
   * @desc Function to get folio number
  */
  getCaseNumber(response) {
    let numberCase = response.status.name;
    let caseArray;
    caseArray = numberCase.split(' ');
    this.set('existCaseNumber', caseArray[caseArray.length - 4]);
  }

  /**
   * radioSelected value from user interaction
   * @param event
   * @private
   */
  radioCareSelectedObserver(evt) {
    const analyticsConstants = {
      '02': this.ANALYTICS_CONSTANTS.CARD_LOST,
      '03': this.ANALYTICS_CONSTANTS.PROBLEM_COMMERCE,
      '04': this.ANALYTICS_CONSTANTS.CARD_STOLEN,
    };
    const analyticsValue = analyticsConstants[evt.radioSelected.type];
    if (analyticsValue) {
      this._fireAppStartedAnalytics(analyticsValue);
    }
  }

  /**
   * @desc Send analytics when change radio buttons at first step
   * @param {String} type Blocking type id
   */
  _radioAnalitics(type) {
    const analyticsConstants = {
      '01': this.ANALYTICS_CONSTANTS.NO_AUTORIZED,
      '02': this.ANALYTICS_CONSTANTS.CARD_LOST,
      '03': this.ANALYTICS_CONSTANTS.PROBLEM_COMMERCE,
      '04': this.ANALYTICS_CONSTANTS.CARD_STOLEN,
    };
    const analyticsValue = analyticsConstants[type];
    if (analyticsValue) {
      this._fireAppStartedAnalytics(analyticsValue);
    }
    this.set('process', analyticsValue);
  }

  /**
   * @desc Set typology of analytic for attention type step
   * @param {object} evt Event fired by change of radio button at attention type step
   */
  setValueRadioAttentionType(evt) {
    if (evt.radioSelected.type === 'true') {
      this.set('typology', this.ANALYTICS_CONSTANTS.REQUEST_PAYMENT);
    }
    if (evt.radioSelected.type === 'false') {
      this.set('typology', this.ANALYTICS_CONSTANTS.START_ACLARATION);
    }
  }

  /** @desc Fire app on click event to send analytics */
  _fireClickStartAnalytics() {
    const product = this.validateCardExist();
    if (this.productType === 'CARDS') {
      this.set('cardsOrAccountsTag', this.ANALYTICS_CONSTANTS.CARDS);
      this.set('detailTag', this.ANALYTICS_CONSTANTS.CREDIT_TAG);
      this.set('movementsTag', this.ANALYTICS_CONSTANTS.DETAIL_TAG);
      this.set('levelFour', this.ANALYTICS_CONSTANTS.MOVEMENTS);
      this.set('subTypeTag', this.ANALYTICS_CONSTANTS.CREDIT_CARDS);
      this.set('productNameTag', product.title ? this.get('name', product.title).toLowerCase() : this.get('name', product.product).toLowerCase());
      this.set('stepTag', this.t('clarifications-management-header-text').toLowerCase());
    } else if (this.productType === 'ACCOUNTS') {
      this.set('cardsOrAccountsTag', this.ANALYTICS_CONSTANTS.ACCOUNTS);
      this.set('detailTag', this.ANALYTICS_CONSTANTS.DETAIL_TAG);
      this.set('movementsTag', this.ANALYTICS_CONSTANTS.MOVEMENTS);
      this.set('productNameTag', product.title ? this.get('name', product.title).toLowerCase() : this.get('name', product.product).toLowerCase());
      this.set('stepTag', this.t('clarifications-management-header-text').toLowerCase());
    }
    let payload = {
      amount: this.transactionClaim.returnAmount,
      currency: this.transactionClaim.localCurrency,
      primaryCategory: this.cardsOrAccountsTag,
      level1: this.cardsOrAccountsTag,
      level2: this.detailTag,
      level3: this.movementsTag,
      level4: this.levelFour,
      productSubType: this.subTypeTag,
      productName: this.productNameTag,
      stepStart: this.stepTag
    };
    this._fireGenericDispatchEvent('click-start-tags', payload);
  }

  /**
   * @desc Fire 'app-started' event to send analytics
   * @param {String} step
   */
  _fireAppStartedAnalytics(step) {
    if (!this.appStartedFired !== this.appStartedFire) {
      this.careAnalytics.step = step;
      let payload = {
        amount: this.transactionClaim.returnAmount,
        currency: this.transactionClaim.localCurrency,
        primaryCategory: this.cardsOrAccountsTag,
        level1: this.cardsOrAccountsTag,
        level2: this.detailTag,
        level4: this.ANALYTICS_CONSTANTS.REPORTING_REASON,
        productSubType: this.subTypeTag,
        productName: this.productNameTag,
        step: this.careAnalytics.step
      };
      this._fireGenericDispatchEvent('app-started', payload);
      this.set('appStartedFired', true);
    }
  }

  /** @desc Fire 'app-page-visit' event to send analytics */
  _fireAppVisitAnalytics() {
    let payload = {
      amount: this.transactionClaim.returnAmount,
      currency: this.transactionClaim.localCurrency,
      primaryCategory: this.cardsOrAccountsTag,
      level1: this.cardsOrAccountsTag,
      level2: this.detailTag,
      level4: this.ANALYTICS_CONSTANTS.REPORTING_REASON,
      productSubType: this.subTypeTag,
      productName: this.productNameTag,
    };
    this.set('appStartedFired', false);
    this._fireGenericDispatchEvent('app-page-visit', payload);
  }

  /**
   * @desc Fire event to send analytics depending on the block service flag
   */
  _fireBlocksTag() {
    const serviceFlagOptions = {
      '02': 'block-recurrent-analytics',
      '04': 'block-recurrent-analytics',
      '01': 'block-card-analytics',
      '08': 'block-direct-debit-analytics'
    };
    this._fireGenericDispatchEvent(serviceFlagOptions[this.blockServicesFlag], {
      level1: this.cardsOrAccountsTag,
      level2: this.detailTag,
    });
  }

  /**
   * @desc Send second modal depends of the identifier modals
  */
  eclModalType(params) {
    let modalText = {};
    if (this.identifierModals === 'MCN') {
      modalText.code = 'CLARIFICATIONS-MANAGEMENT-CHIP-NIP';
      modalText.principalText = this.t('clarifications-management-modal-chip-principal-text');
      modalText.secondaryText = this.t('clarifications-management-present-card');
      modalText.eventName = 'send-icon-help-from-modal-chip-nip';
    } else if (this.identifierModals === 'MCV') {
      modalText.code = 'CLARIFICATIONS-MANAGEMENT-CVV';
      modalText.principalText = this.t('clarifications-management-modal-cvv-principal-text');
      modalText.secondaryText = this.t('clarifications-management-digital-card');
      modalText.eventName = 'send-icon-help-from-modal-cvv';
    } else if (this.identifierModals === 'MTM') {
      modalText.code = 'CLARIFICATIONS-MANAGEMENT-TOKEN';
      modalText.principalText = this.t('clarifications-management-modal-token-principal-text');
      modalText.secondaryText = this.t('clarifications-management-mobile-token');
      modalText.eventName = 'send-icon-help-from-modal-token';
    }
    const product = this.validateCardExist();
    const modalConfig = {
      code: modalText.code,
      primaryButtonClass: 'primary',
      selectedConfig: {
        openMaximized: true,
        className: 'blue-header clarifications-management-icon-modal image--md image--sd',
        heroImage: this.imageIconCaution,
        title: this.t('clarifications-management-header-text'),
        acceptBtLabel: this.t('clarifications-management-modal-case-against-online-primary-btn'),
        cancelBtLabel: this.t('clarifications-management-button-modal-secondary-btn'),
        template: {
          type: 'paragraphs',
          values: [
            { text: modalText.principalText,
              class: 'spacing'},
            {
              text: this.get('name', product.title) ? this.get('name', product.title) : this.get('name', product.product),
              class: 'grey'
            },
            {
              musk: {
                value: this.get('number', product),
                chars: 4,
                simbol: '•',
              },
            },
            {
              text: ' ',
              class: 'spacing'
            },
            {
              text: ' ',
              divider: true,
              class: 'spacing'
            },
            {
              text: this.t('clarifications-management-success-modal-movement'),
              class: 'strong spacing',
            },
            {
              text: this.transactionClaim.establishmentName,
              class: 'grey'
            },
            {
              text: `$${this.returnAmountOffer}`,
              class: 'spacing'
            },
            {
              text: this.t('clarifications-management-operation-type'),
              class: 'spacing--s grey icon-info-open-modal',
              iconEvent: 'coronita:help',
              eventName: modalText.eventName
            },
            {
              text: modalText.secondaryText,
            }
          ]
        }
      }
    };
    let payload = {
      level1: this.cardsOrAccountsTag,
      level2: this.detailTag,
      level4: this.ANALYTICS_CONSTANTS.AGAINST_MOVEMENT,
    };
    if (params && params.isSecondModal && params.isSecondModal === true) {
      modalConfig.time = 200;
    }
    this._fireGenericDispatchEventModals(modalConfig);
    this._fireGenericDispatchEvent('send-ecl-modals', payload);
  }

  /**
   *
   * @returns Obj modalText, Obj additionalInfoBox
   * @desc This method returns 2 objs about the modals
   */
  _validationIdentifyModals() {
    const modalTextMappings = {
      'MCNTL': this._getModalTextForMCNTL,
      'MCVTL': this._getModalTextMCVTL,
      'MHRSTL': this._getModalTextMHRSTL
    };

    const modalText = modalTextMappings[this.identifierModals]
      ? modalTextMappings[this.identifierModals].call(this)
      : {};

    const additionalInfoBox = this.identifierModals === 'MHRSTL'
      ? this._getAdditionalInfoBox()
      : {};
    return {
      modalText,
      additionalInfoBox,
    };
  }

  /**
   * @desc Get specific texts for MCNTL modal
   * @returns {Object}
   */
  _getModalTextForMCNTL() {
    return {
      code: 'CLARIFICATIONS-MANAGEMENT-CHIP-NIP-THEFT-LOSS',
      heroImage: this.imageIconCaution,
      principalText: this.t('clarifications-management-modal-chip-theft-loss-principal-text'),
      secondaryText: this.t('clarifications-management-present-card'),
      type: 'warning',
      icon: 'coronita:caution',
      message: this.t('clarifications-management-message-chip-theft-loss')
    };
  }

  /**
   * @desc Get specific texts for MCTVL modal
   * @returns {Object}
   */
  _getModalTextMCVTL() {
    return {
      code: 'CLARIFICATIONS-MANAGEMENT-CVV-THEFT-LOSS',
      heroImage: this.imageIconCaution,
      principalText: this.t('clarifications-management-modal-cvv-theft-loss-principal-text'),
      secondaryText: this.t('clarifications-management-shopping-digital'),
      type: 'warning',
      icon: 'coronita:caution',
      message: this.t('clarifications-management-message-chip-theft-loss')
    };
  }

  /**
   * @desc Get specific texts for MHRSTL modal
   * @returns {Object}
   */
  _getModalTextMHRSTL() {
    return {
      code: (this._previouslyBlockedCard) ? 'CLARIFICATIONS-MANAGEMENT-HRS-THEFT-LOSS-CARD-BLOCKED' : 'CLARIFICATIONS-MANAGEMENT-HRS-THEFT-LOSS',
      heroImage: './images/clarifications/phone-assistance.svg',
      principalText: (this._previouslyBlockedCard) ? this.t('clarifications-management-modal-hrs-theft-loss-principal-text-blocked-card') : this.t('clarifications-management-modal-hrs-theft-loss-principal-text'),
      secondaryText: this.t('clarifications-management-unidentified'),
      type: 'info-dark',
      icon: 'coronita:info',
      message: (this._previouslyBlockedCard) ? this.t('clarifications-management-message-hrs-theft-loss-previously-blocked') : this.t('clarifications-management-message-hrs-theft-loss')
    };
  }

  /**
   * @desc Send second modal Theft and Loss
   * @param {Object} params
  */
  eclModalTypeTheftLoss(params) {
    this.flagModalTheftLoss = true;
    const validateModal = this._validationIdentifyModals();
    const modalText = validateModal.modalText;
    const additionalInfoBox = validateModal.additionalInfoBox;
    const product = this.validateCardExist();
    const isAgainstPerTimeTL = this.identifierModals === 'MHRSTL';
    const optionalSpace = isAgainstPerTimeTL ? [
      {
        text: ' ',
        class: 'spacing'
      },
      {
        text: ' ',
        divider: true,
        class: 'spacing--xs'
      }] : [];
    const topInfoText = isAgainstPerTimeTL ? this.t('clarifications-management-success-page-top-info-text') : this.t('clarifications-management-success-modal-block-card');
    const modalConfig = {
      code: modalText.code,
      primaryButtonClass: 'primary',
      selectedConfig: {
        openMaximized: true,
        className: 'blue-header clarifications-management-icon-modal',
        heroImage: modalText.heroImage,
        title: this.t('clarifications-management-header-text'),
        acceptBtLabel: (this._previouslyBlockedCard) ? this.t('clarifications-management-button-modal-primary-btn-go-out') : this.t('clarifications-management-button-modal-secondary-btn-continue'),
        cancelBtLabel: (this._previouslyBlockedCard) ? false : this.t('clarifications-management-button-modal-primary-btn-go-out'),
        template: {
          type: 'paragraphs',
          values: [
            {
              text: modalText.principalText,
              class: 'spacing'
            },
            {
              musk: {
                label: this.get('name', product.title) ? this.get('name', product.title) : this.get('name', product.product),
                value: this.get('number', product),
                chars: 4,
                simbol: '•',
              }
            },
            ...optionalSpace,
            {
              text: topInfoText,
              class: 'strong spacing',
            },
            {
              text: this.transactionClaim.establishmentName,
              class: 'grey'
            },
            {
              text: `$${this.returnAmountOffer}`,
              class: 'spacing'
            },
            {
              text: this.t('clarifications-management-operation-type'),
              class: 'spacing--s grey'
            },
            {
              text: modalText.secondaryText,
            },
            {
              type: modalText.type,
              icon: modalText.icon,
              message: modalText.message,
              class: 'min-bottom-space'
            },
            additionalInfoBox
          ]
        }
      }
    };
    const payload = {
      level1: this.cardsOrAccountsTag,
      level2: this.detailTag,
      level4: this.ANALYTICS_CONSTANTS.AGAINST_MOVEMENT,
    };
    if (params && params.isSecondModal && params.isSecondModal === true) {
      modalConfig.time = 200;
    }
    this._fireGenericDispatchEventModals(modalConfig);
    this._fireGenericDispatchEvent('send-ecl-modals', payload);
  }

  /**
   * @desc Get additional Info box for modal
   */
  _getAdditionalInfoBox() {
    if (this._previouslyBlockedCard) {
      return {
        icon: 'coronita:info',
        message: this.t('clarifications-management-message-hrs-theft-loss-previously-blocked-additional-info-box'),
        type: 'info-dark'
      };
    } else {
      return {};
    }
  }

  /**
   * @desc Build against chip plus nip modal for loss and stolen flow
   * @param {Object} params
   */
  _eclModalNipBlockedCard(params = {}) {
    const modalText = {
      code: (this._previouslyBlockedCard) ? 'CLARIFICATIONS-MANAGEMENT-CHIP-NIP' : 'CLARIFICATIONS-MANAGEMENT-CHIP-NIP-BLOCKED-CARD',
      principalText: (this._previouslyBlockedCard) ? this.t('clarifications-management-modal-chip-principal-text-card-previously-blocked') : this.t('clarifications-management-modal-chip-principal-text-card-not-blocked'),
      secondaryText: this.t('clarifications-management-present-card'),
      eventName: 'send-icon-help-from-modal-chip-nip',
    };
    const product = this.validateCardExist();
    const modalConfig = {
      code: modalText.code,
      primaryButtonClass: 'primary',
      selectedConfig: {
        openMaximized: true,
        className: 'blue-header clarifications-management-icon-modal image--md image--sd',
        heroImage: this.imageIconCaution,
        title: this.t('clarifications-management-header-text'),
        acceptBtLabel: (this._previouslyBlockedCard) ? this.t('clarifications-management-button-modal-primary-btn-go-out') : this.t('clarifications-management-button-continue'),
        cancelBtLabel: (this._previouslyBlockedCard) ? false : this.t('clarifications-management-button-modal-secondary-btn'),
        template: {
          type: 'paragraphs',
          values: [
            {
              text: modalText.principalText,
              class: 'spacing'
            },
            {
              musk: {
                label: this.get('name', product.title) ? this.get('name', product.title) : this.get('name', product.product),
                value: this.get('number', product),
                chars: 4,
                simbol: '•',
              }
            },
            {
              text: this.t('clarifications-management-success-modal-block-card'),
              class: 'strong spacing',
            },
            {
              text: this.transactionClaim.establishmentName,
              class: 'grey'
            },
            {
              text: `$${this.returnAmountOffer}`,
              class: 'spacing'
            },
            {
              text: this.t('clarifications-management-operation-type'),
              class: 'spacing--s grey'
            },
            { text: modalText.secondaryText },
            {
              icon: 'coronita:info',
              iconClass: 'icon-size-24',
              message: (this._previouslyBlockedCard) ? this.t('clarifications-management-success-modal-info-box-in-againts') : this.t('clarifications-management-success-modal-info-box-in-againts-nip'),
              type: (this._previouslyBlockedCard) ? 'info-dark' : 'warning-dark'
            }
          ]
        }
      }
    };
    const payload = {
      level1: this.cardsOrAccountsTag,
      level2: this.detailTag,
      level4: this.ANALYTICS_CONSTANTS.AGAINST_MOVEMENT,
    };
    if (params && params.isSecondModal && params.isSecondModal === true) {
      modalConfig.time = 200;
    }
    this._fireGenericDispatchEventModals(modalConfig);
    this._fireGenericDispatchEvent('send-ecl-modals', payload);
  }

  /**
  * @desc Open second modal case against online
  */
  tooltipHelpCaseAgainstOnline() {
    const clarificationsManagementSecondModalCaseAgainstOnline = {
      code: 'ICON-INFO-CASE-AGAINST-ONLINE',
      primaryButtonClass: 'primary',
      time: 100,
      selectedConfig: {
        onAcceptDetail: { isSecondModal: true },
        onCancelDetail: { isSecondModal: true },
        openMaximized: true,
        className: 'faqsPointsRedeem',
        title: this.titleCaseOnline,
        acceptBtLabel: this.t('clarifications-management-modal-info-btn'),
        template: {
          type: 'paragraphs',
          values: [
            {
              icon: 'coronita:help',
              iconClass: 'icon-size-24',
              class: 'info'
            },
            {
              text: this.t('clarifications-management-first-text-tooltip'),
              class: 'grey'
            },
            {
              text: this.t('clarifications-management-second-text-tooltip-case-against-online'),
              class: 'grey'
            },
          ]
        }
      }
    };
    this._fireGenericDispatchEventModals(clarificationsManagementSecondModalCaseAgainstOnline);
  }
  /**
   * @desc Make scrooll to specific step
   */
  _scrollBottom(step, flag, init = false) {
    if (flag === 'next') {
      step++;
    }
    if (step === 2 || step === 3 || init) {
      const position = (step === 2 || init) ? 0 : 1;
      setTimeout(() => {
        document.getElementsByTagName('cells-step-radio-buttons')[position]?.shadowRoot.querySelector('cells-step').querySelector('cells-st-button').scrollIntoView({ behavior: 'smooth'});
      }, 500);
    }
    if (step === 4 || step === 5) {
      let position = (step === 4) ? 0 : 1;
      position = (this.blockServicesFlag === '01') ? 1 : position;
      setTimeout(() => {
        document.getElementsByTagName('cells-step-conditions')[position]?.shadowRoot.querySelector('cells-step').querySelector('cells-st-button').scrollIntoView({ behavior: 'smooth'});
      }, 500);
    }
  }

  /**
   *
   * @desc Add a separator character to an string
   * @param {Number} rawAmountInt
   */
  _addSeparatorsToAmount(rawAmountInt) {
    const separator = ',';
    const rawAmountStrArray  = rawAmountInt.toString().split('.');
    const integerSide = rawAmountStrArray[0].replace(/(\d)(?=(\d{3})+$)/g,  `$1${separator}`);
    const decimalSide = rawAmountStrArray[1];
    return `${integerSide}.${decimalSide}`;
  }

  /**
   * @desc Fire analytics for otp
   * @param {Object} param
   */
  fireAnalyticsOtp(param) {
    const signatureType = this.signatureTypes[param?.signatureType];
    const payload = {
      level1: this.cardsOrAccountsTag,
      level2: this.detailTag,
      level4: signatureType
    };
    this._fireGenericDispatchEvent('fire-opt-analytic-channel', payload);
  }

  /**
   * @desc Navigate to clarifications list care page
   */
  navigatePage() {
    this._fireGenericDispatchEvent('navigate-to-clarification-list-care');
  }
}

customElements.define(GlomoOpxClarificationsManagementDm.is, GlomoOpxClarificationsManagementDm);
