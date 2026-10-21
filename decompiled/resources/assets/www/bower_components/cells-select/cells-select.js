{const KEYS={ENTER:13,SPACE:32,ESC:27,DOWN:40,UP:38,TAB:9},{html,Element,mixinBehaviors}=Polymer,{i18nBehavior}=CellsBehaviors;class CellsSelect extends mixinBehaviors([i18nBehavior],Element){static get is(){return"cells-select"}static get properties(){return{label:String,placeholder:String,icon:{type:String,value:"coronita:unfold"},iconSize:{type:Number,value:24},opened:{type:Boolean,value:!1,notify:!0,reflectToAttribute:!0,observer:"_openedChanged"},selected:{type:Number,notify:!0},selectedOption:{type:Object,readOnly:!0,notify:!0},value:{type:String,readOnly:!0,notify:!0},options:Array,noFocusOnClose:{type:Boolean,value:!1,observer:"_noFocusOnCloseChanged"},disabled:{type:Boolean,value:!1,reflectToAttribute:!0},readonly:{type:Boolean,value:!1,reflectToAttribute:!0},error:{type:Boolean,value:!1,reflectToAttribute:!0},errorMessage:{type:String},errorIcon:{type:String,value:"coronita:alert"},errorIconSize:{type:Number,value:20},_disabled:{type:Boolean,computed:"_computeDisabled(disabled, readonly)",observer:"_disabledChanged"},_options:{type:Array,computed:"_computeOptions(options)"},_label:String,_selection:{type:String,value:"",computed:"_computeSelection(_label, placeholder)"},_selectedItem:Object}}static get template(){return html`
        <style include="cells-select-styles cells-select-shared-styles"></style>
        ${this.customStyles}

        <div class="content">
          <div id="toggle" class="toggle"
            tabindex$="[[_computeTabindex(disabled)]]"
            role="button"
            aria-labelledby="listboxLabel listboxSelection"
            aria-haspopup="listbox"
            aria-expanded$="[[_booleanToString(opened)]]"
            aria-disabled$="[[_booleanToString(_disabled)]]"
            aria-invalid$="[[_booleanToString(error)]]"
            on-click="_onToggleClick"
            on-keydown="_onToggleKeydown"
            on-focus="_onFocus"
            on-blur="_onBlur">
            ${this.toggleTemplate}
          </div>

          <cells-select-list id="list" class="list"
            selected="{{selected}}"
            role="listbox"
            aria-labelledby="listboxLabel"
            hidden$="[[!opened]]"
            on-click="_onListClick"
            on-keydown="_onListKeydown"
            on-selected-item-changed="_onSelectedItemChanged">
            <dom-repeat items="[[_options]]" id="optionsList">
              <template>
                ${this.optionTemplate}
              </template>
            </dom-repeat>
            <slot></slot>
          </cells-select-list>
        </div>

        <dom-if if="[[error]]">
          <template>
            <cells-icon-message class="inline error-message"
              type="error"
              icon="[[errorIcon]]"
              icon-size="[[errorIconSize]]"
              message="[[errorMessage]]"
            ></cells-icon-message>
          </template>
        </dom-if>
      `}static get customStyles(){return html``}static get toggleTemplate(){return html`
        <div class="toggle__text" role="text">
          <div class$="toggle__label [[_computeLabelClass(_selection)]]" id="listboxLabel">[[t(label)]]</div>
          <div class="toggle__placeholder" id="listboxSelection">[[_selection]]</div>
        </div>
        
        <div class="toggle__icon">
          <iron-icon class="icon" icon="[[icon]]" style$="[[_computeSize(iconSize)]]"></iron-icon>
        </div>
      `}static get optionTemplate(){return html`
        <div class="option" role="option" aria-selected$="[[_computeAriaSelected(selected, index)]]">[[t(item.label)]]</div>
      `}static get observers(){return["_computeValueAndLabel(_selectedItem, selected, _options)","_computeSelectedOption(_selectedItem, selected, _options)"]}get _clickOrTouchEvent(){return"ontouchend"in document.documentElement?"touchend":"click"}ready(){super.ready();this._onClickOutside=this._onClickOutside.bind(this);this._onKeyUpOutside=this._onKeyUpOutside.bind(this)}connectedCallback(){super.connectedCallback();this._observer=new Polymer.FlattenedNodesObserver(this,info=>{info.target.childNodes.forEach(option=>{if(option.nodeType===Node.ELEMENT_NODE){option.setAttribute("role","option")}})})}disconnectedCallback(){super.disconnectedCallback();this._observer.disconnect()}_computeOptions(options){return options.map(option=>{return this._getLabelAndValueForTextOption(option)||option})}_getLabelAndValueForTextOption(option){if("string"===typeof option){return{label:option,value:option}}}_computeSelection(label,placeholder){return label||placeholder}_computeSize(size){return`width: ${size}px; height: ${size}px`}_computeLabelClass(selection){return!selection?"toggle__label--no-selection":""}_computeDisabled(disabled,readonly){return disabled||readonly}_computeValueAndLabel(selectedItem){let value,label;const selectedOption=this._getSelectedOption();if(selectedOption){({label,value}=selectedOption)}else if(selectedItem){label=selectedItem.textContent;value=selectedItem.dataset.optionValue}value=value||label;this._label=label;this._setValue(value)}_computeSelectedOption(selectedItem){let selectedOption=this._getSelectedOption();if(!selectedOption&&selectedItem){selectedOption=this._getItemDatasetOptions(selectedItem.dataset)}this._setSelectedOption(selectedOption)}_getSelectedOption(){const{_options:options,selected}=this;if(options&&options[selected]){return options[selected]}}_getItemDatasetOptions(dataset){const optionFollowedByUppercaseLetter=/^option[A-Z]/,hasDatasetOption=key=>optionFollowedByUppercaseLetter.test(key);return Object.entries(dataset).reduce((obj,[key,value])=>{if(hasDatasetOption(key)){const option=this._toLowerCase(key.split("option")[1]);obj[option]=value}return obj},{})}_toLowerCase(str){return str.charAt(0).toLowerCase()+str.slice(1)}_computeTabindex(disabled){return disabled?-1:0}_computeAriaSelected(selected,index){return selected===index?"true":!1}_booleanToString(value){return!!value+""}_noFocusOnCloseChanged(noFocusOnClose){if(this._originalNoFocusOnClose===void 0){this._originalNoFocusOnClose=noFocusOnClose}}_disabledChanged(disabled){if(disabled){this.opened=!1}}_openedChanged(opened,previousValue){if(opened){this.$.list.focus();this._addDocumentListeners()}else if(previousValue){this._setFocusOnClose();this._removeDocumentListeners()}}_addDocumentListeners(){document.body.addEventListener(this._clickOrTouchEvent,this._onClickOutside);document.body.addEventListener("keyup",this._onKeyUpOutside)}_removeDocumentListeners(){document.body.removeEventListener(this._clickOrTouchEvent,this._onClickOutside);document.body.removeEventListener("keyup",this._onKeyUpOutside)}_setFocusOnClose(){if(!this.noFocusOnClose){this.$.toggle.focus()}else{this.removeAttribute("focus-within")}}_onClickOutside(event){if(this._eventIsOutside(event)){this._closeWithoutFocusing()}}_onKeyUpOutside(event){if(this._isKey(event,"TAB")){this._closeWithoutFocusing()}}_closeWithoutFocusing(){this.noFocusOnClose=!0;this.opened=!1;this.noFocusOnClose=this._originalNoFocusOnClose}_isKey({keyCode},...keys){return-1!==keys.map(key=>KEYS[key]).indexOf(keyCode)}_eventIsOutside(event){return-1===event.composedPath().indexOf(this)}_onSelectedItemChanged(event){this._selectedItem=event.detail.value}_onToggleClick(){if(this._disabled){return}this.opened=!this.opened}_onToggleKeydown(event){if(this._disabled){return}if(this._isKey(event,"DOWN","UP","ENTER","SPACE")){event.preventDefault();this._openAndFocusList()}}_openAndFocusList(){this.opened=!0;this.$.list.focus()}_onListClick(){this.opened=!1}_onListKeydown(event){if(this._isKey(event,"ESC")){this.opened=!1}if(this._isKey(event,"ENTER","SPACE")){event.preventDefault();this._selectAndClose()}}_selectAndClose(){const focusedItem=this.$.list.focusedItem,selectedIndex=this.$.list.indexOf(focusedItem);this.selected=selectedIndex;this.opened=!1}_onFocus(){this.setAttribute("focus-within","")}_onBlur(){if(!this.opened){this.removeAttribute("focus-within")}}}window.customElements.define(CellsSelect.is,CellsSelect)}