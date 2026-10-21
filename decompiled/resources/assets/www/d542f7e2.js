import"./78038caa.js";import{z as t,a8 as e,ac as i,ad as s,a9 as a,a as n,L as l,ak as o,h as r,i as d,bT as b,bU as c,ag as m,b6 as h,aF as g,U as u}from"./952f98a9.js";import{C as p}from"./216055dc.js";import"./af658024.js";import"./7f3d7ca9.js";import"./7e03d322.js";import"./67b05b69.js";import{B as v}from"./aaa76bb8.js";import"./50eb5f21.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./9d12c561.js";var f=t`:host {
  display: block;
  box-sizing: border-box;
  padding: 1rem 1rem 1.5rem;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

bbva-text {
  margin-bottom: 0.5rem;
}

.list-simple {
  padding: 0.5rem 0 0.5rem;
}
.list-simple p {
  margin: 0;
  font-size: var(--typographyTypeSmall, ${e(i.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e(s.typeSmall)});
}
.list-simple-key {
  color: var(--colorsSecondary500, ${e(a.secondary500)});
}
.list-simple-value {
  color: var(--colorsSecondary600, ${e(a.secondary600)});
}

.link-container {
  padding-top: 1rem;
}

.title {
  text-transform: uppercase;
}

.notification_message {
  text-align: center;
  background-color: var(--colorsPrimarySubduedLight, ${e(a.primarySubduedLight)});
  padding: 2rem 1rem;
  margin: 1.5rem 0;
}
.notification_message bbva-core-icon {
  --bbva-core-icon-fill-color: var(--colorsPrimarySubdued, ${e(a.primarySubdued)});
}
.notification_message bbva-text {
  margin-top: 1rem;
}

.list-action {
  display: flex;
  justify-content: space-between;
  padding: 1rem 0 0;
}

bbva-button-icon {
  --bbva-button-icon-size: rem(24px);
  --bbva-button-icon-background: var(--colorsPrimaryCoreLightened, ${e(a.primaryCoreLightened)});
  --bbva-button-icon-color-focus: var(--colorsPrimaryMedium, ${e(a.primaryMedium)});
  --bbva-button-icon-color: var(--colorsPrimaryMedium, ${e(a.primaryMedium)});
  --bbva-button-icon-background-focus: var(--colorsPrimaryCoreLightened, ${e(a.primaryCoreLightened)});
}

bbva-form-select {
  padding: 1rem 0;
}

bbva-form-text.spacing-bottom-text {
  padding-bottom: 2rem;
}

.confirm-zone {
  text-align: center;
}

bbva-button-default[variant=secondary] {
  border: none;
}

bbva-button-default[variant=secondary]:active {
  background: transparent;
}

bbva-notification-message {
  --bbva-notification-message-icon-color: var(--colorsPrimarySubdued, ${e(a.primarySubdued)});
}
`;const _="bbva-aggregation-editable-list-list-item-country",I="bbva-aggregation-editable-list-list-item-number",S={ADD:"aggregation-editable-list-add-button-tapped",EDIT:"aggregation-editable-list-edit-button-tapped",SAVE_RESIDENCES:"aggregation-editable-list-save-edited-residences",CANCEL_EDIT:"aggregation-editable-list-cancel-edit-residence",EXIT:"aggregation-editable-list-exit-button-tapped",DELETE_RESIDENCE:"aggregation-editable-list-delete-residence-button-tapped"},L={ADDITIONAL_RESIDENCES:"aggregation-editable-list-additional-residences",ADD_RESIDENCES:"aggregation-editable-list-add-residences"},y={VALIDATE_FORMAT:"aggregation-editable-list-request-validate-format"},E={TO_LIST:"aggregation-editable-list-back-to-list",TO_STEPS:"aggregation-editable-list-back-to-steps"},x=(t,e,i)=>{t.dispatchEvent(new CustomEvent(e,{detail:i,bubbles:!0,composed:!0}))},$=t=>null!=t&&"object"==typeof t,C=(t,e)=>{const i=Object.keys(t),s=Object.keys(e);if(i.length!==s.length)return!1;for(const s of i){const i=t[s],a=e[s],n=$(i)&&$(a);if(n&&!C(i,a)||!n&&i!==a)return!1}return!0};class D extends(n(p(l))){static get is(){return"bbva-aggregation-editable-list"}static get scopedElements(){const t=[b,v,c,m,h,g,u];return D.scopedElementsFromClasses(t)}static get properties(){return{formMode:{type:Boolean,attribute:"form-mode"},titleLabel:{type:String,attribute:"title-label"},infoMessage:{type:String,attribute:"info-message"},descriptionLabel:{type:String,attribute:"description-label"},linkLabel:{type:String,attribute:"link-label"},formSelectlabel:{type:String,attribute:"form-select-label"},formTextLabel:{type:String,attribute:"form-text-label"},notificationMessage:{type:String,attribute:"notification-message"},limitAddItems:{type:Number,attribute:"limit-add-items"},selectOptionsList:{type:Array},editableList:{type:Array},_editableListSnapshot:{type:Array,attribute:!1},_indexItemWillBeDeleted:{type:Number,attribute:!1},_indexItemWillBeEdited:{type:Number,attribute:!1},_selectedItemForEdit:{type:Object,attribute:!1},_selectedItemForEditSnapShot:{type:Object,attribute:!1},_indexOfSelectedCountry:{type:Number,attribute:!1},_timesInfoHasChanged:{type:Number},inputClass:{type:String}}}constructor(){super(),this._editableList=[],this._editableItem={},this._editableListSnapshot=[],this._editableItemSnapshot={},this.selectOptionsList=[],this.formMode=!1,this._timesInfoHasChanged=0}static get styles(){return[f,o("bbva-aggregation-editable-list-shared-styles")]}set editableList(t){const e=this._editableList;this._editableList=t,0===this._timesInfoHasChanged&&(this._editableListSnapshot=Object.assign([],t)),this._timesInfoHasChanged+=1,this._validateResidencesListAnalytic(this._editableList),this.requestUpdate("editableList",e)}_validateResidencesListAnalytic(t){const e=t.length?L.ADDITIONAL_RESIDENCES:L.ADD_RESIDENCES;x(this,e)}get editableList(){return this._editableList}set editableItem(t){const e=this._editableItem;this._editableItem=t,0===this._timesInfoHasChanged&&(this._editableItemSnapshot={...t}),this._timesInfoHasChanged+=1,this.requestUpdate("editableItem",e)}get editableItem(){return this._editableItem}updated(t){t.has("editableItem")&&this.completeForm()}async completeForm(){await this.updateComplete,this.editableItem&&this.editableItem.identifierFiscalNumber&&(this.formInput.value=this.editableItem.identifierFiscalNumber)}get saveButton(){return this.shadowRoot.querySelector("#saveBtn")}get formSelect(){return this.shadowRoot.querySelector("#form_select")}get formInput(){return this.shadowRoot.querySelector("#form_text")}setEditedNonPresentialResidence(t){"number"==typeof this._indexItemWillBeEdited?(this.editableList[this._indexItemWillBeEdited]=t,this._indexItemWillBeEdited=void 0):this.editableList.push(t),this._validateSaveResidencesButton(),this.requestUpdate()}resetIndexOnCancelEdit(){this._indexItemWillBeEdited=void 0}resetFormView(t){t&&!t.value&&(this.formSelect.value="",this.formInput.value="",this.selectOptionsList=[],this.editableItem={},this._editableItemSnapshot={},this._timesInfoHasChanged=0,this._disableSaveButton(!0))}resetListView(){this.editableList=[],this._editableListSnapshot=[],this._timesInfoHasChanged=0,this._disableSaveButton(!0)}_handleEditClicked(t){this._indexItemWillBeEdited=t,x(this,S.EDIT,{currentList:Object.assign([],this.editableList),selectedIndex:t})}_handleDeleteClicked(t){this._indexItemWillBeDeleted=t,x(this,S.DELETE_RESIDENCE,"DELETE_RESIDENCE")}_renderListAction(t,e){return r`
      <div class="list-action">
        <bbva-text id="item${e}Title"
          tag="span" class="label"
          text="${this.t(t)} ${e+1}"
          font-weight="500" size="M"></bbva-text>
        <div>
          <bbva-button-icon
            id="item${e}editBtn"
            icon="coronita:edit"
            @click="${()=>this._handleEditClicked(e)}">
          </bbva-button-icon>
          <bbva-button-icon
            id="item${e}deleteBtn"
            icon="coronita:trash"
            @click="${()=>this._handleDeleteClicked(e)}">
          </bbva-button-icon>
        </div>
      </div>
    `}_renderAdditionalResidence(t,e,i,s){return r`
      <div id="item${i+s}" class="list-simple">
        <p id="item${i+s}Key" class="list-simple-key">${this.t(t)}</p>
        <p id="item${i+s}Value" class="list-simple-value">${e}</p>
      </div>
    `}_renderList(t){return r`${t.map(((t,e)=>r`
      ${this._renderListAction("bbva-aggregation-editable-list-list-item-title",e)}
      ${this._renderAdditionalResidence(_,t.name,e,"Country")}
      ${this._renderAdditionalResidence(I,t.identifierFiscalNumber,e,"Nif")}
    `))}`}get listContent(){return r`
      ${this.editableList.length?this._renderList(this.editableList):null}
      ${this.editableList.length<this.limitAddItems?r`
        <div class="link-container">
          <bbva-link id="addItemLink" @click="${()=>{x(this,S.ADD,{currentList:Object.assign([],this.editableList)})}}">
            ${this.t(this.linkLabel)}
          </bbva-link>
        </div>
      `:null}
    `}_handleSelectChange(){this.editableItem.id=this.formSelect.value,this.editableItem.name=(this.formSelect._selectedLabel||"").trim(),this.editableItem.identifierFiscalNumber&&this._disableSaveButton(C(this.editableItem,this._editableItemSnapshot))}_handleInputChange(){this.editableItem.identifierFiscalNumber=this.formInput.value,this.editableItem.id&&this._disableSaveButton(C(this.editableItem,this._editableItemSnapshot))}get formContent(){return r`
      ${this.selectOptionsList&&this.selectOptionsList.length?r`
        <bbva-form-select id="form_select" optional-label=""
          label="${this.t(this.formSelectlabel)}"
          @change="${this._handleSelectChange}">
          ${this.selectOptionsList.map((t=>r`
            <bbva-form-option value="${t.id}"
              selected="${d(t.selected)}">
              ${t.name}
            </bbva-form-option>
          `))}
        </bbva-form-select>
      `:null}
      <bbva-form-text id="form_text"
        class="${d(this.inputClass)}"
        @change="${this._handleInputChange}"
        optional-label=""
        label="${this.t(this.formTextLabel)}"
        info-message="${this.infoMessage?this.t(this.infoMessage):""}">
      </bbva-form-text>
    `}_handleSaveButtonTapped(){this.formMode?x(this,y.VALIDATE_FORMAT,this.editableItem):(x(this,S.SAVE_RESIDENCES,Object.assign([],this.editableList)),this.handleExitList())}validateCancelLinkTapped(){this.formMode?(x(this,S.CANCEL_EDIT),x(this,E.TO_LIST)):C(this.editableList,this._editableListSnapshot)?this.handleExitList():x(this,S.EXIT,"EXIT_LIST")}get _confirmZone(){return r`
      <div class="confirm-zone">
        <bbva-button-default id="saveBtn"
          disabled
          @click="${this._handleSaveButtonTapped}"
          class="confirm-button button primary"
          text="${this.t("bbva-aggregation-editable-list-save")}">
        </bbva-button-default></br>
        <bbva-button-default id="cancelBtn"
          variant="secondary"
          @click="${this.validateCancelLinkTapped}"
          text="${this.t("bbva-aggregation-editable-list-cancel")}">
        </bbva-button-default>
      </div>
    `}handleExitList(){this.resetListView(),x(this,E.TO_STEPS)}handleConfirmDeleteItem(){void 0!==this._indexItemWillBeDeleted&&(this.editableList.splice(this._indexItemWillBeDeleted,1),this._validateSaveResidencesButton(),this._indexItemWillBeDeleted=void 0)}_validateSaveResidencesButton(){this._disableSaveButton(C(this.editableList,this._editableListSnapshot))}_disableSaveButton(t){this.saveButton.disabled=t}_renderNotificationMessage(t){return r`
      <div id="notificationMessage" class="notification_message">
        <bbva-core-icon size="22" icon="coronita:info"></bbva-core-icon>
        <bbva-text alignment="center"
          class="" text="${this.t(t)}" size="XS"></bbva-text>
      </div>
    `}render(){return r`
      <slot></slot>
      <bbva-text id="aggregationListTitle"
        class="title" tag="span" text="${this.titleLabel?this.t(this.titleLabel):""}"
        font-weight="500" size="XS"></bbva-text>
      <bbva-text id="aggregationListDesc"
        text="${this.t(this.descriptionLabel)}" font-weight="300"
        tag="span" size="S"></bbva-text>
      ${this.formMode?this.formContent:this.listContent}
      ${this.notificationMessage?this._renderNotificationMessage(this.notificationMessage):null}
      ${this._confirmZone}
    `}}customElements.define(D.is,D);
